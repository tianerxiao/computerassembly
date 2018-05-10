package group.computerAssembly.service.serviceImpl;

import group.computerAssembly.dao.*;
import group.computerAssembly.dto.*;
import group.computerAssembly.entity.*;
import group.computerAssembly.service.PartService;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartServiceImpl implements PartService{

    @Autowired
    CpuDetailMapper cpuDetailMapper;
    @Autowired
    CpuMapper cpuMapper;
    @Autowired
    BoardDetailMapper boardDetailMapper;
    @Autowired
    BoardMapper boardMapper;
    @Autowired
    MemoryDetailMapper memoryDetailMapper;
    @Autowired
    MemoryMapper memoryMapper;
    @Autowired
    VgaMapper vgaMapper;
    @Autowired
    VgaDetailMapper vgaDetailMapper;
    @Autowired
    PowerMapper powerMapper;
    @Autowired
    PowerDetailMapper powerDetailMapper;

    @Override
    public List<CpuDetail> getCpuDetails(CpuDetail cpuDetail) {
        CpuDetailExample cpuDetailExample = new CpuDetailExample();
        CpuDetailExample.Criteria criteria = cpuDetailExample.createCriteria();

        if(cpuDetail.getCpudVendor() != null){
            criteria.andCpudVendorEqualTo(cpuDetail.getCpudVendor());
        }
        if(cpuDetail.getCpudCore() != null){
            criteria.andCpudCoreEqualTo(cpuDetail.getCpudCore());
        }
        if(cpuDetail.getCpudCraft() != null){
            criteria.andCpudCraftEqualTo(cpuDetail.getCpudCraft());
        }
        if(cpuDetail.getCpudId() !=null){
            criteria.andCpudIdEqualTo(cpuDetail.getCpudId());
        }
        if(cpuDetail.getCpudId()==null
                & cpuDetail.getCpudCraft() == null
                & cpuDetail.getCpudCore() == null
                & cpuDetail.getCpudVendor() == null){

            CpuDetailExample cpuDetailExample1 = new CpuDetailExample();
            CpuDetailExample.Criteria criteria1 = cpuDetailExample1.createCriteria();
            criteria1.andCpudIdIsNotNull();
            List<CpuDetail> cpuDetailList =  cpuDetailMapper.selectByExample(cpuDetailExample1);
            return cpuDetailList;
        }else {
            List<CpuDetail> cpuDetailList =  cpuDetailMapper.selectByExample(cpuDetailExample);
            return cpuDetailList;
        }

    }

    @Override
    public List<CpuDto> getCpusLimit(List<CpuDetail> cpuDetails, Integer start, Integer stop) {
        List<CpuDto> cpuDtoList = new ArrayList<CpuDto>();
        if(stop > cpuDetails.size()){
            stop = cpuDetails.size();
        }
        for (Integer i = start;i < stop;i++){
            CpuDto cpuDto = new CpuDto();
            cpuDto.setCpu(cpuMapper.selectByPrimaryKey(cpuDetails.get(i).getCpudId()));
            cpuDto.setCpuDetail(cpuDetails.get(i));
            cpuDtoList.add(cpuDto);
        }
        return cpuDtoList;
    }

    @Override
    public List<BoardDetail> getBoardDetails(BoardDetail boardDetail) {
        BoardDetailExample boardDetailExample = new BoardDetailExample();
        BoardDetailExample.Criteria criteria = boardDetailExample.createCriteria();
        if(boardDetail.getBoarddArch() != null){
            criteria.andBoarddArchEqualTo(boardDetail.getBoarddArch());
        }
        if(boardDetail.getBoarddChipset() !=null){
            criteria.andBoarddChipsetEqualTo(boardDetail.getBoarddChipset());
        }
        if(boardDetail.getBoarddCpu() !=null){
            criteria.andBoarddCpuEqualTo(boardDetail.getBoarddCpu());
        }
        if(boardDetail.getBoarddId() != null){
            criteria.andBoarddCpuEqualTo(boardDetail.getBoarddCpu());
        }
        if(boardDetail.getBoarddArch() ==null
                & boardDetail.getBoarddChipset()==null
                & boardDetail.getBoarddCpu() ==null
                & boardDetail.getBoarddId() ==null){

            BoardDetailExample boardDetailExample1 = new BoardDetailExample();
            BoardDetailExample.Criteria criteria1 = boardDetailExample1.createCriteria();
            criteria1.andBoarddIdIsNotNull();
            List<BoardDetail> boardDetailList1 = boardDetailMapper.selectByExample(boardDetailExample1);
            return boardDetailList1;
        }else {
            List<BoardDetail> boardDetailList = boardDetailMapper.selectByExample(boardDetailExample);
            return boardDetailList;
        }
    }

    @Override
    public List<BoardDto> getBoardsLimit(List<BoardDetail> boardDetails, Integer start, Integer stop) {
        List<BoardDto> boardDtoList = new ArrayList<BoardDto>();
        if(stop > boardDetails.size()){
            stop = boardDetails.size();
        }
        for (Integer i = start;i < stop;i++){
            BoardDto boardDto = new BoardDto();
            boardDto.setBoard(boardMapper.selectByPrimaryKey(boardDetails.get(i).getBoarddId()));
            boardDto.setBoardDetail(boardDetails.get(i));
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }

    @Override
    public List<MemoryDetail> getMemoryDetails(MemoryDetail memoryDetail) {
        MemoryDetailExample memoryDetailExample = new MemoryDetailExample();
        MemoryDetailExample.Criteria criteria = memoryDetailExample.createCriteria();
        if(memoryDetail.getMemdFreq() != null){
            criteria.andMemdFreqEqualTo(memoryDetail.getMemdFreq());
        }
        if(memoryDetail.getMemdSize() != null){
            criteria.andMemdSizeEqualTo(memoryDetail.getMemdSize());
        }
        if(memoryDetail.getMemdType() != null){
            criteria.andMemdTypeEqualTo(memoryDetail.getMemdType());
        }
        if(memoryDetail.getMemdId() != null){
            criteria.andMemdIdEqualTo(memoryDetail.getMemdId());
        }
        if(memoryDetail.getMemdId() == null
                &memoryDetail.getMemdType() == null
                &memoryDetail.getMemdSize() == null
                &memoryDetail.getMemdFreq() == null) {
            MemoryDetailExample memoryDetailExample1 = new MemoryDetailExample();
            MemoryDetailExample.Criteria criteria1 = memoryDetailExample1.createCriteria();
            criteria1.andMemdIdIsNotNull();
            List<MemoryDetail> memoryDetailList1 = memoryDetailMapper.selectByExample(memoryDetailExample1);
            return  memoryDetailList1;
        }else {
            List<MemoryDetail> memoryDetailList = memoryDetailMapper.selectByExample(memoryDetailExample);
            return memoryDetailList;
        }
    }

    @Override
    public List<MemoryDto> getMemorysLimit(List<MemoryDetail> memoryDetails, Integer start, Integer stop) {
        List<MemoryDto> memoryDtoList = new ArrayList<MemoryDto>();
        if (stop > memoryDetails.size()) {
            stop = memoryDetails.size();
        }
        for (Integer i = start; i < stop; i++) {
            MemoryDto memoryDto = new MemoryDto();
            memoryDto.setMemory(memoryMapper.selectByPrimaryKey(memoryDetails.get(i).getMemdId()));
            memoryDto.setMemoryDetail(memoryDetails.get(i));
            memoryDtoList.add(memoryDto);
        }
        return memoryDtoList;
    }

    @Override
    public List<VgaDetail> getVgaDetails(VgaDetail vgaDetail) {
        VgaDetailExample vgaDetailExample = new VgaDetailExample();
        VgaDetailExample.Criteria criteria = vgaDetailExample.createCriteria();
        if(vgaDetail.getVgadVender() != null){
            criteria.andVgadVenderEqualTo(vgaDetail.getVgadVender());
        }
        if(vgaDetail.getVgadCore() != null){
            criteria.andVgadCoreEqualTo(vgaDetail.getVgadCore());
        }
        if(vgaDetail.getVgadModel() != null){
            criteria.andVgadModelEqualTo(vgaDetail.getVgadModel());
        }
        if(vgaDetail.getVgadMemory() != null){
            criteria.andVgadMemoryEqualTo(vgaDetail.getVgadMemory());
        }
        if(vgaDetail.getVgadId() != null){
            criteria.andVgadIdEqualTo(vgaDetail.getVgadId());
        }
        if(vgaDetail.getVgadVender() == null
                &vgaDetail.getVgadCore() == null
                &vgaDetail.getVgadModel() == null
                &vgaDetail.getVgadMemory() == null
                &vgaDetail.getVgadId() == null){
            VgaDetailExample vgaDetailExample1 = new VgaDetailExample();
            VgaDetailExample.Criteria criteria1 = vgaDetailExample1.createCriteria();
            criteria1.andVgadIdIsNotNull();
            List<VgaDetail> vgaDetailList1 = vgaDetailMapper.selectByExample(vgaDetailExample1);
            return vgaDetailList1;
        }else {
            return vgaDetailMapper.selectByExample(vgaDetailExample);
        }
    }

    @Override
    public List<VgaDto> getVgasLimit(List<VgaDetail> vgaDetails, Integer start, Integer stop) {
        List<VgaDto> vgaDtoList = new ArrayList<VgaDto>();
        if (stop > vgaDetails.size()) {
            stop = vgaDetails.size();
        }
        for (Integer i = start; i < stop; i++) {
            VgaDto vgaDto = new VgaDto();
            vgaDto.setVga(vgaMapper.selectByPrimaryKey(vgaDetails.get(i).getVgadId()));
            vgaDto.setVgaDetail(vgaDetails.get(i));
            vgaDtoList.add(vgaDto);
        }
        return vgaDtoList;
    }

    @Override
    public List<PowerDetail> getPowerDetails(PowerDetail powerDetail) {
        PowerDetailExample powerDetailExample = new PowerDetailExample();
        PowerDetailExample.Criteria criteria = powerDetailExample.createCriteria();
        if(powerDetail.getPowerdPower() != null){
            criteria.andPowerdPowerEqualTo(powerDetail.getPowerdPower());
        }
        if(powerDetail.getPowerdStandard() != null){
            criteria.andPowerdStandardEqualTo(powerDetail.getPowerdStandard());
        }
        if(powerDetail.getPowerdId() != null){
            criteria.andPowerdIdEqualTo(powerDetail.getPowerdId());
        }
        if(powerDetail.getPowerdPower() == null
                &powerDetail.getPowerdStandard() == null
                &powerDetail.getPowerdStandard() == null){
            PowerDetailExample powerDetailExample1 = new PowerDetailExample();
            PowerDetailExample.Criteria criteria1 = powerDetailExample1.createCriteria();
            criteria1.andPowerdIdIsNotNull();
            return powerDetailMapper.selectByExample(powerDetailExample1);
        }else {
            return powerDetailMapper.selectByExample(powerDetailExample);
        }
    }

    @Override
    public List<PowerDto> getPowersLimit(List<PowerDetail> powerDetails, Integer start, Integer stop) {
        List<PowerDto> powerDtoList = new ArrayList<PowerDto>();
        if (stop > powerDetails.size()) {
            stop = powerDetails.size();
        }
        for (Integer i = start; i < stop; i++) {
            PowerDto powerDto = new PowerDto();
            powerDto.setPower(powerMapper.selectByPrimaryKey(powerDetails.get(i).getPowerdId()));
            powerDto.setPowerDetail(powerDetails.get(i));
            powerDtoList.add(powerDto);
        }
        return powerDtoList;
    }

    @Override
    public List<CpuDto> searchCpuPartLike(String searchContent,Integer start,Integer stop) {
        List<CpuDto> cpuDtoList = new ArrayList<CpuDto>();
        CpuExample cpuExample = new CpuExample();
        CpuExample.Criteria criteria = cpuExample.createCriteria();
        CpuExample.Criteria criteria1 = cpuExample.createCriteria();
        criteria.andCpuNameLike("%"+searchContent+"%");
        criteria1.andCpuDescribeLike("%"+searchContent+"%");
        cpuExample.or(criteria1);
        List<Cpu> cpuList = cpuMapper.selectByExample(cpuExample);

        if(stop > cpuList.size()){
            stop = cpuList.size();
        }
        for (Integer i = start; i < stop; i++) {
            CpuDto cpuDto = new CpuDto();
            cpuDto.setCpu(cpuList.get(i));
            CpuDetail cpuDetail = cpuDetailMapper.selectByPrimaryKey(cpuList.get(i).getCpuId());
            if(cpuDetail != null){
                cpuDto.setCpuDetail(cpuDetail);
            }else {
                cpuDto.setCpuDetail(new CpuDetail());
            }
            cpuDtoList.add(cpuDto);
        }
        return cpuDtoList;
    }

    @Override
    public  List<MemoryDto> searchMemoryPartLike(String searchContent,Integer start,Integer stop){
        List<MemoryDto> memoryDtoList = new ArrayList<MemoryDto>();
        MemoryExample memoryExample = new MemoryExample();
        MemoryExample.Criteria criteria = memoryExample.createCriteria();
        MemoryExample.Criteria criteria1 = memoryExample.createCriteria();
        criteria1.andMemDescribeLike("%"+searchContent+"%");
        criteria.andMemNameLike("%"+searchContent+"%");
        memoryExample.or(criteria1);
        List<Memory> memoryList = memoryMapper.selectByExample(memoryExample);

        if(stop > memoryList.size()){
            stop = memoryList.size();
        }
        for (Integer i = start; i < stop; i++) {
            MemoryDto memoryDto = new MemoryDto();
            memoryDto.setMemory(memoryList.get(i));
            MemoryDetail memoryDetail  = memoryDetailMapper.selectByPrimaryKey(memoryList.get(i).getMemId());
            if(memoryDetail != null){
                memoryDto.setMemoryDetail(memoryDetail);
            }else {
                memoryDto.setMemoryDetail(new MemoryDetail());
            }
            memoryDtoList.add(memoryDto);
        }
        return memoryDtoList;
    }

    @Override
    public List<BoardDto> searchBoardPartLike(String searchContent,Integer start,Integer stop){
        List<BoardDto> boardDtoList = new ArrayList<BoardDto>();
        BoardExample boardExample = new BoardExample();
        BoardExample.Criteria criteria = boardExample.createCriteria();
        BoardExample.Criteria criteria1 = boardExample.createCriteria();
        criteria.andBoardNameLike("%"+searchContent+"%");
        criteria1.andBoardDescribeLike("%"+searchContent+"%");
        boardExample.or(criteria1);
        List<Board> boardList = boardMapper.selectByExample(boardExample);

        if(stop > boardList.size()){
            stop = boardList.size();
        }
        for (Integer i = start; i < stop; i++) {
            BoardDto boardDto = new BoardDto();
            BoardDetail boardDetail = boardDetailMapper.selectByPrimaryKey(boardList.get(i).getBoardId());
            if(boardDetail !=null){
                boardDto.setBoardDetail(boardDetail);
            }else {
                boardDto.setBoardDetail(new BoardDetail());
            }
            boardDto.setBoard(boardList.get(i));
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }

    @Override
    public List<PowerDto> searchPowerPartLike(String searchContent,Integer start,Integer stop){
        List<PowerDto> powerDtoList = new ArrayList<PowerDto>();
        PowerExample powerExample = new PowerExample();
        PowerExample.Criteria criteria = powerExample.createCriteria();
        PowerExample.Criteria criteria1 = powerExample.createCriteria();
        criteria1.andPowerDescribeLike("%"+searchContent+"%");
        criteria.andPowerNameLike("%"+searchContent+"%");
        powerExample.or(criteria1);
        List<Power> powerList = powerMapper.selectByExample(powerExample);

        if(stop > powerList.size()){
            stop = powerList.size();
        }
        for (Integer i = start; i < stop; i++) {
            PowerDto powerDto = new PowerDto();
            PowerDetail powerDetail = powerDetailMapper.selectByPrimaryKey(powerList.get(i).getPowerId());
            if(powerDetail !=null){
                powerDto.setPowerDetail(powerDetail);
            }else {
                powerDto.setPowerDetail(new PowerDetail());
            }
            powerDto.setPower(powerList.get(i));
            powerDtoList.add(powerDto);
        }
        return powerDtoList;
    }

    @Override
    public List<VgaDto> searchVgaPartLike(String searchContent,Integer start,Integer stop){
        List<VgaDto> vgaDtoList = new ArrayList<VgaDto>();
        VgaExample vgaExample = new VgaExample();
        VgaExample.Criteria criteria = vgaExample.createCriteria();
        VgaExample.Criteria criteria1 = vgaExample.createCriteria();
        criteria1.andVgaDescribeLike("%"+searchContent+"%");
        criteria.andVgaNameLike("%"+searchContent+"%");
        vgaExample.or(criteria1);
        List<Vga> vgaList = vgaMapper.selectByExample(vgaExample);

        if(stop > vgaList.size()){
            stop = vgaList.size();
        }
        for (Integer i = start; i < stop; i++) {
            VgaDto vgaDto = new VgaDto();
            vgaDto.setVga(vgaList.get(i));
            VgaDetail vgaDetail = vgaDetailMapper.selectByPrimaryKey(vgaList.get(i).getVgaId());
            if(vgaDetail !=null){
                vgaDto.setVgaDetail(vgaDetail);
            }else {
                vgaDetail = new VgaDetail();
                vgaDto.setVgaDetail(vgaDetail);
            }
            vgaDtoList.add(vgaDto);
        }
        return vgaDtoList;
    }
}
