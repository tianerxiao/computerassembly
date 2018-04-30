package group.computerAssembly.entity;

public class Power {
    private Integer powerId;

    private String powerName;

    private String powerPrice;

    private String powerHref;

    private String powerDescribe;

    public Power(Integer powerId, String powerName, String powerPrice, String powerHref, String powerDescribe) {
        this.powerId = powerId;
        this.powerName = powerName;
        this.powerPrice = powerPrice;
        this.powerHref = powerHref;
        this.powerDescribe = powerDescribe;
    }

    public Power() {
        super();
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getPowerPrice() {
        return powerPrice;
    }

    public void setPowerPrice(String powerPrice) {
        this.powerPrice = powerPrice == null ? null : powerPrice.trim();
    }

    public String getPowerHref() {
        return powerHref;
    }

    public void setPowerHref(String powerHref) {
        this.powerHref = powerHref == null ? null : powerHref.trim();
    }

    public String getPowerDescribe() {
        return powerDescribe;
    }

    public void setPowerDescribe(String powerDescribe) {
        this.powerDescribe = powerDescribe == null ? null : powerDescribe.trim();
    }
}