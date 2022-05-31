package com.portfolio.norberto.controller;

import com.portfolio.norberto.model.Exp;
import com.portfolio.norberto.service.IExpService;
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
@CrossOrigin(origins = " https://appportfolio-e9554.web.app/")

public class ContExp {
    @Autowired
    private IExpService expServ;
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("exp/new")
    public void agregarExp ( @RequestBody Exp ex ){
        expServ.crearExp(ex);
    }
    @GetMapping("exp/ver")
    @ResponseBody
    public List<Exp> verExp(){
        return expServ.verExp();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("exp/delete/{id}")
    public void borrarExp(@PathVariable Long id){
        expServ.borrarExp(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("exp/editar")
    public void editExp ( @RequestBody Exp ex ){
        expServ.editarExp(ex);
    }
}
