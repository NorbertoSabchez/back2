package com.portfolio.norberto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idSkill;
    private String nomSkill;
    private String numSkill;
    private String logoSkill;
    private String nivelSkill;
    
    public Skills(){}
    public Skills(Long idSkill,String nomSkill,String numSkill, String logoSkill,String nivelSkill){
        this.idSkill = idSkill;
        this.nomSkill = nomSkill;
        this.numSkill = numSkill;
        this.logoSkill = logoSkill;
        this.nivelSkill = nivelSkill;
        
    }
}
