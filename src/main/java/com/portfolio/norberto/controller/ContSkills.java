package com.portfolio.norberto.controller;

import com.portfolio.norberto.model.Skills;
import com.portfolio.norberto.service.ISkillsService;
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
@CrossOrigin(origins = "http://localhost:4200/")
public class ContSkills {
    @Autowired
    private ISkillsService skillsServ;
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("skill/new")
    public void agregarSkills ( @RequestBody Skills skills ){
        skillsServ.crearSkills(skills);
    }
    @GetMapping("skill/ver")
    @ResponseBody
    public List<Skills> verSkills(){
        return skillsServ.verSkills();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("skill/delete/{id}")
    public void borrarSkills(@PathVariable Long id){
        skillsServ.borrarSkills(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("skill/editar")
    public void editSkills ( @RequestBody Skills skills ){
        skillsServ.editarSkills(skills);
    }
}
