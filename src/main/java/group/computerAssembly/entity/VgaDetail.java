package group.computerAssembly.entity;

public class VgaDetail {
    private Integer vgadId;

    private String vgadName;

    private String vgadVender;

    private String vgadModel;

    private String vgadMemory;

    private String vgadCore;

    public VgaDetail(Integer vgadId, String vgadName, String vgadVender, String vgadModel, String vgadMemory, String vgadCore) {
        this.vgadId = vgadId;
        this.vgadName = vgadName;
        this.vgadVender = vgadVender;
        this.vgadModel = vgadModel;
        this.vgadMemory = vgadMemory;
        this.vgadCore = vgadCore;
    }

    public VgaDetail() {
        super();
    }

    public Integer getVgadId() {
        return vgadId;
    }

    public void setVgadId(Integer vgadId) {
        this.vgadId = vgadId;
    }

    public String getVgadName() {
        return vgadName;
    }

    public void setVgadName(String vgadName) {
        this.vgadName = vgadName == null ? null : vgadName.trim();
    }

    public String getVgadVender() {
        return vgadVender;
    }

    public void setVgadVender(String vgadVender) {
        this.vgadVender = vgadVender == null ? null : vgadVender.trim();
    }

    public String getVgadModel() {
        return vgadModel;
    }

    public void setVgadModel(String vgadModel) {
        this.vgadModel = vgadModel == null ? null : vgadModel.trim();
    }

    public String getVgadMemory() {
        return vgadMemory;
    }

    public void setVgadMemory(String vgadMemory) {
        this.vgadMemory = vgadMemory == null ? null : vgadMemory.trim();
    }

    public String getVgadCore() {
        return vgadCore;
    }

    public void setVgadCore(String vgadCore) {
        this.vgadCore = vgadCore == null ? null : vgadCore.trim();
    }
}