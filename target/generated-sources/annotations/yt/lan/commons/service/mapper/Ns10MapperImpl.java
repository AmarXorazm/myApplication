package yt.lan.commons.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import yt.lan.commons.domain.Ns10;
import yt.lan.commons.dto.Ns10Dto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-12T12:49:21+0500",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
@Component
public class Ns10MapperImpl implements Ns10Mapper {

    @Override
    public Ns10 toEntity(Ns10Dto dto) {
        if ( dto == null ) {
            return null;
        }

        Ns10 ns10 = new Ns10();

        ns10.setCode( dto.getCode() );
        ns10.setNameUz( dto.getNameUz() );
        ns10.setNameRu( dto.getNameRu() );

        return ns10;
    }

    @Override
    public Ns10Dto toDto(Ns10 entity) {
        if ( entity == null ) {
            return null;
        }

        Ns10Dto ns10Dto = new Ns10Dto();

        ns10Dto.setCode( entity.getCode() );
        ns10Dto.setNameUz( entity.getNameUz() );
        ns10Dto.setNameRu( entity.getNameRu() );

        return ns10Dto;
    }

    @Override
    public List<Ns10> toEntity(List<Ns10Dto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Ns10> list = new ArrayList<Ns10>( dtoList.size() );
        for ( Ns10Dto ns10Dto : dtoList ) {
            list.add( toEntity( ns10Dto ) );
        }

        return list;
    }

    @Override
    public List<Ns10Dto> toDto(List<Ns10> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<Ns10Dto> list = new ArrayList<Ns10Dto>( entityList.size() );
        for ( Ns10 ns10 : entityList ) {
            list.add( toDto( ns10 ) );
        }

        return list;
    }
}
