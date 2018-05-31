package group.computerAssembly.entity;

import java.util.Date;

public class Fornum {
    private Long id;

    private String title;

    private String note;

    private String img;

    private Date savetime;

    private String userId;

    public Fornum(Long id, String title, String note, String img, Date savetime, String userId) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.img = img;
        this.savetime = savetime;
        this.userId = userId;
    }

    public Fornum() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}