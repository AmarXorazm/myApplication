/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.service.mapper;

import org.mapstruct.Mapper;
import yt.lan.commons.domain.YurNp1;
import yt.lan.commons.dto.YurNp1Dto;

/**
 *
 * @author Web
 */
@Mapper(componentModel = "spring", uses = {})
public interface YurNp1Mapper extends EntityMapper<YurNp1Dto, YurNp1>{
    
    default YurNp1 fromId(String tin) {
        if (tin == null) {
            return null;
        }
        YurNp1 yurNp1 = new YurNp1();
        yurNp1.setTin(tin);
        return yurNp1;
    }
}
