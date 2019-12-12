/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * created at: 22.11.2019
 * @author Ro'zimboyev Ulug'bek <ulugbekrozimboyev@gmail.com>
 */
@Data
@Entity
@Table(name = "ns10")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Ns10 implements Serializable {
    
    @Id
    private Integer code;
    
    @Column(name = "name_Uz")
    private String nameUz;
    @Column(name = "name_Ru")
    private String nameRu;

}
