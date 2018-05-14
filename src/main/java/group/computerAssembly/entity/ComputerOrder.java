package group.computerAssembly.entity;

import java.util.Date;

public class ComputerOrder {
    private String orderId;

    private String partTableId;

    private String userId;

    private String comment;

    private Date createTime;

    private String price;

    public ComputerOrder(String orderId, String partTableId, String userId, String comment, Date createTime, String price) {
        this.orderId = orderId;
        this.partTableId = partTableId;
        this.userId = userId;
        this.comment = comment;
        this.createTime = createTime;
        this.price = price;
    }

    public ComputerOrder() {
        super();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }
}