package org.mycompany.myproduct.Models.Service;

import org.mycompany.myproduct.Models.DTO.MvpDTO;
import org.mycompany.myproduct.Models.Entity.MVP;
import org.mycompany.myproduct.Models.Mapper.MapperMVP;
import org.mycompany.myproduct.Models.Repository.MvpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class MvpServiceImpl implements MvpService{


    private MapperMVP mapper;
    private MvpRepository repository;

    /**
     * This paramethers is for autowired
     * @param mapper
     * @param repository
     */

    @Autowired
    public MvpServiceImpl(MapperMVP mapper,MvpRepository repository ){
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public MvpDTO create(MvpDTO mvpDTO) {
        MVP mvp = mapper.entityToDTO(mvpDTO);
        return (MvpDTO) mapper.DTOtoEntity(repository.save(mvp));
    }

    @Override
    public List<MvpDTO> findAll() {
        List<MVP> project = repository.findAll();

        List<MvpDTO> mappedProject = new LinkedList<>();
        for (MVP c : project) {
            mappedProject.add(mapper.DTOtoEntity(c));
        }
        return mappedProject;
    }

    @Override
    public void updateProject(long id, MvpDTO mvpDTO) throws Exception {
        Optional<MVP> result = repository.findById(id);

        if (result.isEmpty()) {
            throw new Exception("No existe proyecto");
        }
        MVP mvp = result.get();
        mvp.setIdMvp(mvpDTO.getIdMvp());
        mvp.setLocation(mvpDTO.getLocation());
        mvp.setNameProject(mvpDTO.getNameProject());
        mvp.setStartDate(mvp.getStartDate());
        mvp.setEndDate(mvp.getEndDate());
        mvp.setCostCenter(mvpDTO.getCostCenter());
        mvp.setBubget(mvpDTO.getBubget());
        mvp.setStakeHolder(mvpDTO.getStakeHolder());
        mvp.setProductOwner(mvpDTO.getProductOwner());
        repository.save(mvp);
    }

    @Override
    public void deleteProject(long id) throws Exception {
        Optional<MVP> result = repository.findById(id);
        if(result.isEmpty()){
            throw  new Exception("No existe");
        }
        repository.deleteById(id);
    }
}
