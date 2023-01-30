package org.mycompany.myproduct.Models.Service;

import org.mycompany.myproduct.Models.DTO.MvpDTO;

import java.util.List;

public interface MvpService {


    public MvpDTO create(MvpDTO mvpDTO);
    public List<MvpDTO> findAll();
    public void updateProject(long id, MvpDTO data) throws Exception;
    public void deleteProject(long id) throws Exception;

}
