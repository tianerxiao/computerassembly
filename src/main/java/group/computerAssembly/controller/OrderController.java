package group.computerAssembly.controller;

import group.computerAssembly.dto.Message;
import group.computerAssembly.dto.OrderDto;
import group.computerAssembly.entity.ComputerOrder;
import group.computerAssembly.entity.ComputerPart;
import group.computerAssembly.enums.MessageCode;
import group.computerAssembly.service.OrderService;
import group.computerAssembly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    UserService userService;

    @PostMapping("/order")
    public @ResponseBody
    Message postOrder(HttpServletRequest request, @RequestBody OrderDto orderDto){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        ComputerPart computerPart= orderDto.getComputerPart();
        ComputerOrder computerOrder = orderDto.getComputerOrder();
        computerPart.setUserId(userId);
        computerOrder.setUserId(userId);
        try {
            orderService.addComputerOrder(computerPart,computerOrder);
        } catch (Exception e){
            e.printStackTrace();
            message.setCode(MessageCode.error);
            message.setData("提交错误");
            return message;
        }
        message.setCode(MessageCode.ok);
        message.setData("订单提交完成");
        return message;
    }

    @PutMapping("/order")
    public @ResponseBody
    Message putOrder(HttpServletRequest request,@RequestBody ComputerOrder computerOrder){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        try {
            orderService.updateComputerOrderByKey(computerOrder);
        } catch (Exception e){
            e.printStackTrace();
            message.setCode(MessageCode.error);
            message.setData("提交错误");
            return message;
        }
        message.setCode(MessageCode.ok);
        message.setData("提交成功");
        return message;
    }

    @DeleteMapping("/order")
    public @ResponseBody
    Message deleteOrder(HttpServletRequest request,@RequestBody ComputerOrder computerOrder){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        try {
            orderService.deleteComputerOrderByKey(computerOrder);
        } catch (Exception e){
            e.printStackTrace();
            message.setCode(MessageCode.error);
            message.setData("提交错误");
            return message;
        }
        message.setCode(MessageCode.ok);
        message.setData("订单已取消");
        return message;
    }

    @GetMapping("/notPayOrder")
    public @ResponseBody
    Message getNotPayOrder(HttpServletRequest request){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        if(userService.findUserById(userId).getUserRole().getUserRole() == 2){
            userId = "super";
        }
        message.setData(orderService.getNotPayOrderList(userId));
        message.setCode(MessageCode.ok);
        return message;
    }

    @GetMapping("/notExpOrder")
    public @ResponseBody
    Message getNotExpOrder(HttpServletRequest request){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        if(userService.findUserById(userId).getUserRole().getUserRole() == 2){
            userId = "super";
        }
        message.setData(orderService.getNotExpOrderList(userId));
        message.setCode(MessageCode.ok);
        return message;
    }

    @GetMapping("/notSignOrder")
    public @ResponseBody
    Message getNotSignOrder(HttpServletRequest request){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        if(userService.findUserById(userId).getUserRole().getUserRole() == 2){
            userId = "super";
        }
        message.setData(orderService.getNotSignOrderList(userId));
        message.setCode(MessageCode.ok);
        return message;
    }

    @GetMapping("/signOrder")
    public @ResponseBody
    Message getSignOrder(HttpServletRequest request){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        if(userService.findUserById(userId).getUserRole().getUserRole() == 2){
            userId = "super";
        }
        message.setData(orderService.getSignOrderList(userId));
        message.setCode(MessageCode.ok);
        return message;
    }
}
