package com.portfolio.norberto.controller;

import com.portfolio.norberto.model.Estudios;
import com.portfolio.norberto.service.IEstudiosService;
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
@CrossOrigin(origins = " https://appportfolio-e9554.web.app/s")

public class ContEstudios {
    @Autowired
    private IEstudiosService estServ;
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("est/new")
    public void agregarEstudios ( @RequestBody Estudios est ){
        estServ.crearEstudios(est);
    }
    @GetMapping("est/ver")
    @ResponseBody
    public List<Estudios> verEstudios(){
        return estServ.verEstudios();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("est/delete/{id}")
    public void borrarEstudios(@PathVariable Long id){
        estServ.borrarEstudios(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("est/editar")
    public void editarEstudios ( @RequestBody Estudios est ){
        estServ.editarEstudios(est);
    }
}
