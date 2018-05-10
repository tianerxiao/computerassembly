package group.computerAssembly.controller;

import group.computerAssembly.dto.Message;
import group.computerAssembly.dto.UserDto;
import group.computerAssembly.entity.UserAccount;
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
        UserDto userDto = userService.findUserById(request.getSession().getAttribute("userId").toString());
        userDto.getUserAccount().setUserPasswd("");
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
            message.setData("登录成功");
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
    @PostMapping("/user")
    public @ResponseBody
    Message postUser(HttpServletRequest requestc, @RequestBody UserAccount userAccount){
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
}
