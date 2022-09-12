/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.jmoordbcorebookexample.repository;
import com.avbravo.jmoordbcorebookexample.model.Persona;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.repository.CrudRepository;

/**
 *
 * @author avbravo
 */
@Repository(entity = Persona.class)
public interface PersonaRepository extends CrudRepository<Persona, Long> {
    
}
