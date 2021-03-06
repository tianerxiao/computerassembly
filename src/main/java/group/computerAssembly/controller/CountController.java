package group.computerAssembly.controller;

import group.computerAssembly.dao.CountMapper;
import group.computerAssembly.dto.Message;
import group.computerAssembly.enums.MessageCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/count")
public class CountController {
    @Autowired
    CountMapper countMapper;

    @GetMapping("/orderCount")
    public @ResponseBody
    Message getOrderCount(){
        Message message = new Message();
        message.setData(countMapper.getOrderCount());
        message.setCode(MessageCode.ok);
        return message;
    }
    @GetMapping("/orderPriceSum")
    public @ResponseBody
    Message getOrderPriceSum(){
        Message message = new Message();
        message.setData(countMapper.getOrderPriceSum());
        message.setCode(MessageCode.ok);
        return message;
    }
    @GetMapping("/accountCount")
    public @ResponseBody
    Message getAccountCount(){
        Message message = new Message();
        message.setData(countMapper.getAccountCount());
        message.setCode(MessageCode.ok);
        return message;
    }
    @GetMapping("/orderCountMonth")
    public @ResponseBody
    Message getOrderCountMonth(){
        Message message = new Message();
        message.setData(countMapper.getOrderCountMonth());
        message.setCode(MessageCode.ok);
        return message;
    }
    @GetMapping("/orderPriceSumMonth")
    public @ResponseBody
    Message getOrderPriceSumMonth(){
        Message message = new Message();
        message.setData(countMapper.getOrderPriceSumMonth());
        message.setCode(MessageCode.ok);
        return message;
    }
    @GetMapping("/accountCountMonth")
    public @ResponseBody
    Message getAccountCountMonth(){
        Message message = new Message();
        message.setData(countMapper.getAccountCountMonth());
        message.setCode(MessageCode.ok);
        return message;
    }
}
