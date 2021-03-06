package group.computerAssembly.service;

import group.computerAssembly.dto.*;
import group.computerAssembly.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PartService {
    List<CpuDetail> getCpuDetails(CpuDetail cpuDetail);
    List<CpuDto> getCpusLimit(List<CpuDetail> cpuDetails, Integer start, Integer stop);
    List<BoardDetail> getBoardDetails(BoardDetail boardDetail);
    List<BoardDto> getBoardsLimit(List<BoardDetail> boardDetails,Integer start,Integer stop);
    List<MemoryDetail> getMemoryDetails(MemoryDetail memoryDetail);
    List<MemoryDto> getMemorysLimit(List<MemoryDetail> memoryDetails, Integer start, Integer stop);
    List<VgaDetail> getVgaDetails(VgaDetail vgaDetail);
    List<VgaDto> getVgasLimit(List<VgaDetail> vgaDetails, Integer start, Integer stop);
    List<PowerDetail> getPowerDetails(PowerDetail powerDetail);
    List<PowerDto> getPowersLimit(List<PowerDetail> powerDetails, Integer start, Integer stop);
    Message getPartById(SearchContent searchContent);
    void deletePartById(SearchContent searchContent);
    List<CpuDto> searchCpuPartLike(String searchContent,Integer start,Integer stop);
    List<MemoryDto> searchMemoryPartLike(String searchContent,Integer start,Integer stop);
    List<VgaDto> searchVgaPartLike(String searchContent,Integer start,Integer stop);
    List<PowerDto> searchPowerPartLike(String searchContent,Integer start,Integer stop);
    List<BoardDto> searchBoardPartLike(String searchContent,Integer start,Integer stop);
    void addCpu(CpuDto cpuDto);
    void addBoard(BoardDto boardDto);
    void addMemory(MemoryDto memoryDto);
    void addPower(PowerDto powerDto);
    void addVga(VgaDto vgaDto);
}
