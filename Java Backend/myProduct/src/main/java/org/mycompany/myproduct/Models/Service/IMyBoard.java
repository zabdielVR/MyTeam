/***
 * @Autor: ittai vazquez
 * @since 2022-12-18
 * @version 1.0
 * this interface implements the different methods to commit the database
 */

package org.mycompany.myproduct.Models.Service;

import org.mycompany.myproduct.Models.Dao.MyBoardDTO;
import org.mycompany.myproduct.Models.Entity.MyBoard;
import org.springframework.http.ResponseEntity;


import java.util.List;

public interface IMyBoard {

    public MyBoardDTO create(MyBoardDTO myBoardDTO);
    public List<MyBoardDTO> findAll();
    public void updateProject(long id, MyBoardDTO data) throws Exception;
    public void deleteProject(long id) throws Exception;

}
