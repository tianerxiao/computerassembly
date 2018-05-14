package group.computerAssembly.service;

import group.computerAssembly.dto.OrderDto;
import group.computerAssembly.entity.ComputerOrder;
import group.computerAssembly.entity.ComputerPart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    void addComputerOrder(ComputerPart computerPart, ComputerOrder computerOrder);
    ComputerOrder getComputerOrder(ComputerOrder computerOrder);
    ComputerPart getComputerPart(ComputerPart computerPart);
    List<OrderDto> getOrderList(String userId);
}
