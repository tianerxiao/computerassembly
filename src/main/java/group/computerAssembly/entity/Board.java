package group.computerAssembly.entity;

public class Board {
    private Integer boardId;

    private String boardName;

    private String boardPrice;

    private String boardHref;

    private String boardDescribe;

    public Board(Integer boardId, String boardName, String boardPrice, String boardHref, String boardDescribe) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardPrice = boardPrice;
        this.boardHref = boardHref;
        this.boardDescribe = boardDescribe;
    }

    public Board() {
        super();
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
    }

    public String getBoardPrice() {
        return boardPrice;
    }

    public void setBoardPrice(String boardPrice) {
        this.boardPrice = boardPrice == null ? null : boardPrice.trim();
    }

    public String getBoardHref() {
        return boardHref;
    }

    public void setBoardHref(String boardHref) {
        this.boardHref = boardHref == null ? null : boardHref.trim();
    }

    public String getBoardDescribe() {
        return boardDescribe;
    }

    public void setBoardDescribe(String boardDescribe) {
        this.boardDescribe = boardDescribe == null ? null : boardDescribe.trim();
    }
}