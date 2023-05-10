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
public class TipoHabilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipoHabilidad;
    private String tipo;
}
