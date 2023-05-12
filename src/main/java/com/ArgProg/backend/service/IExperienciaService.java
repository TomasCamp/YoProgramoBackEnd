package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    public void salvarExperiencia(Experiencia experiencia);
    public void borrarExperiencia(Long id);
}
