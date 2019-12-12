/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.service.mapper;

import org.mapstruct.Mapper;
import yt.lan.commons.domain.Ns10;
import yt.lan.commons.dto.Ns10Dto;

/**
 *
 * @author Ro'zimboyev Ulug'bek <ulugbekrozimboyev@gmail.com>
 */
@Mapper(componentModel = "spring", uses = {})
public interface Ns10Mapper extends EntityMapper<Ns10Dto, Ns10> {
        default Ns10 fromId(Integer code) {
        if (code == null) {
            return null;
        }
        Ns10 ns10 = new Ns10();
        ns10.setCode(code);
        return ns10;
    }
}
