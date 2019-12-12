/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yt.lan.commons.domain.Ns10;

/**
 *
 * @author Ro'zimboyev Ulug'bek <ulugbekrozimboyev@gmail.com>
 */
@SuppressWarnings("unused")
@Repository
public interface Ns10Repository extends JpaRepository<Ns10, Integer>{
    
}
