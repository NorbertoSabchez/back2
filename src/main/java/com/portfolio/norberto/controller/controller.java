package com.portfolio.norberto.controller;

import com.portfolio.norberto.model.Persona;
import com.portfolio.norberto.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class controller {
    
    @Autowired
    private IPersonaService persoServ;
   
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("persona/new")
    public void agregarPersona ( @RequestBody Persona pers ){
        persoServ.crearPersona(pers);
    }
    @GetMapping("persona/ver")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersona();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("persona/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @GetMapping("persona/traer")
    public Persona buscarPersona(){
        return persoServ.buscarPersona((long).1);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("persona/editar")
    public void editPersona ( @RequestBody Persona per ){
        persoServ.editarPersona(per);
    }
}

