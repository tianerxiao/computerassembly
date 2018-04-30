package group.computerAssembly.dto;

import group.computerAssembly.entity.Vga;
import group.computerAssembly.entity.VgaDetail;

public class VgaDto {
    private Vga vga;
    private VgaDetail vgaDetail;

    public Vga getVga() {
        return vga;
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }

    public VgaDetail getVgaDetail() {
        return vgaDetail;
    }

    public void setVgaDetail(VgaDetail vgaDetail) {
        this.vgaDetail = vgaDetail;
    }
}
