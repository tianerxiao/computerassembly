package group.computerAssembly.controller;

import group.computerAssembly.dao.FornumCommentMapper;
import group.computerAssembly.dao.FornumMapper;
import group.computerAssembly.dto.BbsDto;
import group.computerAssembly.dto.Message;
import group.computerAssembly.entity.Fornum;
import group.computerAssembly.entity.FornumComment;
import group.computerAssembly.entity.FornumCommentExample;
import group.computerAssembly.entity.FornumExample;
import group.computerAssembly.enums.MessageCode;
import group.computerAssembly.file.CreateFile;
import group.computerAssembly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bbs")
@Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
public class BbsController {
    @Autowired
    FornumMapper fornumMapper;
    @Autowired
    FornumCommentMapper fornumCommentMapper;
    @Autowired
    UserService userService;

    @PostMapping("/fornum")
    public @ResponseBody
    Message postFornum(HttpServletRequest request, @RequestParam(value = "title",required = false) String title,@RequestParam(value = "note",required = false) String note,@RequestParam("imageFile") MultipartFile file) throws IOException {
        Message message = new Message();
        Fornum fornum = new Fornum();
        String fileName = file.getOriginalFilename();
        String uploadPath = "upload/";
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(title == null){
            message.setData("请输入标题");
            message.setCode(MessageCode.error);
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        String newsTitle = new String(title.getBytes("ISO8859-1"),"UTF-8");
        String newsNote = new String(note.getBytes("ISO8859-1"),"UTF-8");
        if(file.getSize() != 0){
            if(!"jpg".equals(fileName.substring(fileName.lastIndexOf(".")+1))){
                message.setCode(100);
                message.setData("请上传jpg文件");
                return message;
            }
            File targetFile = new File(uploadPath);
            if (!targetFile.exists()){
                targetFile.mkdirs();
            }
            CreateFile.createDir(uploadPath);
            CreateFile.createFile(uploadPath+fileName);
            FileOutputStream out = new FileOutputStream(uploadPath+fileName);
            out.write(file.getBytes());
            out.flush();
            out.close();
            fornum.setImg(fileName);
        }
        fornum.setNote(newsNote);
        fornum.setUserId(userId);
        fornum.setTitle(newsTitle);
        fornumMapper.insertSelective(fornum);
        message.setData("添加成功");
        message.setCode(MessageCode.ok);
        return message;
    }

    @GetMapping("/fornum")
    public @ResponseBody
    Message getFornum(){
        Message message = new Message();
        List<BbsDto> bbsDtoList = new ArrayList<>();
        FornumExample fornumExample  = new FornumExample();
        FornumExample.Criteria criteria = fornumExample.createCriteria();
        criteria.andTitleIsNotNull();
        fornumExample.setOrderByClause("savetime desc");
        List<Fornum> fornumList = fornumMapper.selectByExample(fornumExample);
        for (Fornum fornum : fornumList){
            BbsDto bbsDto = new BbsDto();
            bbsDto.setFornum(fornum);
            FornumCommentExample fornumCommentExample = new FornumCommentExample();
            FornumCommentExample.Criteria criteria1 = fornumCommentExample.createCriteria();
            criteria1.andBbsIdEqualTo(fornum.getId());
            bbsDto.setFornumCommentList(fornumCommentMapper.selectByExample(fornumCommentExample));
            bbsDtoList.add(bbsDto);
        }
        message.setData(bbsDtoList);
        message.setCode(MessageCode.ok);
        return message;
    }

    @GetMapping("/fornumById/{id}")
    public @ResponseBody
    Message getFornumById(@PathVariable("id") Long id){
        Message message = new Message();
        BbsDto bbsDto = new BbsDto();
        bbsDto.setFornum(fornumMapper.selectByPrimaryKey(id));
        FornumCommentExample fornumCommentExample = new FornumCommentExample();
        FornumCommentExample.Criteria criteria = fornumCommentExample.createCriteria();
        criteria.andBbsIdEqualTo(id);
        bbsDto.setFornumCommentList(fornumCommentMapper.selectByExample(fornumCommentExample));
        message.setData(bbsDto);
        message.setCode(MessageCode.ok);
        return message;
    }

    @PostMapping("/comment")
    public @ResponseBody
    Message postComment(HttpServletRequest request, @RequestParam(value = "fornumId",required = false) String fornumId,@RequestParam(value = "commentNote",required = false) String comment,@RequestParam("imgFile") MultipartFile file) throws IOException {
        Message message = new Message();
        FornumComment fornumComment = new FornumComment();
        String fileName = file.getOriginalFilename();
        String uploadPath = "upload/";
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(comment == null){
            message.setData("请输入内容");
            message.setCode(MessageCode.error);
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        String fornumID = new String(fornumId.getBytes("ISO8859-1"),"UTF-8");
        String commentNote = new String(comment.getBytes("ISO8859-1"),"UTF-8");
        if(file.getSize() != 0){
            if(!"jpg".equals(fileName.substring(fileName.lastIndexOf(".")+1))){
                message.setCode(100);
                message.setData("请上传jpg文件");
                return message;
            }
            File targetFile = new File(uploadPath);
            if (!targetFile.exists()){
                targetFile.mkdirs();
            }
            CreateFile.createDir(uploadPath);
            CreateFile.createFile(uploadPath+fileName);
            FileOutputStream out = new FileOutputStream(uploadPath+fileName);
            out.write(file.getBytes());
            out.flush();
            out.close();
            fornumComment.setImg(fileName);
        }
        fornumComment.setUserId(userId);
        fornumComment.setComment(commentNote);
        fornumComment.setBbsId(Long.parseLong(fornumID));
        fornumComment.setCommentId(UUID.randomUUID().toString().replace("-",""));
        fornumCommentMapper.insertSelective(fornumComment);
        message.setData("添加成功");
        message.setCode(MessageCode.ok);
        return message;
    }
}
