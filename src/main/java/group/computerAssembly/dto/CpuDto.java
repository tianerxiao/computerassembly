package group.computerAssembly.dto;

import group.computerAssembly.entity.Cpu;
import group.computerAssembly.entity.CpuDetail;

public class CpuDto {
    private Cpu cpu;
    private CpuDetail cpuDetail;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public CpuDetail getCpuDetail() {
        return cpuDetail;
    }

    public void setCpuDetail(CpuDetail cpuDetail) {
        this.cpuDetail = cpuDetail;
    }
}
