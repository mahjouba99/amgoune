package com.example.demo.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Creneau {
    @Id
    @GeneratedValue
    private int id;
    private String heureDebut;
    private String heureFin;
    @OneToMany(mappedBy = "creneau", fetch=FetchType.EAGER)
    private List<Crsalle> Crsalle;

    public Creneau() {
    }
   
}
