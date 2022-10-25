package com.portfolioriccitelli.portfoliorer.Repository;

import com.portfolioriccitelli.portfoliorer.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
