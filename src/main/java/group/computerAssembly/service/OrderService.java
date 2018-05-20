package group.computerAssembly.service;

import group.computerAssembly.dto.OrderDto;
import group.computerAssembly.entity.ComputerOrder;
import group.computerAssembly.entity.ComputerPart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    void addComputerOrder(ComputerPart computerPart, ComputerOrder computerOrder);

    void updateComputerOrderByKey(ComputerOrder computerOrder);

    ComputerOrder getComputerOrder(ComputerOrder computerOrder);

    ComputerPart getComputerPart(ComputerPart computerPart);

    List<OrderDto> getNotPayOrderList(String userId);

    List<OrderDto> getNotExpOrderList(String userId);

    List<OrderDto> getNotSignOrderList(String userId);

    List<OrderDto> getPayOrderList(String userId);

    List<OrderDto> getExpOrderList(String userId);

    List<OrderDto> getSignOrderList(String userId);

    void deleteComputerOrderByKey(ComputerOrder computerOrder);
}
