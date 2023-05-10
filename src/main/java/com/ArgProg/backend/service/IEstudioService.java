package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Estudio;
import java.util.List;

public interface IEstudioService {
    public List<Estudio> verEstudios();
    public void salvarEstudios(Estudio estudio);
    public void borrarEstudios(Long id);
}
