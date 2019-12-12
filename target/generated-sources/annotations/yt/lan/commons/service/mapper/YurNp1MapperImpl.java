package yt.lan.commons.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import yt.lan.commons.domain.YurNp1;
import yt.lan.commons.dto.YurNp1Dto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-12T12:49:21+0500",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
@Component
public class YurNp1MapperImpl implements YurNp1Mapper {

    @Override
    public YurNp1 toEntity(YurNp1Dto dto) {
        if ( dto == null ) {
            return null;
        }

        YurNp1 yurNp1 = new YurNp1();

        yurNp1.setTin( dto.getTin() );
        yurNp1.setName( dto.getName() );
        if ( dto.getNs10_code() != null ) {
            yurNp1.setNs10_code( dto.getNs10_code().shortValue() );
        }
        if ( dto.getNs11_code() != null ) {
            yurNp1.setNs11_code( dto.getNs11_code().shortValue() );
        }
        yurNp1.setDate_reg( dto.getDate_reg() );
        yurNp1.setFio1( dto.getFio1() );
        yurNp1.setFio2( dto.getFio2() );
        yurNp1.setGd_tin( dto.getGd_tin() );
        yurNp1.setGb_tin( dto.getGb_tin() );
        if ( dto.getState() != null ) {
            yurNp1.setState( dto.getState().shortValue() );
        }
        yurNp1.setAddress( dto.getAddress() );
        yurNp1.setMfo( dto.getMfo() );

        return yurNp1;
    }

    @Override
    public YurNp1Dto toDto(YurNp1 entity) {
        if ( entity == null ) {
            return null;
        }

        YurNp1Dto yurNp1Dto = new YurNp1Dto();

        yurNp1Dto.setTin( entity.getTin() );
        yurNp1Dto.setName( entity.getName() );
        if ( entity.getNs10_code() != null ) {
            yurNp1Dto.setNs10_code( entity.getNs10_code().intValue() );
        }
        if ( entity.getNs11_code() != null ) {
            yurNp1Dto.setNs11_code( entity.getNs11_code().intValue() );
        }
        yurNp1Dto.setDate_reg( entity.getDate_reg() );
        yurNp1Dto.setFio1( entity.getFio1() );
        yurNp1Dto.setFio2( entity.getFio2() );
        yurNp1Dto.setGd_tin( entity.getGd_tin() );
        yurNp1Dto.setGb_tin( entity.getGb_tin() );
        if ( entity.getState() != null ) {
            yurNp1Dto.setState( entity.getState().intValue() );
        }
        yurNp1Dto.setAddress( entity.getAddress() );
        yurNp1Dto.setMfo( entity.getMfo() );

        return yurNp1Dto;
    }

    @Override
    public List<YurNp1> toEntity(List<YurNp1Dto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<YurNp1> list = new ArrayList<YurNp1>( dtoList.size() );
        for ( YurNp1Dto yurNp1Dto : dtoList ) {
            list.add( toEntity( yurNp1Dto ) );
        }

        return list;
    }

    @Override
    public List<YurNp1Dto> toDto(List<YurNp1> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<YurNp1Dto> list = new ArrayList<YurNp1Dto>( entityList.size() );
        for ( YurNp1 yurNp1 : entityList ) {
            list.add( toDto( yurNp1 ) );
        }

        return list;
    }
}
