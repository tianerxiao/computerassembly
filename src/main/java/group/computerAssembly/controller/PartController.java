package group.computerAssembly.controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import group.computerAssembly.dto.*;
import group.computerAssembly.entity.*;
import group.computerAssembly.enums.MessageCode;
import group.computerAssembly.service.PartService;
import group.computerAssembly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/part")
public class PartController {
    @Autowired
    PartService partService;
    @Autowired
    UserService userService;


    @PostMapping("/cpu-part/{page}")
    public @ResponseBody
    Message getCpuPart(@RequestBody CpuDetail cpuDetail,@PathVariable Integer page){
        Message message = new Message();
        Integer start = page*10;
        Integer stop =start+10;
        List<CpuDetail> cpuDetails =  partService.getCpuDetails(cpuDetail);
        List<CpuDto> cpuList = partService.getCpusLimit(cpuDetails,start,stop);
        message.setCode(MessageCode.ok);
        message.setData(cpuList);
        return message;
    }

    @PostMapping("/board-part/{page}")
    public  @ResponseBody
    Message getBoardPart(@RequestBody BoardDetail boardDetail,@PathVariable Integer page){
        Message message = new Message();
        Integer start = page*10;
        Integer stop =start+10;
        List<BoardDetail> boardDetails = partService.getBoardDetails(boardDetail);
        List<BoardDto> boardList = partService.getBoardsLimit(boardDetails,start,stop);
        message.setCode(MessageCode.ok);
        message.setData(boardList);
        return message;
    }

    @PostMapping("/memory-part/{page}")
    public  @ResponseBody
    Message getMemoryPart(@RequestBody MemoryDetail memoryDetail,@PathVariable Integer page){
        Message message = new Message();
        Integer start = page*10;
        Integer stop =start+10;
        List<MemoryDetail> memoryDetails = partService.getMemoryDetails(memoryDetail);
        List<MemoryDto> memoryList = partService.getMemorysLimit(memoryDetails,start,stop);
        message.setCode(MessageCode.ok);
        message.setData(memoryList);
        return message;
    }

    @PostMapping("/power-part/{page}")
    public  @ResponseBody
    Message getPowerPart(@RequestBody PowerDetail powerDetail,@PathVariable Integer page){
        Message message = new Message();
        Integer start = page*10;
        Integer stop =start+10;
        List<PowerDetail> powerDetails = partService.getPowerDetails(powerDetail);
        List<PowerDto> powerList = partService.getPowersLimit(powerDetails,start,stop);
        message.setCode(MessageCode.ok);
        message.setData(powerList);
        return message;
    }

    @PostMapping("/vga-part/{page}")
    public  @ResponseBody
    Message getVgaPart(@RequestBody VgaDetail vgaDetail,@PathVariable Integer page){
        Message message = new Message();
        Integer start = page*10;
        Integer stop =start+10;
        List<VgaDetail> vgaDetails = partService.getVgaDetails(vgaDetail);
        List<VgaDto> vgaList = partService.getVgasLimit(vgaDetails,start,stop);
        message.setCode(MessageCode.ok);
        message.setData(vgaList);
        return message;
    }

    @PostMapping("/search-part")
    public @ResponseBody
    Message searchPart(@RequestBody SearchContent searchContent){
        Message message = new Message();
        Integer start = searchContent.getPage()*10;
        Integer stop =start+10;
        if(searchContent.getSearchContent() == null){
            searchContent.setSearchContent("");
        }
        if("CPU".equals(searchContent.getPart().toUpperCase())){

            message.setCode(MessageCode.ok);
            message.setData(partService.searchCpuPartLike(searchContent.getSearchContent(),start,stop));
            return message;
        }
        if ("内存".equals(searchContent.getPart().toUpperCase())){
            message.setCode(MessageCode.ok);
            message.setData(partService.searchMemoryPartLike(searchContent.getSearchContent(),start,stop));
            return message;
        }
        if ("显卡".equals(searchContent.getPart().toUpperCase())){
            message.setCode(MessageCode.ok);
            message.setData(partService.searchVgaPartLike(searchContent.getSearchContent(),start,stop));
            return message;
        }
        if ("主板".equals(searchContent.getPart().toUpperCase())){
            message.setData(partService.searchBoardPartLike(searchContent.getSearchContent(),start,stop));
            message.setCode(MessageCode.ok);
            return message;
        }
        if ("电源".equals(searchContent.getPart().toUpperCase())){
            message.setCode(MessageCode.ok);
            message.setData(partService.searchPowerPartLike(searchContent.getSearchContent(),start,stop));
            return message;
        }
        message.setCode(MessageCode.nofound);
        message.setData("");
        return message;
    }

