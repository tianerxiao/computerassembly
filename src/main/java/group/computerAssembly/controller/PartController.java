package group.computerAssembly.controller;

import group.computerAssembly.dto.*;
import group.computerAssembly.entity.*;
import group.computerAssembly.enums.MessageCode;
import group.computerAssembly.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/part")
public class PartController {
    @Autowired
    PartService partService;


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

}
