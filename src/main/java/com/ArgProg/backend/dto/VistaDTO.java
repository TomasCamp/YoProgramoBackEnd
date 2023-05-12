package com.ArgProg.backend.dto;

import com.ArgProg.backend.model.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @NoArgsConstructor
public class VistaDTO {
    private Long idUsuario;
    private Boolean hayExperiencia;
    private Boolean hayEstudio;
    private Boolean hayHabilidad;
    private Boolean hayProyecto;
    
    public VistaDTO (Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.hayExperiencia = usuario.getHayExperiencia();
        this.hayEstudio = usuario.getHayEstudio();
        this.hayHabilidad = usuario.getHayHabilidad();
        this.hayProyecto = usuario.getHayProyecto();
    }
}
