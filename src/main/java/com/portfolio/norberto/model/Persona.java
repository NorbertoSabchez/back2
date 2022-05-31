
package com.portfolio.norberto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre;
    private String apellido;
    private String rol;
    private String arg;
    private String link;
    private String git;
    private String tel;
    private String mail;
    private String sobreMi;
    private String img;
    
    
    
    public Persona(){}
    
    public Persona(Long id, String nombre, String apellido, String rol, String arg, String link, String git,String tel,String mail, String sobreMi, String img){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.arg = arg;
        this.link = link;
        this.git = git;
        this.tel = tel;
        this.mail = mail;
        this.sobreMi = sobreMi;
        this.img = img;
    }
}
