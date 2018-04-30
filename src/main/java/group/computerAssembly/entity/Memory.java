package group.computerAssembly.entity;

public class Memory {
    private Integer memId;

    private String memName;

    private String memPrice;

    private String memHref;

    private String memDescribe;

    public Memory(Integer memId, String memName, String memPrice, String memHref, String memDescribe) {
        this.memId = memId;
        this.memName = memName;
        this.memPrice = memPrice;
        this.memHref = memHref;
        this.memDescribe = memDescribe;
    }

    public Memory() {
        super();
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName == null ? null : memName.trim();
    }

    public String getMemPrice() {
        return memPrice;
    }

    public void setMemPrice(String memPrice) {
        this.memPrice = memPrice == null ? null : memPrice.trim();
    }

    public String getMemHref() {
        return memHref;
    }

    public void setMemHref(String memHref) {
        this.memHref = memHref == null ? null : memHref.trim();
    }

    public String getMemDescribe() {
        return memDescribe;
    }

    public void setMemDescribe(String memDescribe) {
        this.memDescribe = memDescribe == null ? null : memDescribe.trim();
    }
}