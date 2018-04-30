package group.computerAssembly.entity;

public class BoardDetail {
    private Integer boarddId;

    private String boarddName;

    private String boarddCpu;

    private String boarddChipset;

    private String boarddArch;

    public BoardDetail(Integer boarddId, String boarddName, String boarddCpu, String boarddChipset, String boarddArch) {
        this.boarddId = boarddId;
        this.boarddName = boarddName;
        this.boarddCpu = boarddCpu;
        this.boarddChipset = boarddChipset;
        this.boarddArch = boarddArch;
    }

    public BoardDetail() {
        super();
    }

    public Integer getBoarddId() {
        return boarddId;
    }

    public void setBoarddId(Integer boarddId) {
        this.boarddId = boarddId;
    }

    public String getBoarddName() {
        return boarddName;
    }

    public void setBoarddName(String boarddName) {
        this.boarddName = boarddName == null ? null : boarddName.trim();
    }

    public String getBoarddCpu() {
        return boarddCpu;
    }

    public void setBoarddCpu(String boarddCpu) {
        this.boarddCpu = boarddCpu == null ? null : boarddCpu.trim();
    }

    public String getBoarddChipset() {
        return boarddChipset;
    }

    public void setBoarddChipset(String boarddChipset) {
        this.boarddChipset = boarddChipset == null ? null : boarddChipset.trim();
    }

    public String getBoarddArch() {
        return boarddArch;
    }

    public void setBoarddArch(String boarddArch) {
        this.boarddArch = boarddArch == null ? null : boarddArch.trim();
    }
}