package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Estudio;
import com.ArgProg.backend.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService{
    @Autowired
    public EstudioRepository estudioRepository;
    
    public List<Estudio> verEstudios() {
        return estudioRepository.findAll();
    }
    public void salvarEstudio(Estudio estudio) {
        estudioRepository.save(estudio);
    }
    public void borrarEstudio(Long id) {
        estudioRepository.deleteById(id);
    }
}
