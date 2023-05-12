package com.ArgProg.backend.dto;

import com.ArgProg.backend.model.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @NoArgsConstructor
public class UsuarioDTO {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String urlPerfil;
    private String urlPortada;
    
    public UsuarioDTO (Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.nombre = usuario.getNombre();
        this.apellido = usuario.getApellido();
        this.email = usuario.getEmail();
        this.urlPerfil = usuario.getUrlPerfil();
        this.urlPortada = usuario.getUrlPortada();
    }
}
