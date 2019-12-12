/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yt.lan.commons.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yt.lan.commons.dto.Ns10Dto;
import yt.lan.commons.dto.ResponseDto;
import yt.lan.commons.service.Ns10Service;

/**
 * created at: 22.11.2019
 * @author Ro'zimboyev Ulug'bek <ulugbekrozimboyev@gmail.com>
 */
@RestController
@RequestMapping("/api")
public class Ns10Controller {
    
    private final Logger log = LoggerFactory.getLogger(Ns10Controller.class);
    
    private final Ns10Service ns10Service;

    public Ns10Controller(Ns10Service ns10Service) {
        this.ns10Service = ns10Service;
    }
    
    
    @GetMapping("/commons/ns10")
    public ResponseDto<List<Ns10Dto>> getNs10() {
        log.debug("REST request to get a page of SpProjectStates");
        List<Ns10Dto> list = ns10Service.findAll();
        return ResponseDto.ok(list);
    }
    
}
