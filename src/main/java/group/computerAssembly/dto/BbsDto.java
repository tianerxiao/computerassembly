package group.computerAssembly.dto;

import group.computerAssembly.entity.Fornum;
import group.computerAssembly.entity.FornumComment;

import java.util.List;

public class BbsDto {
    private Fornum fornum;
    private List<FornumComment> fornumCommentList;

    public Fornum getFornum() {
        return fornum;
    }

    public void setFornum(Fornum fornum) {
        this.fornum = fornum;
    }

    public List<FornumComment> getFornumCommentList() {
        return fornumCommentList;
    }

    public void setFornumCommentList(List<FornumComment> fornumCommentList) {
        this.fornumCommentList = fornumCommentList;
    }
}