    @PostMapping("/get-part")
    public @ResponseBody
    Message getPartById(HttpServletRequest request, @RequestBody SearchContent searchContent){
        Message message = new Message();
        if(searchContent.getSearchContent() == null){
            message.setCode(MessageCode.nofound);
            message.setData("");
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        if(userId==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(userService.getUserRole(userId).getUserRole() == 2){
            return partService.getPartById(searchContent);
        }else {
            message.setData("无权限");
            message.setCode(MessageCode.forbidden);
            return message;
        }
    }

    @DeleteMapping("/delete-part")
    public @ResponseBody
    Message deletePartById(HttpServletRequest request,@RequestBody SearchContent searchContent){
        Message message = new Message();
        if(searchContent.getSearchContent() == null){
            message.setCode(MessageCode.nofound);
            message.setData("");
            return message;
        }
        String userId = request.getSession().getAttribute("userId").toString();
        if(userId==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(userService.getUserRole(userId).getUserRole() == 2){
            partService.deletePartById(searchContent);
            message.setData("删除成功");
            message.setCode(MessageCode.ok);
            return message;
        }else {
            message.setData("无权限");
            message.setCode(MessageCode.forbidden);
            return message;
        }
    }

    @PostMapping("/cpu")
    public @ResponseBody
    Message postCpu(HttpServletRequest request,@RequestBody CpuDto cpuDto){
        Message message = new Message();
        String userId = request.getSession().getAttribute("userId").toString();
        if(userId==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(userService.getUserRole(userId).getUserRole() == 2){
            try {
                partService.addCpu(cpuDto);
                message.setData("添加成功");
                message.setCode(MessageCode.ok);
                return message;
            }catch (Exception e){
                e.printStackTrace();
                message.setData("添加失败");
                message.setCode(MessageCode.ok);
                return message;
            }

        }else {
            message.setData("无权限");
            message.setCode(MessageCode.forbidden);
            return message;
        }
    }

    @PostMapping("/board")
    public @ResponseBody
    Message postCpu(HttpServletRequest request,@RequestBody BoardDto boardDto){
        Message message = new Message();
        String userId = request.getSession().getAttribute("userId").toString();
        if(userId==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(userService.getUserRole(userId).getUserRole() == 2){
            try {
                partService.addBoard(boardDto);
                message.setData("添加成功");
                message.setCode(MessageCode.ok);
                return message;
            }catch (Exception e){
                e.printStackTrace();
                message.setData("添加失败");
                message.setCode(MessageCode.ok);
                return message;
            }

        }else {
            message.setData("无权限");
            message.setCode(MessageCode.forbidden);
            return message;
        }
    }

    @PostMapping("/vga")
    public @ResponseBody
    Message postCpu(HttpServletRequest request,@RequestBody VgaDto vgaDto){
        Message message = new Message();
        String userId = request.getSession().getAttribute("userId").toString();
        if(userId==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(userService.getUserRole(userId).getUserRole() == 2){
            try {
                partService.addVga(vgaDto);
                message.setData("添加成功");
                message.setCode(MessageCode.ok);
                return message;
            }catch (Exception e){
                e.printStackTrace();
                message.setData("添加失败");
                message.setCode(MessageCode.ok);
                return message;
            }

        }else {
            message.setData("无权限");
            message.setCode(MessageCode.forbidden);
            return message;
        }
    }

    @PostMapping("/memory")
    public @ResponseBody
    Message postCpu(HttpServletRequest request,@RequestBody MemoryDto memoryDto){
        Message message = new Message();
        String userId = request.getSession().getAttribute("userId").toString();
        if(userId==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(userService.getUserRole(userId).getUserRole() == 2){
            try {
                partService.addMemory(memoryDto);
                message.setData("添加成功");
                message.setCode(MessageCode.ok);
                return message;
            }catch (Exception e){
                e.printStackTrace();
                message.setData("添加失败");
                message.setCode(MessageCode.ok);
                return message;
            }

        }else {
            message.setData("无权限");
            message.setCode(MessageCode.forbidden);
            return message;
        }
    }

    @PostMapping("/power")
    public @ResponseBody
    Message postCpu(HttpServletRequest request,@RequestBody PowerDto powerDto){
        Message message = new Message();
        String userId = request.getSession().getAttribute("userId").toString();
        if(userId==null){
            message.setData("未登录");
            message.setCode(MessageCode.nologin);
            return message;
        }
        if(userService.getUserRole(userId).getUserRole() == 2){
            try {
                partService.addPower(powerDto);
                message.setData("添加成功");
                message.setCode(MessageCode.ok);
                return message;
            }catch (Exception e){
                e.printStackTrace();
                message.setData("添加失败");
                message.setCode(MessageCode.ok);
                return message;
            }

        }else {
            message.setData("无权限");
            message.setCode(MessageCode.forbidden);
            return message;
        }
    }
}
