package group.computerAssembly.entity;

public class CpuDetail {
    private Integer cpudId;

    private String cpudName;

    private String cpudVendor;

    private String cpudCore;

    private String cpudMainfreq;

    private String cpudCraft;

    public CpuDetail(Integer cpudId, String cpudName, String cpudVendor, String cpudCore, String cpudMainfreq, String cpudCraft) {
        this.cpudId = cpudId;
        this.cpudName = cpudName;
        this.cpudVendor = cpudVendor;
        this.cpudCore = cpudCore;
        this.cpudMainfreq = cpudMainfreq;
        this.cpudCraft = cpudCraft;
    }

    public CpuDetail() {
        super();
    }

    public Integer getCpudId() {
        return cpudId;
    }

    public void setCpudId(Integer cpudId) {
        this.cpudId = cpudId;
    }

    public String getCpudName() {
        return cpudName;
    }

    public void setCpudName(String cpudName) {
        this.cpudName = cpudName == null ? null : cpudName.trim();
    }

    public String getCpudVendor() {
        return cpudVendor;
    }

    public void setCpudVendor(String cpudVendor) {
        this.cpudVendor = cpudVendor == null ? null : cpudVendor.trim();
    }

    public String getCpudCore() {
        return cpudCore;
    }

    public void setCpudCore(String cpudCore) {
        this.cpudCore = cpudCore == null ? null : cpudCore.trim();
    }

    public String getCpudMainfreq() {
        return cpudMainfreq;
    }

    public void setCpudMainfreq(String cpudMainfreq) {
        this.cpudMainfreq = cpudMainfreq == null ? null : cpudMainfreq.trim();
    }

    public String getCpudCraft() {
        return cpudCraft;
    }

    public void setCpudCraft(String cpudCraft) {
        this.cpudCraft = cpudCraft == null ? null : cpudCraft.trim();
    }
}