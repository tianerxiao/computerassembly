package group.computerAssembly.entity;

import java.util.Date;

public class ComputerPart {
    private String userId;

    private Integer cpuId;

    private Integer cpudId;

    private Integer memId;

    private Integer powerId;

    private Integer vgaId;

    private Date createTime;

    public ComputerPart(String userId, Integer cpuId, Integer cpudId, Integer memId, Integer powerId, Integer vgaId, Date createTime) {
        this.userId = userId;
        this.cpuId = cpuId;
        this.cpudId = cpudId;
        this.memId = memId;
        this.powerId = powerId;
        this.vgaId = vgaId;
        this.createTime = createTime;
    }

    public ComputerPart() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getCpuId() {
        return cpuId;
    }

    public void setCpuId(Integer cpuId) {
        this.cpuId = cpuId;
    }

    public Integer getCpudId() {
        return cpudId;
    }

    public void setCpudId(Integer cpudId) {
        this.cpudId = cpudId;
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public Integer getVgaId() {
        return vgaId;
    }

    public void setVgaId(Integer vgaId) {
        this.vgaId = vgaId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}