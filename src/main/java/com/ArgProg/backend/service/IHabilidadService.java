package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    public List<Habilidad> verHabilidades();
    public void salvarHabilidad(Habilidad habilidad);
    public void borrarHabilidad(Long id);
}
