
package com.portfolio.norberto.service;

import com.portfolio.norberto.model.Exp;
import com.portfolio.norberto.repository.ExpRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpService implements IExpService{
    @Autowired
    public ExpRepository expRepo;
    @Override
    public List<Exp> verExp() {
        return expRepo.findAll();
    }

    @Override
    public void crearExp(Exp ex) {
        expRepo.save(ex);
    }

    @Override
    public void borrarExp(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Exp buscarExp(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarExp(Exp ex) {
        expRepo.save(ex);
    }
}
