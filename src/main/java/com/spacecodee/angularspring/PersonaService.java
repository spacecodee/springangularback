package com.spacecodee.angularspring;

import java.util.List;

public interface PersonaService {

    List<Persona> list();

    Persona listId(int id);

    Persona add(Persona persona);

    Persona edit(Persona persona);

    Persona delete(int id);
}
