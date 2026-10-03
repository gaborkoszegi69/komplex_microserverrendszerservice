package hu.komplexmicroservice.rendszerservice.mapper;

import hu.komplexmicroservice.rendszerservice.api.model.TMenuparameterekDto;
import hu.komplexmicroservice.rendszerservice.model.TMenuparameterek1;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface Menuparameterek1Mapper {
    TMenuparameterekDto TMenuparameterekToDto(TMenuparameterek1 tMenuparameterek1);
    TMenuparameterek1 dtoToTMenuparameterek1(TMenuparameterekDto tmenuparameterekDto);

    List<TMenuparameterekDto> TMenuparametereksToDtos(List<TMenuparameterek1> tMenuparameterek1s);
    List<TMenuparameterek1> dtosToTMenuparametereks(List<TMenuparameterekDto> tMenuparameterekDtos);

}
