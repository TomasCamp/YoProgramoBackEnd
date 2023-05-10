package com.ArgProg.backend.repository;

import com.ArgProg.backend.model.TipoExperiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoExperienciaRepository extends JpaRepository<TipoExperiencia, Long>{
    
}
