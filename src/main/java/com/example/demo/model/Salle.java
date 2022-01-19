package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String code;
	private String type;
	private int capacite;
	@OneToMany(mappedBy="salle", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Machine> machines;
	@ManyToOne
	private Bloc bloc;
	
	public Salle() {
        bloc  = new Bloc();
	}

	
	
	
	public Bloc getBloc() {
		return bloc;
	}




	public void setBloc(Bloc bloc) {
		this.bloc = bloc;
	}




	
	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public List<Machine> getMachines() {
		return machines;
	}




	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}




	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	

}
