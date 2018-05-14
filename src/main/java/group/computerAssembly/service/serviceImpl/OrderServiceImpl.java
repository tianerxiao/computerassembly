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
    public List<OrderDto> getOrderList(String userId){
        List<OrderDto> orderDtoList = new ArrayList<OrderDto>();
        ComputerOrderExample computerOrderExample = new ComputerOrderExample();
        ComputerOrderExample.Criteria criteria1 = computerOrderExample.createCriteria();
        criteria1.andUserIdEqualTo(userId);
        List<ComputerOrder> computerOrderList = computerOrderMapper.selectByExample(computerOrderExample);
        ComputerPartExample computerPartExample = new ComputerPartExample();
        ComputerPartExample.Criteria criteria2 = computerPartExample.createCriteria();
        criteria2.andUserIdEqualTo(userId);
        List<ComputerPart> computerPartList = computerPartMapper.selectByExample(computerPartExample);
        for (Integer i = 0; i<computerPartList.size(); i++){
            OrderDto orderDto = new OrderDto();
            orderDto.setComputerOrder(computerOrderList.get(i));
            ComputerPart computerPart1 = computerPartList.get(i);
            orderDto.setComputerPart(computerPart1);
            orderDtoList.add(orderDto);
        }
        return orderDtoList;
    }
}
