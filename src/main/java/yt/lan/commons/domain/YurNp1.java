/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 *
 * @author Web
 */
@Data
@Entity
@Table(name = "yur_np1")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class YurNp1 implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TIN")
    private String tin;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NS10_CODE")
    private Short ns10_code;
    @Column(name = "NS11_CODE")
    private Short ns11_code;
    @Column(name = "REG_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_reg;
    @Column(name = "GD_FULL_NAME")
    private String fio1;
    @Column(name = "GB_FULL_NAME")
    private String fio2;
    @Column(name = "GD_TIN")
    private String gd_tin;
    @Column(name = "GB_TIN")
    private String gb_tin;
    @Column(name = "NS13_CODE")
    private Short state;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "NC2_CODE")
    private String mfo;
//    @OneToMany(targetEntity = Founder.class, fetch = FetchType.LAZY)
//    @JoinColumn(name="TIN", nullable=true)
//    private List<Founder> founders;
}
