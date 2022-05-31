
package com.portfolio.norberto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Exp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idExp;
    private String nomExp;
    private String descExp;
    private String linkExp;
    private String repoExp;
    
    public Exp(){}
    public Exp(Long idExp, String nomExp, String linkExp, String repoExp, String descExp){
        this.idExp = idExp;
        this.nomExp = nomExp;
        this.descExp = descExp;
        this.linkExp = linkExp;
        this.repoExp = repoExp;
        
    }
}
