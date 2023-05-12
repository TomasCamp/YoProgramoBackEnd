package com.ArgProg.backend.service;

import com.ArgProg.backend.model.Usuario;


public interface IUsuarioService {
    public Usuario getUsuario(Long id);
    public void salvarUsuario(Usuario estudio);
    public String getSobreMi(Long id);
}
