
package com.portfolio.norberto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idEst;
    private String tituloEst;
    private String instEst;
    private String estadoEst;
    private String logo;
    
    public Estudios(){}
    
    public Estudios(Long idEst,String tituloEst,String instEst,String logo ){
        this.idEst = idEst;
        this.tituloEst = tituloEst;
        this.instEst = instEst;
        this.logo = logo;
    
    }
}
