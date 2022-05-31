
package com.portfolio.norberto.service;

import com.portfolio.norberto.model.Persona;
import com.portfolio.norberto.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService  implements IPersonaService{
    @Autowired
    public PersonaRepository persoRepo;
    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }
    @Override
    public void editarPersona(Persona per){
        persoRepo.save(per);
    }
    
}
