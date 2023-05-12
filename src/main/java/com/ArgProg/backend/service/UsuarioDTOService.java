package com.ArgProg.backend.service;

import com.ArgProg.backend.dto.UsuarioDTO;
import com.ArgProg.backend.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioDTOService implements IUsuarioDTOService {
    @Autowired
    public IUsuarioService usuarioService;
    
    public UsuarioDTO getUsuarioDTO(Long id) {
        return new UsuarioDTO(usuarioService.getUsuario(id));
    }
    public void salvarUsuarioDTO(UsuarioDTO user) {
        Usuario usuario = usuarioService.getUsuario(user.getIdUsuario());
        usuarioService.salvarUsuario(usuario);
    }
}
