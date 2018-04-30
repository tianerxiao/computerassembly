package group.computerAssembly.dto;

import group.computerAssembly.entity.Board;
import group.computerAssembly.entity.BoardDetail;

public class BoardDto {
    private Board board;
    private BoardDetail boardDetail;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public BoardDetail getBoardDetail() {
        return boardDetail;
    }

    public void setBoardDetail(BoardDetail boardDetail) {
        this.boardDetail = boardDetail;
    }
}
