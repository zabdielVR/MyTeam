package org.fakecompany.fakemvp.MapStruct;


import org.mapstruct.InjectionStrategy;
import org.mapstruct.ap.MappingProcessor.*;
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface Mapper {


}
