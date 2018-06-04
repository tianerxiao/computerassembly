package group.computerAssembly.controller;

import group.computerAssembly.dto.Message;
import group.computerAssembly.dto.UserDto;
import group.computerAssembly.entity.UserAccount;
import group.computerAssembly.entity.UserInfo;
import group.computerAssembly.entity.UserRole;
import group.computerAssembly.enums.MessageCode;
import group.computerAssembly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 获取登录会话
     */
    @GetMapping("/session")
    public @ResponseBody
    Message getSession(HttpServletRequest request){
        Message msg = new Message();
        if(request.getSession().getAttribute("userId")==null){
            msg.setData("未登录");
            msg.setCode(MessageCode.nologin);
            return msg;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        UserDto userDto = userService.findUserById(userId);
        userDto.getUserAccount().setUserPasswd("");
        userDto.setUserRole(userService.getUserRole(userId));
        msg.setData(userDto);
        msg.setCode(MessageCode.ok);
        return msg;
    }
    /**
     * 新增登录会话
     */
    @PostMapping("/session")
    public @ResponseBody
    Message postSession(HttpServletRequest request, @RequestBody UserAccount userAccount){
        Message message = new Message();
        if (userAccount.getUserId()==null){
            message.setCode(MessageCode.error);
            message.setData("账号不能为空");
            return message;
        }
        if(userAccount.getUserPasswd()==null){
            message.setCode(MessageCode.error);
            message.setData("密码不能为空");
            return message;
        }
        if (userService.matchPassword(userAccount)){
            message.setCode(MessageCode.ok);
            message.setData(userService.findUserById(userAccount.getUserId()));
            request.getSession().setAttribute("userId",userAccount.getUserId());
            return message;
        }else {
            message.setCode(MessageCode.error);
            message.setData("密码错误");
            return message;
        }
    }
    /**
     * 删除登录会话
     */
    @DeleteMapping("/session")
    public @ResponseBody
    Message deleteSession(HttpServletRequest request){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setCode(100);
            message.setData("尚未登录");
            return message;
        }else {
            try {
                request.getSession().removeAttribute("userId");
                message.setCode(200);
                message.setData("注销成功");
                return message;
            }catch (Exception e){
                e.printStackTrace();
                message.setCode(100);
                message.setData(e.getMessage());
                return message;
            }
        }
    }
    /**
     * 注册新用户
     */
    @PostMapping("/user-account")
    public @ResponseBody
    Message postUserAccount(HttpServletRequest request, @RequestBody UserAccount userAccount){
        Message message = new Message();
        if (userAccount.getUserId()==null){
            message.setCode(MessageCode.error);
            message.setData("账号不能为空");
            return message;
        }
        if(userAccount.getUserPasswd()==null){
            message.setCode(MessageCode.error);
            message.setData("密码不能为空");
            return message;
        }
        UserDto userDto = userService.findUserById(userAccount.getUserId());
        UserAccount account = userDto.getUserAccount();

        if(account ==null){
            try {
                userService.addNewUser(userAccount);
                message.setCode(MessageCode.ok);
                message.setData("注册成功");
                return message;
            }catch (Exception e){
                e.printStackTrace();
                message.setCode(MessageCode.error);
                message.setData("未知错误");
                return message;
            }
        }else {
            message.setCode(MessageCode.error);
            message.setData("用户名已存在");
            return message;
        }
    }
    /**
    *修改密码
    */
    @PutMapping("/user-account")
    public @ResponseBody
    Message putUserAccount(HttpServletRequest request,@RequestBody UserAccount userAccount){
        Message message = new Message();
        if(userAccount.getUserId() == null){
            message.setCode(MessageCode.error);
            message.setData("新密码不能为空");
            return message;
        }
        if (userAccount.getUserPasswd() == null){
            message.setCode(MessageCode.error);
            message.setData("旧密码不能为空");
            return message;
        }
        String newPassword = userAccount.getUserId();
        userAccount.setUserId(request.getSession().getAttribute("userId").toString());
        if (userService.matchPassword(userAccount)){
            try {
                userService.modifyPassword(userAccount,newPassword);
                message.setCode(MessageCode.ok);
                message.setData("修改成功");
                return message;
            }catch (Exception e){
                e.printStackTrace();
                message.setCode(MessageCode.error);
                message.setData("修改失败");
                return message;
            }
        }else {
            message.setCode(MessageCode.error);
            message.setData("密码错误");
            return message;
        }
    }
    /**
     * 更新信息
     */
    @PutMapping("/user-info")
    public @ResponseBody
    Message putUserInfo(HttpServletRequest request, @RequestBody UserInfo userInfo){
        Message msg = new Message();
        String userId = request.getSession().getAttribute("userId").toString();
        if(userId==null){
            msg.setData("未登录");
            msg.setCode(MessageCode.nologin);
            return msg;
        }
        userInfo.setUserId(userId);
        userService.updateUserInfo(userInfo);
        msg.setCode(MessageCode.ok);
        msg.setData("修改成功");
        return msg;
    }

    @GetMapping("/userList")
    public @ResponseBody
    Message getUserList(HttpServletRequest request){
        Message msg = new Message();
        String userId = request.getSession().getAttribute("userId").toString();
        if(userId==null){
            msg.setData("未登录");
            msg.setCode(MessageCode.nologin);
            return msg;
        }
        if(userService.getUserRole(userId).getUserRole() == 2){
            msg.setData(userService.getUserList());
            msg.setCode(MessageCode.ok);
            return msg;
        }else {
            msg.setData("无权限");
            msg.setCode(MessageCode.forbidden);
            return msg;
        }
    }

    @PutMapping("/user-role")
    public @ResponseBody
    Message putUserRole(HttpServletRequest request, @RequestBody UserRole userRole){
        Message msg = new Message();
        if(request.getSession().getAttribute("userId")==null){
            msg.setData("未登录");
            msg.setCode(MessageCode.nologin);
            return msg;
        }
        String sessionId = request.getSession().getAttribute("userId").toString();
        if(userService.findUserById(sessionId).getUserRole().getUserRole() ==2){
            try {
                userService.updateUserRole(userRole.getUserId(),userRole.getUserRole());
                msg.setData("更新成功");
                msg.setCode(MessageCode.ok);
                return msg;
            }catch (Exception e){
                e.printStackTrace();
                msg.setData("更新失败");
                msg.setCode(MessageCode.ok);
                return msg;
            }
        }else {
            msg.setData("无权限");
            msg.setCode(MessageCode.forbidden);
            return msg;
        }
    }
    @DeleteMapping("/user-role")
    public @ResponseBody
    Message deleteUserRole(HttpServletRequest request,@RequestParam("userId") String userId){
        Message msg = new Message();
        if(request.getSession().getAttribute("userId")==null){
            msg.setData("未登录");
            msg.setCode(MessageCode.nologin);
            return msg;
        }
        String sessionId = request.getSession().getAttribute("userId").toString();
        if(userService.findUserById(sessionId).getUserRole().getUserRole() ==2){
            try {
                userService.updateUserRole(userId,1);
                msg.setData("更新成功");
                msg.setCode(MessageCode.ok);
                return msg;
            }catch (Exception e){
                e.printStackTrace();
                msg.setData("更新失败");
                msg.setCode(MessageCode.ok);
                return msg;
            }
        }else {
            msg.setData("无权限");
            msg.setCode(MessageCode.forbidden);
            return msg;
        }
    }
}
