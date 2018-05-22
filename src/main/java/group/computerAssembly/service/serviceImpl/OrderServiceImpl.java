package group.computerAssembly.service.serviceImpl;

import group.computerAssembly.dao.*;
import group.computerAssembly.dto.OrderDto;
import group.computerAssembly.entity.ComputerOrder;
import group.computerAssembly.entity.ComputerOrderExample;
import group.computerAssembly.entity.ComputerPart;
import group.computerAssembly.entity.ComputerPartExample;
import group.computerAssembly.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {
    @Autowired
    ComputerPartMapper computerPartMapper;
    @Autowired
    ComputerOrderMapper computerOrderMapper;
    @Autowired
    CpuMapper cpuMapper;
    @Autowired
    BoardMapper boardMapper;
    @Autowired
    MemoryMapper memoryMapper;
    @Autowired
    VgaMapper vgaMapper;
    @Autowired
    PowerMapper powerMapper;

    @Override
    public void addComputerOrder(ComputerPart computerPart, ComputerOrder computerOrder) {
        computerOrder.setUserId(computerPart.getUserId());
        computerOrder.setOrderId(UUID.randomUUID().toString().replace("-",""));
        computerPart.setPartTableId(UUID.randomUUID().toString().replace("-",""));
        computerOrder.setPartTableId(computerPart.getPartTableId());
        computerOrderMapper.insertSelective(computerOrder);
        computerPartMapper.insertSelective(computerPart);
    }
    @Override
    public ComputerOrder getComputerOrder(ComputerOrder computerOrder){
        return computerOrderMapper.selectByPrimaryKey(computerOrder.getOrderId());
    }
    @Override
    public ComputerPart getComputerPart(ComputerPart computerPart) {
        return computerPartMapper.selectByPrimaryKey(computerPart.getPartTableId());
    }
    @Override
    public List<OrderDto> getNotPayOrderList(String userId){
        List<OrderDto> orderDtoList = new ArrayList<OrderDto>();
        ComputerOrderExample computerOrderExample = new ComputerOrderExample();
        ComputerOrderExample.Criteria criteria1 = computerOrderExample.createCriteria();
        if(!"super".equals(userId)){
            criteria1.andUserIdEqualTo(userId);
        }
        criteria1.andPayIsNull();
        List<ComputerOrder> computerOrderList = computerOrderMapper.selectByExample(computerOrderExample);

        for (Integer i = 0; i<computerOrderList.size(); i++){
            OrderDto orderDto = new OrderDto();
            orderDto.setComputerOrder(computerOrderList.get(i));
            ComputerPart computerPart1 = computerPartMapper.selectByPrimaryKey(computerOrderList.get(i).getPartTableId());
            orderDto.setComputerPart(computerPart1);
            orderDtoList.add(orderDto);
        }
        return orderDtoList;
    }
    @Override
    public List<OrderDto> getNotExpOrderList(String userId){
        List<OrderDto> orderDtoList = new ArrayList<OrderDto>();
        ComputerOrderExample computerOrderExample = new ComputerOrderExample();
        ComputerOrderExample.Criteria criteria1 = computerOrderExample.createCriteria();
        if(!"super".equals(userId)){
            criteria1.andUserIdEqualTo(userId);
        }
        criteria1.andExpressIsNull();
        criteria1.andPayEqualTo("已付款");
        List<ComputerOrder> computerOrderList = computerOrderMapper.selectByExample(computerOrderExample);

        for (Integer i = 0; i<computerOrderList.size(); i++){
            OrderDto orderDto = new OrderDto();
            orderDto.setComputerOrder(computerOrderList.get(i));
            ComputerPart computerPart1 = computerPartMapper.selectByPrimaryKey(computerOrderList.get(i).getPartTableId());
            orderDto.setComputerPart(computerPart1);
            orderDtoList.add(orderDto);
        }
        return orderDtoList;
    }
    @Override
    public List<OrderDto> getNotSignOrderList(String userId){
        List<OrderDto> orderDtoList = new ArrayList<OrderDto>();
        ComputerOrderExample computerOrderExample = new ComputerOrderExample();
        ComputerOrderExample.Criteria criteria1 = computerOrderExample.createCriteria();
        if(!"super".equals(userId)){
            criteria1.andUserIdEqualTo(userId);
        }
        criteria1.andSignIsNull();
        criteria1.andPayEqualTo("已付款");
        criteria1.andExpressIsNotNull();
        criteria1.andCommentIsNull();
        List<ComputerOrder> computerOrderList = computerOrderMapper.selectByExample(computerOrderExample);

        for (Integer i = 0; i<computerOrderList.size(); i++){
            OrderDto orderDto = new OrderDto();
            orderDto.setComputerOrder(computerOrderList.get(i));
            ComputerPart computerPart1 = computerPartMapper.selectByPrimaryKey(computerOrderList.get(i).getPartTableId());
            orderDto.setComputerPart(computerPart1);
            orderDtoList.add(orderDto);
        }
        return orderDtoList;
    }
    @Override
    public List<OrderDto> getPayOrderList(String userId){
        List<OrderDto> orderDtoList = new ArrayList<OrderDto>();
        ComputerOrderExample computerOrderExample = new ComputerOrderExample();
        ComputerOrderExample.Criteria criteria1 = computerOrderExample.createCriteria();
        if(!"super".equals(userId)){
            criteria1.andUserIdEqualTo(userId);
        }
        criteria1.andPayEqualTo("已发货");
        criteria1.andExpressIsNull();
        List<ComputerOrder> computerOrderList = computerOrderMapper.selectByExample(computerOrderExample);

        for (Integer i = 0; i<computerOrderList.size(); i++){
            OrderDto orderDto = new OrderDto();
            orderDto.setComputerOrder(computerOrderList.get(i));
            ComputerPart computerPart1 = computerPartMapper.selectByPrimaryKey(computerOrderList.get(i).getPartTableId());
            orderDto.setComputerPart(computerPart1);
            orderDtoList.add(orderDto);
        }
        return orderDtoList;
    }
    @Override
    public List<OrderDto> getExpOrderList(String userId){
        List<OrderDto> orderDtoList = new ArrayList<OrderDto>();
        ComputerOrderExample computerOrderExample = new ComputerOrderExample();
        ComputerOrderExample.Criteria criteria1 = computerOrderExample.createCriteria();
        if(!"super".equals(userId)){
            criteria1.andUserIdEqualTo(userId);
        }
        criteria1.andExpressIsNotNull();
        criteria1.andSignIsNull();
        List<ComputerOrder> computerOrderList = computerOrderMapper.selectByExample(computerOrderExample);

        for (Integer i = 0; i<computerOrderList.size(); i++){
            OrderDto orderDto = new OrderDto();
            orderDto.setComputerOrder(computerOrderList.get(i));
            ComputerPart computerPart1 = computerPartMapper.selectByPrimaryKey(computerOrderList.get(i).getPartTableId());
            orderDto.setComputerPart(computerPart1);
            orderDtoList.add(orderDto);
        }
        return orderDtoList;
    }
    @Override
    public List<OrderDto> getSignOrderList(String userId){
        List<OrderDto> orderDtoList = new ArrayList<OrderDto>();
        ComputerOrderExample computerOrderExample = new ComputerOrderExample();
        ComputerOrderExample.Criteria criteria1 = computerOrderExample.createCriteria();
        if(!"super".equals(userId)){
            criteria1.andUserIdEqualTo(userId);
        }
        criteria1.andSignEqualTo("已签收");
        criteria1.andCommentIsNotNull();
        List<ComputerOrder> computerOrderList = computerOrderMapper.selectByExample(computerOrderExample);

        for (Integer i = 0; i<computerOrderList.size(); i++){
            OrderDto orderDto = new OrderDto();
            orderDto.setComputerOrder(computerOrderList.get(i));
            ComputerPart computerPart1 = computerPartMapper.selectByPrimaryKey(computerOrderList.get(i).getPartTableId());
            orderDto.setComputerPart(computerPart1);
            orderDtoList.add(orderDto);
        }
        return orderDtoList;
    }
    @Override
    public void updateComputerOrderByKey(ComputerOrder computerOrder) {
        computerOrderMapper.updateByPrimaryKeySelective(computerOrder);
    }
    @Override
    public void deleteComputerOrderByKey(ComputerOrder computerOrder){
        computerOrderMapper.deleteByPrimaryKey(computerOrder.getOrderId());
    }
}
