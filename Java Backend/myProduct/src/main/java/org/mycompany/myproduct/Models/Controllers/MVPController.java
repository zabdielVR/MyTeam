package org.mycompany.myproduct.Models.Controllers;

import org.mycompany.myproduct.Models.DTO.MvpDTO;
import org.mycompany.myproduct.Models.Service.MvpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MVPController {


    private MvpServiceImpl mvpService;
    @Autowired
    public MVPController(MvpServiceImpl mvpService){
        this.mvpService = mvpService;
    }


    @PostMapping("/mvp")
    @ResponseStatus(HttpStatus.CREATED)
    public MvpDTO save(@RequestBody MvpDTO data) {
        return mvpService.create(data);
    }

    @GetMapping("/allmvps/")
    public List<MvpDTO> index() {
        return mvpService.findAll();
    }

    @PutMapping("/mvp/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@PathVariable("id") long id, @RequestBody MvpDTO mvpDTO) throws Exception {

        mvpService.updateProject(id, mvpDTO);
    }

    @DeleteMapping("/deletemvp/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) throws Exception {
        mvpService.deleteProject(id);
    }



}
