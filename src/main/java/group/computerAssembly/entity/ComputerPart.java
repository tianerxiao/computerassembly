package group.computerAssembly.entity;

import java.util.Date;

public class ComputerPart {
    private String partTableId;

    private String userId;

    private Integer cpuId;

    private Integer boardId;

    private Integer memId;

    private Integer powerId;

    private Integer vgaId;

    private Date createTime;

    private String partTableName;

    private String partTableDescribe;

    public ComputerPart(String partTableId, String userId, Integer cpuId, Integer boardId, Integer memId, Integer powerId, Integer vgaId, Date createTime, String partTableName, String partTableDescribe) {
        this.partTableId = partTableId;
        this.userId = userId;
        this.cpuId = cpuId;
        this.boardId = boardId;
        this.memId = memId;
        this.powerId = powerId;
        this.vgaId = vgaId;
        this.createTime = createTime;
        this.partTableName = partTableName;
        this.partTableDescribe = partTableDescribe;
    }

    public ComputerPart() {
        super();
    }

    public String getPartTableId() {
        return partTableId;
    }

    public void setPartTableId(String partTableId) {
        this.partTableId = partTableId == null ? null : partTableId.trim();
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

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
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

    public String getPartTableName() {
        return partTableName;
    }

    public void setPartTableName(String partTableName) {
        this.partTableName = partTableName == null ? null : partTableName.trim();
    }

    public String getPartTableDescribe() {
        return partTableDescribe;
    }

    public void setPartTableDescribe(String partTableDescribe) {
        this.partTableDescribe = partTableDescribe == null ? null : partTableDescribe.trim();
    }
}