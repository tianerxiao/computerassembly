package group.computerAssembly.entity;

public class Cpu {
    private Integer cpuId;

    private String cpuName;

    private String cpuPrice;

    private String cpuDescribe;

    private String cpuHref;

    public Cpu(Integer cpuId, String cpuName, String cpuPrice, String cpuDescribe, String cpuHref) {
        this.cpuId = cpuId;
        this.cpuName = cpuName;
        this.cpuPrice = cpuPrice;
        this.cpuDescribe = cpuDescribe;
        this.cpuHref = cpuHref;
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

    public String getCpuDescribe() {
        return cpuDescribe;
    }

    public void setCpuDescribe(String cpuDescribe) {
        this.cpuDescribe = cpuDescribe == null ? null : cpuDescribe.trim();
    }

    public String getCpuHref() {
        return cpuHref;
    }

    public void setCpuHref(String cpuHref) {
        this.cpuHref = cpuHref == null ? null : cpuHref.trim();
    }
}