/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import yt.lan.commons.dto.InDto;
import yt.lan.commons.dto.YurNp1Dto;
import yt.lan.commons.service.YurNp1Service;

/**
 *
 * @author Web
 */
@RestController
@RequestMapping("/api")
public class YurNp1Controller {

    private final Logger log = LoggerFactory.getLogger(YurNp1Controller.class);

    private final YurNp1Service yurNp1Service;

    public YurNp1Controller(YurNp1Service yurNp1Service) {
        this.yurNp1Service = yurNp1Service;
    }

    @RequestMapping(value = "/myapp/yur-info", method = RequestMethod.POST)
    public YurNp1Dto yurNp1(@RequestBody InDto inDto) {
        try {
            YurNp1Dto res = yurNp1Service.findOne(inDto);
            res.setSend_id(inDto.getSend_id());
            res.setSend_date(inDto.getSend_date());
            return res;
        } catch (Exception e) {
            return null;
        }
    }
}
