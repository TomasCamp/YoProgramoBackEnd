package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> verProyecto();
    public void salvarProyecto(Proyecto proyecto);
    public void borrarProyecto(Long id);
}
