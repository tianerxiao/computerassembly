package group.computerAssembly.controller;

import group.computerAssembly.dao.CountMapper;
import group.computerAssembly.dao.ImagedvMapper;
import group.computerAssembly.dao.NewsMapper;
import group.computerAssembly.dto.Message;
import group.computerAssembly.entity.Imagedv;
import group.computerAssembly.entity.ImagedvExample;
import group.computerAssembly.entity.News;
import group.computerAssembly.entity.NewsExample;
import group.computerAssembly.enums.MessageCode;
import group.computerAssembly.file.CreateFile;
import group.computerAssembly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

@RestController
@RequestMapping("/news")
@Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
public class NewsController {

    @Autowired
    ImagedvMapper imagedvMapper;
    @Autowired
    NewsMapper newsMapper;
    @Autowired
    UserService userService;
    @Autowired
    CountMapper countMapper;

    private final ResourceLoader resourceLoader;

    @Autowired
    public NewsController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @PostMapping("/fileUpload")
    public @ResponseBody
    Message fileUpload(HttpServletRequest request, @RequestParam("imageFile") MultipartFile file) throws IOException {
        Message message = new Message();
        String fileName = file.getOriginalFilename();
        String uploadPath = "upload/";
        if(!"jpg".equals(fileName.substring(fileName.lastIndexOf(".")+1))){
            message.setCode(100);
            message.setData("请上传jpg文件");
            return message;
        }
        File targetFile = new File(uploadPath);
        if (!targetFile.exists()){
            targetFile.mkdirs();
        }
        if (imagedvMapper.selectByPrimaryKey(fileName) !=null){
            message.setData("图片已存在");
            message.setCode(100);
            return message;
        }
        CreateFile.createDir(uploadPath);
        CreateFile.createFile(uploadPath+fileName);
        FileOutputStream out = new FileOutputStream(uploadPath+fileName);
        try {
            out.write(file.getBytes());
            Imagedv imagedv = new Imagedv();
            imagedv.setFilename(fileName);
            imagedvMapper.insertSelective(imagedv);
            message.setCode(200);
            message.setData("提交成功");
            return message;
        }catch (Exception e){
            e.printStackTrace();
            message.setCode(100);
            message.setData("提交失败");
            return message;
        }finally {
            out.flush();
            out.close();
        }
    }

    @GetMapping("/imagedv/{filename}")
    public @ResponseBody ResponseEntity<?> getImage(HttpServletRequest request,@PathVariable("filename") String fileName){
        try {
            return ResponseEntity.ok(resourceLoader.getResource("file:"+ Paths.get("upload/", fileName+".jpg").toString()));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/imagedvList")
    public @ResponseBody
    Message getImagedvList(){
        Message message = new Message();
        ImagedvExample imagedvExample = new ImagedvExample();
        ImagedvExample.Criteria criteria = imagedvExample.createCriteria();
        criteria.andFilenameIsNotNull();
        message.setCode(MessageCode.ok);
        message.setData(imagedvMapper.selectByExample(imagedvExample));
        return message;
    }

    @DeleteMapping("/imagedv/{filename}")
    public @ResponseBody
    Message deleteImagedv(@PathVariable("filename") String filename,HttpServletRequest request){
        Message message = new Message();
        if(request.getSession().getAttribute("userId")==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(imagedvMapper.deleteByPrimaryKey(filename) != 0){
            message.setData("删除成功");
            message.setCode(MessageCode.ok);
            return message;
        }else {
            message.setData("删除失败");
            message.setCode(MessageCode.error);
            return message;
        }
    }

    @PostMapping("/news")
    public @ResponseBody
    Message postNews(HttpServletRequest request, @RequestParam(value = "title",required = false) String title,@RequestParam(value = "note",required = false) String note,@RequestParam("imageFile") MultipartFile file) throws IOException {
        Message message = new Message();
        News news = new News();
        String fileName = file.getOriginalFilename();
        String uploadPath = "upload/";
        String userId = request.getSession().getAttribute("userId").toString();
        String newsTitle = new String(title.getBytes("ISO8859-1"),"UTF-8");
        String newsNote = new String(note.getBytes("ISO8859-1"),"UTF-8");
        if(userId==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(!"jpg".equals(fileName.substring(fileName.lastIndexOf(".")+1))){
            message.setCode(100);
            message.setData("请上传jpg文件");
            return message;
        }
        File targetFile = new File(uploadPath);
        if (!targetFile.exists()){
            targetFile.mkdirs();
        }
        if (imagedvMapper.selectByPrimaryKey(fileName) !=null){
            message.setData("图片已存在");
            message.setCode(100);
            return message;
        }
        CreateFile.createDir(uploadPath);
        CreateFile.createFile(uploadPath+fileName);
        if(userService.getUserRole(userId).getUserRole() == 2){
            FileOutputStream out = new FileOutputStream(uploadPath+fileName);
            try {
                out.write(file.getBytes());
                news.setImg(fileName);
                news.setNote(newsNote);
                news.setTitle(newsTitle);
                news.setType("新闻");
                newsMapper.insertSelective(news);
                message.setData("添加成功");
                message.setCode(MessageCode.ok);
                return message;
            }catch (Exception e){
                e.printStackTrace();
                message.setCode(100);
                message.setData("提交失败");
                return message;
            }finally {
                out.flush();
                out.close();
            }
        }else {
            message.setData("无权限");
            message.setCode(MessageCode.forbidden);
            return message;
        }
    }

    @GetMapping("/news")
    public @ResponseBody
    Message getNews(){
        Message message = new Message();
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        criteria.andTitleIsNotNull();
        message.setData(newsMapper.selectByExample(newsExample));
        message.setCode(MessageCode.ok);
        return message;
    }

    @GetMapping("/parts")
    public @ResponseBody
    Message getParts(){
        Message message = new Message();
        message.setData(countMapper.getPartByRand());
        message.setCode(MessageCode.ok);
        return message;
    }

    @DeleteMapping("/news/{newsId}")
    public @ResponseBody
    Message deleteNews(HttpServletRequest request,@PathVariable("newsId") String newsId) {
        Message message = new Message();
        String userId = request.getSession().getAttribute("userId").toString();
        if (userId == null) {
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if (userService.getUserRole(userId).getUserRole() == 2) {
            newsMapper.deleteByPrimaryKey(Long.parseLong(newsId));
            message.setData("删除成功");
            message.setCode(MessageCode.ok);
            return message;
        } else {
            message.setData("无权限");
            message.setCode(MessageCode.forbidden);
            return message;
        }
    }
}
