package com.ArgProg.backend.service;

import com.ArgProg.backend.dto.UsuarioDTO;

public interface IUsuarioDTOService {
    public UsuarioDTO getUsuarioDTO(Long id);
    public void salvarUsuarioDTO(UsuarioDTO user);
}
