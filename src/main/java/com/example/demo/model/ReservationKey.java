package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ReservationKey implements Serializable {
	private static final long serialVersionUID = 1L;
	private long salle;
	private long creneau;
	
	
	
	public ReservationKey() {
		super();
	}
	public ReservationKey(long salle, long creneau) {
		this.salle = salle;
		this.creneau = creneau;
	}
}
