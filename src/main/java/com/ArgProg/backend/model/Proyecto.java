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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private String urlImagen;
    private String link;
    
    @ManyToOne
    @JoinColumn(name = "Usuario_idUsuario")
    Usuario usuario;
}
