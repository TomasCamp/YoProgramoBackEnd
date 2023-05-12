package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Estudio;
import java.util.List;

public interface IEstudioService {
    public List<Estudio> verEstudios();
    public void salvarEstudio(Estudio estudio);
    public void borrarEstudio(Long id);
}
