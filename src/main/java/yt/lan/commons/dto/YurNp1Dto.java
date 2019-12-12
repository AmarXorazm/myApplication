/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yt.lan.commons.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Web
 */
@Data
public class YurNp1Dto implements Serializable{
    
    private String send_id;
    private String send_date;
    private String tin;
    private String name;
    private Integer ns10_code;
    private Integer ns11_code;
    private Date date_reg;
    private String fio1;
    private String fio2;
    private String gd_tin;
    private String gb_tin;
    private Integer state;
    private String address;
    private String mfo;
//    private List<FounderDto> founders;
}
