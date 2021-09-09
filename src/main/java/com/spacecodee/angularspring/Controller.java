package com.spacecodee.angularspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    PersonaService personaService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/api/peoples")
    public List<Persona> list() {
        System.out.println(this.personaService.list());
        System.out.println("***********");
        return this.personaService.list();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/api/peoples")
    public Persona addPersona(@RequestBody Persona persona) {
        return this.personaService.add(persona);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = {"/api/peoples/{id}"})
    public Persona listId(@PathVariable("id") int id) {
        return this.personaService.listId(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(path = {"/api/peoples/{id}"})
    public Persona edit(@RequestBody Persona persona, @PathVariable("id") int id) {
        persona.setId(id);
        return this.personaService.edit(persona);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(path = {"/api/peoples/{id}"})
    public Persona delete(@PathVariable("id") int id) {
        return this.personaService.delete(id);
    }
}
