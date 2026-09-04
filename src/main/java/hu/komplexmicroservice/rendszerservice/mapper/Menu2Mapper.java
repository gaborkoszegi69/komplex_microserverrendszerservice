package hu.komplexmicroservice.rendszerservice.mapper;

import hu.komplexmicroservice.rendszerservice.api.model.TMenu2Dto;
import hu.komplexmicroservice.rendszerservice.model.TMenu2;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface Menu2Mapper {
    TMenu2Dto TMenu2DToDto(TMenu2 tMenu2);
    TMenu2 dtoToTMenu2(TMenu2Dto tmenu2Dto);

    List<TMenu2Dto> TMenu2sToDtos(List<TMenu2> tMenu2s);
    List<TMenu2> dtosToTMenu2s(List<TMenu2Dto> tMenu2Dtos);
}
