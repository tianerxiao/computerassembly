package group.computerAssembly.entity;

public class PowerDetail {
    private Integer powerdId;

    private String powerdName;

    private String powerdPower;

    private String powerdStandard;

    public PowerDetail(Integer powerdId, String powerdName, String powerdPower, String powerdStandard) {
        this.powerdId = powerdId;
        this.powerdName = powerdName;
        this.powerdPower = powerdPower;
        this.powerdStandard = powerdStandard;
    }

    public PowerDetail() {
        super();
    }

    public Integer getPowerdId() {
        return powerdId;
    }

    public void setPowerdId(Integer powerdId) {
        this.powerdId = powerdId;
    }

    public String getPowerdName() {
        return powerdName;
    }

    public void setPowerdName(String powerdName) {
        this.powerdName = powerdName == null ? null : powerdName.trim();
    }

    public String getPowerdPower() {
        return powerdPower;
    }

    public void setPowerdPower(String powerdPower) {
        this.powerdPower = powerdPower == null ? null : powerdPower.trim();
    }

    public String getPowerdStandard() {
        return powerdStandard;
    }

    public void setPowerdStandard(String powerdStandard) {
        this.powerdStandard = powerdStandard == null ? null : powerdStandard.trim();
    }
}