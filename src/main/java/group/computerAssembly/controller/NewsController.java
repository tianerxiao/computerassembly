package group.computerAssembly.controller;

import group.computerAssembly.dao.ImagedvMapper;
import group.computerAssembly.dao.NewsMapper;
import group.computerAssembly.dto.Message;
import group.computerAssembly.entity.Imagedv;
import group.computerAssembly.entity.ImagedvExample;
import group.computerAssembly.enums.MessageCode;
import group.computerAssembly.file.CreateFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    ImagedvMapper imagedvMapper;
    @Autowired
    NewsMapper newsMapper;

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
}
