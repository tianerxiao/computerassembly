package group.computerAssembly.entity;

import java.util.Date;

public class FornumComment {
    private String commentId;

    private String comment;

    private String img;

    private Date savetime;

    private Long bbsId;

    private String userId;

    public FornumComment(String commentId, String comment, String img, Date savetime, Long bbsId, String userId) {
        this.commentId = commentId;
        this.comment = comment;
        this.img = img;
        this.savetime = savetime;
        this.bbsId = bbsId;
        this.userId = userId;
    }

    public FornumComment() {
        super();
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }

    public Long getBbsId() {
        return bbsId;
    }

    public void setBbsId(Long bbsId) {
        this.bbsId = bbsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}