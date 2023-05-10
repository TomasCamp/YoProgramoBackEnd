package com.ArgProg.backend.repository;

import com.ArgProg.backend.model.TipoHabilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoHabilidadRepository extends JpaRepository<TipoHabilidad, Long>{
    
}
