/***
 * @Autor: ittai vazquez
 * @since 2022-12-18
 * @version 1.0
 * This class is the service layer where we also inject the dependencies of the mapper and the entity
 */


package org.mycompany.myproduct.Models.Service;

import org.mycompany.myproduct.Models.Dao.MyBoardDTO;
import org.mycompany.myproduct.Models.Entity.MyBoard;
import org.mycompany.myproduct.Models.Mapper.MyBoardMapper;
import org.mycompany.myproduct.Models.Repository.MyBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class MyBoardImp implements IMyBoard{


    private MyBoardMapper mapper;
    private MyBoardRepository repository;

    @Autowired
    public MyBoardImp(MyBoardMapper mapper,MyBoardRepository repository){
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public MyBoardDTO create(MyBoardDTO myBoardDTO) {
        MyBoard myBoard = mapper.DtoToMyBoard(myBoardDTO);
        return (MyBoardDTO) mapper.toDtos(repository.save(myBoard)) ;
    }

    @Override
    public List<MyBoardDTO> findAll(){
        List<MyBoard> project = repository.findAll();

        List<MyBoardDTO> mappedProject = new LinkedList<>();
        for (MyBoard c : project) {
            mappedProject.add(mapper.toDtos(c));
        }
        return mappedProject;

    }

    @Override
    public void updateProject(long id, MyBoardDTO data) throws Exception {
        Optional<MyBoard> result = repository.findById(id);

        if (result.isEmpty()) {
            throw new Exception("No existe proyecto");
        }
        MyBoard myBoard = result.get();
        myBoard.setProjectName(data.getProjectName());
        repository.save(myBoard);
    }

    @Override
    public void deleteProject(long id) throws Exception {
        Optional<MyBoard> result = repository.findById(id);
        if (result.isEmpty()) {
            throw new Exception("Dont exists Project in database");
        }

        repository.deleteById(id);
    }

}
