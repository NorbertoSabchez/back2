
package com.portfolio.norberto.service;

import com.portfolio.norberto.model.Exp;
import java.util.List;

public interface IExpService {
    public List<Exp> verExp();
    public void crearExp(Exp ex);
    public void borrarExp(Long id);
    public Exp buscarExp(Long id);
    public void editarExp(Exp ex);
}
