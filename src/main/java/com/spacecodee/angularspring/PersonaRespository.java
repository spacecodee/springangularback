package com.spacecodee.angularspring;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonaRespository extends Repository<Persona, Integer> {
    List<Persona> findAll();

    Persona findById(int id);

    Persona save(Persona persona);

    void delete(Persona persona);
}
