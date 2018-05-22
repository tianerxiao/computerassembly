package group.computerAssembly.entity;

public class News {
    private Long id;

    private String title;

    private String img;

    private String savetime;

    private String type;

    private String note;

    public News(Long id, String title, String img, String savetime, String type, String note) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.savetime = savetime;
        this.type = type;
        this.note = note;
    }

    public News() {
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getSavetime() {
        return savetime;
    }

    public void setSavetime(String savetime) {
        this.savetime = savetime == null ? null : savetime.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}