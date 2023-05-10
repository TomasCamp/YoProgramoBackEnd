package com.ArgProg.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasenia;
    private String sobreMi;
    private String urlPerfil;
    private String urlPortada;
    private Boolean hayExperiencia;
    private Boolean hayEstudio;
    private Boolean hayHabilidad;
    private Boolean hayProyecto;
}
