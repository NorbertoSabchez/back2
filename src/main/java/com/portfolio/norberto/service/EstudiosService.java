
package com.portfolio.norberto.service;

import com.portfolio.norberto.model.Estudios;
import com.portfolio.norberto.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EstudiosService implements IEstudiosService{
    @Autowired
    public EstudiosRepository estudiosRepo;
    @Override
    public List<Estudios> verEstudios() {
        return estudiosRepo.findAll();
    }

    @Override
    public void crearEstudios(Estudios est) {
        estudiosRepo.save(est);
    }

    @Override
    public void borrarEstudios(Long id) {
        estudiosRepo.deleteById(id);
    }

    @Override
    public Estudios buscarEstudios(Long id) {
        return estudiosRepo.findById(id).orElse(null);
    }
    @Override
    public void editarEstudios(Estudios est) {
        estudiosRepo.save(est);
    }
}
