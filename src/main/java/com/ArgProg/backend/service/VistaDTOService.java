package com.ArgProg.backend.service;

import com.ArgProg.backend.dto.VistaDTO;
import com.ArgProg.backend.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VistaDTOService implements IVistaDTOService {
    @Autowired
    public IUsuarioService usuarioService;
    
    public VistaDTO getVistDTO(Long id) {
        return new VistaDTO(usuarioService.getUsuario(id));
    }
    public void salvarVistaDTO(VistaDTO vista) {
        Usuario usuario = usuarioService.getUsuario(vista.getIdUsuario());
        usuarioService.salvarUsuario(usuario);
    }
}
