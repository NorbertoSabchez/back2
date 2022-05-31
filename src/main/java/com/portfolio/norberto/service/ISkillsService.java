
package com.portfolio.norberto.service;

import com.portfolio.norberto.model.Skills;
import java.util.List;

public interface ISkillsService {
    public List<Skills> verSkills();
    public void crearSkills(Skills skills);
    public void borrarSkills(Long id);
    public Skills buscarSkills(Long id);
    public void editarSkills(Skills skills);

}
