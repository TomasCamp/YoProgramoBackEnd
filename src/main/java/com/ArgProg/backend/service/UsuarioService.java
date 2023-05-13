package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Usuario;
import com.ArgProg.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    public UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario getUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
    @Override
    public void salvarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    @Override
    public String getSobreMi(Long id) {
        return usuarioRepository.findById(id).get().getSobreMi();
    }
}
