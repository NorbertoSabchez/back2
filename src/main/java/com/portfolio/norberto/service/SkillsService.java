
package com.portfolio.norberto.service;

import com.portfolio.norberto.model.Skills;
import com.portfolio.norberto.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkillsService implements ISkillsService{
    @Autowired
    public SkillsRepository skillsRepo;
   
    @Override
    public List<Skills> verSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public void crearSkills(Skills skills) {
        skillsRepo.save(skills);
    }

    @Override
    public void borrarSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkills(Long id) {
        return skillsRepo.findById(id).orElse(null);
    }
    @Override
    public void editarSkills(Skills skills) {
        skillsRepo.save(skills);
    }
}
