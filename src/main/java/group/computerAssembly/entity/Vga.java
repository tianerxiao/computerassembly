package group.computerAssembly.entity;

public class Vga {
    private Integer vgaId;

    private String vgaName;

    private String vgaPrice;

    private String vgaDescribe;

    private String vgaHref;

    public Vga(Integer vgaId, String vgaName, String vgaPrice, String vgaDescribe, String vgaHref) {
        this.vgaId = vgaId;
        this.vgaName = vgaName;
        this.vgaPrice = vgaPrice;
        this.vgaDescribe = vgaDescribe;
        this.vgaHref = vgaHref;
    }

    public Vga() {
        super();
    }

    public Integer getVgaId() {
        return vgaId;
    }

    public void setVgaId(Integer vgaId) {
        this.vgaId = vgaId;
    }

    public String getVgaName() {
        return vgaName;
    }

    public void setVgaName(String vgaName) {
        this.vgaName = vgaName == null ? null : vgaName.trim();
    }

    public String getVgaPrice() {
        return vgaPrice;
    }

    public void setVgaPrice(String vgaPrice) {
        this.vgaPrice = vgaPrice == null ? null : vgaPrice.trim();
    }

    public String getVgaDescribe() {
        return vgaDescribe;
    }

    public void setVgaDescribe(String vgaDescribe) {
        this.vgaDescribe = vgaDescribe == null ? null : vgaDescribe.trim();
    }

    public String getVgaHref() {
        return vgaHref;
    }

    public void setVgaHref(String vgaHref) {
        this.vgaHref = vgaHref == null ? null : vgaHref.trim();
    }
}