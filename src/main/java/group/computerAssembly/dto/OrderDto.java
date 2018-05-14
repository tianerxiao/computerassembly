package group.computerAssembly.dto;

import group.computerAssembly.entity.ComputerOrder;
import group.computerAssembly.entity.ComputerPart;

public class OrderDto {
    private ComputerOrder computerOrder;
    private ComputerPart computerPart;

    public ComputerOrder getComputerOrder() {
        return computerOrder;
    }

    public void setComputerOrder(ComputerOrder computerOrder) {
        this.computerOrder = computerOrder;
    }

    public ComputerPart getComputerPart() {
        return computerPart;
    }

    public void setComputerPart(ComputerPart computerPart) {
        this.computerPart = computerPart;
    }
}
