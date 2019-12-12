/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yt.lan.commons.dto.InDto;
import yt.lan.commons.dto.YurNp1Dto;
import yt.lan.commons.repository.YurNp1Repository;
import yt.lan.commons.service.mapper.YurNp1Mapper;

/**
 *
 * @author Web
 */
@Service
@Transactional
public class YurNp1Service {
    
    private final Logger log = LoggerFactory.getLogger(YurNp1Service.class);
    
    private final YurNp1Repository yurNp1Repository;
    private final YurNp1Mapper yurNp1Mapper;
    
    public YurNp1Service(YurNp1Repository yurNp1Repository, YurNp1Mapper yurNp1Mapper){
        this.yurNp1Repository = yurNp1Repository;
        this.yurNp1Mapper = yurNp1Mapper;
    }
    
    public YurNp1Dto findOne(InDto inDto){
        log.debug("YurNp1 search error");
        Optional<YurNp1Dto> optional = yurNp1Repository.findByTin(inDto.getTin()).map(yurNp1Mapper::toDto);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
