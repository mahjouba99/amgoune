package com.example.demo.model;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Crsalle {

	@EmbeddedId
	private CrsalleKey id;
	@JoinColumn(name = "creneau", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne
	private Creneau creneau;
	@JoinColumn(name = "salle", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private User user;

	public Crsalle() {
		user=new User();
	}
}
