package com.Poliklinika;

import jakarta.persistence.*;
import jdk.management.jfr.ConfigurationInfo;

import java.io.ObjectInputFilter;
import java.security.PrivateKey;

@Entity
@Table(name = "Больные")
public class Больные {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idНомерМедКарты")
    private Long id;
    @Column(name = "username")
    private String username;


    public Больные () {

    }



    }

    public Long getIdНомерМедКарты() {
        return getIdНомерМедКарты ()
    }

    public String username() {
        return setUsename () ;
    }

    public void setId(Long id) {
        this.getIdНомерМедКарты() = getIdНомерМедКарты();
    }

    public void setUsename(String usename) {
        this. username() = username()
    };



    public Больные (String username,String ,int Id){
        this.getIdНомерМедКарты() = Id();
        this.username() = username;

    @Override
    public String toString(){
        return String.format("Больные[idНомерМедКарты = %d,,,usename = %s]",Id,username);
    }
}

