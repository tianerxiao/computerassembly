package group.computerAssembly.entity;

import java.util.Date;

public class Imagedv {
    private String filename;

    private Date createTime;

    public Imagedv(String filename, Date createTime) {
        this.filename = filename;
        this.createTime = createTime;
    }

    public Imagedv() {
        super();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}