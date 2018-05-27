package group.computerAssembly.entity;

public class News {
    private Long id;

    private String title;

    private String note;

    private String img;

    private String savetime;

    private String type;

    public News(Long id, String title, String note, String img, String savetime, String type) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.img = img;
        this.savetime = savetime;
        this.type = type;
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
}