package com.ArgProg.backend.repository;

import com.ArgProg.backend.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long>{
    
}
