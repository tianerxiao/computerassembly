package group.computerAssembly.entity;

public class MemoryDetail {
    private Integer memdId;

    private String memdName;

    private String memdType;

    private String memdFreq;

    private String memdSize;

    private String memdDescribe;

    public MemoryDetail(Integer memdId, String memdName, String memdType, String memdFreq, String memdSize, String memdDescribe) {
        this.memdId = memdId;
        this.memdName = memdName;
        this.memdType = memdType;
        this.memdFreq = memdFreq;
        this.memdSize = memdSize;
        this.memdDescribe = memdDescribe;
    }

    public MemoryDetail() {
        super();
    }

    public Integer getMemdId() {
        return memdId;
    }

    public void setMemdId(Integer memdId) {
        this.memdId = memdId;
    }

    public String getMemdName() {
        return memdName;
    }

    public void setMemdName(String memdName) {
        this.memdName = memdName == null ? null : memdName.trim();
    }

    public String getMemdType() {
        return memdType;
    }

    public void setMemdType(String memdType) {
        this.memdType = memdType == null ? null : memdType.trim();
    }

    public String getMemdFreq() {
        return memdFreq;
    }

    public void setMemdFreq(String memdFreq) {
        this.memdFreq = memdFreq == null ? null : memdFreq.trim();
    }

    public String getMemdSize() {
        return memdSize;
    }

    public void setMemdSize(String memdSize) {
        this.memdSize = memdSize == null ? null : memdSize.trim();
    }

    public String getMemdDescribe() {
        return memdDescribe;
    }

    public void setMemdDescribe(String memdDescribe) {
        this.memdDescribe = memdDescribe == null ? null : memdDescribe.trim();
    }
}