package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable

public class CrsalleKey implements Serializable{
	private int salle;
    private int creneau;
    private Date date;
	public CrsalleKey() {
	}
	public CrsalleKey(int salle, int creneau, Date date) {
		super();
		this.salle = salle;
		this.creneau = creneau;
		this.date = date;
	}
    
    


	

}
