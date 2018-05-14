package group.computerAssembly.controller;

import group.computerAssembly.dto.Message;
import group.computerAssembly.dto.OrderDto;
import group.computerAssembly.entity.ComputerOrder;
import group.computerAssembly.entity.ComputerPart;
import group.computerAssembly.enums.MessageCode;
import group.computerAssembly.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

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
    @GetMapping("/order")
    public @ResponseBody
    Message getOrder(HttpServletRequest request){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        message.setData(orderService.getOrderList(userId));
        message.setCode(MessageCode.ok);
        return message;
    }
}
