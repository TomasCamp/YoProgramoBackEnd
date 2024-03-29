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
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEstudio;
    private String titulo;
    private String instituto;
    private String fechaInicio;
    private String fechaFin;
    private String urlImagen;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "Usuario_idUsuario")
    Usuario usuario;
}
