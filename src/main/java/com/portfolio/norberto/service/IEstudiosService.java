
package com.portfolio.norberto.service;

import com.portfolio.norberto.model.Estudios;
import java.util.List;


public interface IEstudiosService {
    public List<Estudios> verEstudios();
    public void crearEstudios(Estudios est);
    public void borrarEstudios(Long id);
    public Estudios buscarEstudios(Long id);
    public void editarEstudios(Estudios est);
}
