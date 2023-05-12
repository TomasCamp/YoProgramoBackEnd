package com.ArgProg.backend.service;

import com.ArgProg.backend.dto.VistaDTO;

public interface IVistaDTOService {
    public VistaDTO getVistDTO(Long id);
    public void salvarVistaDTO(VistaDTO vista);
}
