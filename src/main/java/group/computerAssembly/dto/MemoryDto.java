package group.computerAssembly.dto;

import group.computerAssembly.entity.Memory;
import group.computerAssembly.entity.MemoryDetail;

public class MemoryDto {
    private Memory memory;
    private MemoryDetail memoryDetail;

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public MemoryDetail getMemoryDetail() {
        return memoryDetail;
    }

    public void setMemoryDetail(MemoryDetail memoryDetail) {
        this.memoryDetail = memoryDetail;
    }
}
