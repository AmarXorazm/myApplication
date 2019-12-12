/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yt.lan.commons.domain.YurNp1;

/**
 *
 * @author Web
 */
@SuppressWarnings("unused")
@Repository
public interface YurNp1Repository extends JpaRepository<YurNp1, Long>{

    public Optional<YurNp1> findByTin(String tin);
    
}
