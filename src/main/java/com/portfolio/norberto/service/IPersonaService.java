
package com.portfolio.norberto.service;

import com.portfolio.norberto.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersona();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public void editarPersona(Persona per);
}
