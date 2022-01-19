//
//               Creneau.java
//       Relancer le serveur après ces modification
//
package com.example.demo.model;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/*import javax.persistence.Temporal;
import javax.persistence.TemporalType;*/
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
@Entity
@Table(name="creneau")
@JsonDeserialize(as = Creneau.class)

public class Creneau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String heureDebut;
	private String heureFin;

/*	@OneToMany(mappedBy = "creneau")
	private List<Reservation> Reservations;*/
	
	public Creneau() 
	{
		
	}
	public Creneau(String heureDebut, String heureFin) {
		super();
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
	//	Reservations = reservations;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

	public String getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	public String getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}
/*	public List<Reservation> getReservations() {
		return Reservations;
	}

	public void setReservations(List<Reservation> Reservations) 
	{
		this.Reservations = Reservations;
	}
*/	
}
