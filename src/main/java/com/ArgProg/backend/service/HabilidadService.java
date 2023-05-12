package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Habilidad;
import com.ArgProg.backend.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{
    @Autowired
    public HabilidadRepository habilidadRepository;
    
    public List<Habilidad> verHabilidades() {
        return habilidadRepository.findAll();
    }
    public void salvarHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }
    public void borrarHabilidad(Long id) {
        habilidadRepository.deleteById(id);
    }
}
