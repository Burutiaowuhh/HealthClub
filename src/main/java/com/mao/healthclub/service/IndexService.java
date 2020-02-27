package com.mao.healthclub.service;

import com.mao.healthclub.dto.IndexCoachDTO;
import com.mao.healthclub.dto.IndexServiceDTO;
import com.mao.healthclub.mapper.CoachMapper;
import com.mao.healthclub.mapper.ServiceMapper;
import com.mao.healthclub.model.Coach;
import com.mao.healthclub.model.CoachExample;
import com.mao.healthclub.model.ServiceExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IndexService {

    @Autowired
    private ServiceMapper serviceMapper;
    @Autowired
    private CoachMapper coachMapper;

    public List<IndexServiceDTO> getIndexServiceInfo() {
        ServiceExample serviceExample = new ServiceExample();
        List<com.mao.healthclub.model.Service> services = serviceMapper.selectByExampleWithRowbounds(serviceExample, new RowBounds(0, 3));
        List<IndexServiceDTO> indexServiceDTOList = services.stream().map(service -> {
            IndexServiceDTO indexServiceDTO = new IndexServiceDTO();
            indexServiceDTO.setName(service.getName());
            indexServiceDTO.setIntroduction(service.getIntroduction());
            indexServiceDTO.setPic(service.getPic());
            return indexServiceDTO;
        }).collect(Collectors.toList());
        return indexServiceDTOList;
    }

    public List<IndexCoachDTO> getIndexCoachInfo() {
        List<Coach> coachList = coachMapper.selectByExampleWithRowbounds(new CoachExample(), new RowBounds(0, 4));
        List<IndexCoachDTO> indexCoachDTOList = coachList.stream().map(coach -> {
            IndexCoachDTO indexCoachDTO = new IndexCoachDTO();
            indexCoachDTO.setId(coach.getId());
            indexCoachDTO.setName(coach.getName());
            indexCoachDTO.setFeature(coach.getFeature());
            indexCoachDTO.setExperience(coach.getExperience());
            indexCoachDTO.setPic(coach.getPic());
            return indexCoachDTO;
        }).collect(Collectors.toList());
        return indexCoachDTOList;
    }
}
