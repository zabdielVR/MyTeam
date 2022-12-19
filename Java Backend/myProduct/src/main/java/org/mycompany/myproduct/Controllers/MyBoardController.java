/***
 * @Autor: ittai vazquez
 * @since 2022-12-18
 * @version 1.0
 * This a class to request the rest services
 */

package org.mycompany.myproduct.Controllers;
import org.mycompany.myproduct.Models.Dao.MyBoardDTO;
import org.mycompany.myproduct.Models.Service.IMyBoard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MyBoardController{

    Logger logger = LoggerFactory.getLogger(MyBoardController.class);

    private IMyBoard iMyBoard;

    @Autowired
    public MyBoardController(IMyBoard iMyBoard){
        this.iMyBoard = iMyBoard;

    }

    @PostMapping("/projects")
    @ResponseStatus(HttpStatus.CREATED)
    public MyBoardDTO save(@RequestBody MyBoardDTO data) {
        logger.trace("request for a call type Post");
        return iMyBoard.create(data);
    }

    @GetMapping("/allProjects")
    public List<MyBoardDTO> index() {
        logger.trace("request for a call type Get");
        return iMyBoard.findAll();
    }

    @PutMapping("/projects/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@PathVariable("id") long id, @RequestBody MyBoardDTO data) throws Exception {
        logger.trace("request for a call type Put");
        iMyBoard.updateProject(id, data);
    }

    @DeleteMapping("/deleteProject/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) throws Exception {
        logger.trace("request for a call type Delete");
        iMyBoard.deleteProject(id);
    }


}
