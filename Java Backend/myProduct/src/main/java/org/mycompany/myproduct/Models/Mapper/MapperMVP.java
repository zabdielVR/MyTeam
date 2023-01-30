package org.mycompany.myproduct.Models.Mapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mycompany.myproduct.Models.DTO.MvpDTO;
import org.mycompany.myproduct.Models.Entity.MVP;


@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MapperMVP {

    MvpDTO DTOtoEntity(MVP mvp);
    MVP entityToDTO(MvpDTO mvpDTO);

}
