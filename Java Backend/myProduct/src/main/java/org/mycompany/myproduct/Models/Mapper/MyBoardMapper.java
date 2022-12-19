/***
 * @Autor: ittai vazquez
 * @since 2022-12-18
 * @version 1.0
 * This Interface implements a layer mapper between entity and DTO
 */

package org.mycompany.myproduct.Models.Mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mycompany.myproduct.Models.Dao.MyBoardDTO;
import org.mycompany.myproduct.Models.Entity.MyBoard;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MyBoardMapper {


    MyBoardDTO toDtos(MyBoard  myBoard);
    MyBoard DtoToMyBoard(MyBoardDTO myBoardDTO);

}
