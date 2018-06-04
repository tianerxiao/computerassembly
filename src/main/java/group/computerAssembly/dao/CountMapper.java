package group.computerAssembly.dao;

import group.computerAssembly.entity.ComputerPart;
import group.computerAssembly.entity.Count;

import java.util.List;

public interface CountMapper {
    List<Count> getOrderCount();
    List<Count> getAccountCount();
    List<Count> getOrderPriceSum();
    List<Count> getOrderCountMonth();
    List<Count> getAccountCountMonth();
    List<Count> getOrderPriceSumMonth();
    List<ComputerPart> getPartByRand();
}
