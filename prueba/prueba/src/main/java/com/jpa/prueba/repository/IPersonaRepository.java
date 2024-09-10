
package com.jpa.prueba.repository;

import com.jpa.prueba.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona , Long> {
    
}
