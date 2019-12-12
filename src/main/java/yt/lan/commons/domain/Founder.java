/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 *
 * @author Web
 */
@Data
@Entity
@Table(name = "np3")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Founder implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name = "TIN")
    private String tin;
    @Column(name = "TIN_uch")
    private String tin_uch;
    @Column(name = "NAME")
    private String name;
}
