package com.ArgProg.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHabilidad;
    private String habilidad;
    private Integer porcentaje;
    
    @ManyToOne
    @JoinColumn(name = "Usuario_idUsuario")
    Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "tipoHabilidad_idTipoHabilidad")
    TipoHabilidad tipoHabilidad;
}
