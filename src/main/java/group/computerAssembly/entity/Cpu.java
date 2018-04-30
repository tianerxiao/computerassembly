package group.computerAssembly.entity;

public class Cpu {
    private Integer cpuId;

    private String cpuName;

    private String cpuPrice;

    private String cpuHref;

    private String cpuDescribe;

    public Cpu(Integer cpuId, String cpuName, String cpuPrice, String cpuHref, String cpuDescribe) {
        this.cpuId = cpuId;
        this.cpuName = cpuName;
        this.cpuPrice = cpuPrice;
        this.cpuHref = cpuHref;
        this.cpuDescribe = cpuDescribe;
    }

    public Cpu() {
        super();
    }

    public Integer getCpuId() {
        return cpuId;
    }

    public void setCpuId(Integer cpuId) {
        this.cpuId = cpuId;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName == null ? null : cpuName.trim();
    }

    public String getCpuPrice() {
        return cpuPrice;
    }

    public void setCpuPrice(String cpuPrice) {
        this.cpuPrice = cpuPrice == null ? null : cpuPrice.trim();
    }

    public String getCpuHref() {
        return cpuHref;
    }

    public void setCpuHref(String cpuHref) {
        this.cpuHref = cpuHref == null ? null : cpuHref.trim();
    }

    public String getCpuDescribe() {
        return cpuDescribe;
    }

    public void setCpuDescribe(String cpuDescribe) {
        this.cpuDescribe = cpuDescribe == null ? null : cpuDescribe.trim();
    }
}