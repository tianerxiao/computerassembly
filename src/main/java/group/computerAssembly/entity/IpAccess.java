package group.computerAssembly.entity;

import java.util.Date;

public class IpAccess {
    private String ip;

    private Date createTime;

    public IpAccess(String ip, Date createTime) {
        this.ip = ip;
        this.createTime = createTime;
    }

    public IpAccess() {
        super();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}