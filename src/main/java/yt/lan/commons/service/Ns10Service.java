/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yt.lan.commons.service;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yt.lan.commons.repository.Ns10Repository;
import yt.lan.commons.service.mapper.Ns10Mapper;
import yt.lan.commons.dto.Ns10Dto;

/**
 * created at: 22.11.2019
 * @author Ro'zimboyev Ulug'bek <ulugbekrozimboyev@gmail.com>
 */
@Service
@Transactional
public class Ns10Service {

    private final Logger log = LoggerFactory.getLogger(Ns10Service.class);
    
    private final Ns10Repository ns10Repository;

    private final Ns10Mapper ns10Mapper;

    public Ns10Service(Ns10Repository ns10Repository, Ns10Mapper ns10Mapper) {
        this.ns10Repository = ns10Repository;
        this.ns10Mapper = ns10Mapper;
    }

    /**
     * Get all the ns10.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    @Cacheable("ns10")
    public List<Ns10Dto> findAll() {
        log.debug("Request to get all Ns10");
        return ns10Repository.findAll().stream()
            .map(ns10Mapper::toDto)
            .collect(Collectors.toList());
    }
    
}
