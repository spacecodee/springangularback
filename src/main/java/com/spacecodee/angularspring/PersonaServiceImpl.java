package com.spacecodee.angularspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRespository personaRespository;

    @Override
    public List<Persona> list() {
        return this.personaRespository.findAll();
    }

    @Override
    public Persona listId(int id) {
        return this.personaRespository.findById(id);
    }

    @Override
    public Persona add(Persona persona) {
        return this.personaRespository.save(persona);
    }

    @Override
    public Persona edit(Persona persona) {
        return this.personaRespository.save(persona);
    }

    @Override
    public Persona delete(int id) {
        Persona persona = this.personaRespository.findById(id);
        if (persona != null) {
            this.personaRespository.delete(persona);
        }
        return persona;
    }
}
