package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Proyecto;
import com.ArgProg.backend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    public ProyectoRepository proyectoRepository;
    
    public List<Proyecto> verProyectos() {
        return proyectoRepository.findAll();
    }
    public void salvarProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }
    public void borrarProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }
}
