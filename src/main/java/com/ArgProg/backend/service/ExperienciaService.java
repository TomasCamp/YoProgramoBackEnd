package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Experiencia;
import com.ArgProg.backend.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    public ExperienciaRepository experienciaRepository;
    
    public List<Experiencia> verExperiencias() {
        return experienciaRepository.findAll();
    }
    public void salvarExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }
    public void borrarExperiencia(Long id) {
        experienciaRepository.deleteById(id);
    }
}
