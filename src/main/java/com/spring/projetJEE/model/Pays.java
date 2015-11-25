package com.spring.projetJEE.model;


import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pays database table.
 * 
 */
@Entity
@NamedQuery(name="Pays.findAll", query="SELECT p FROM Pays p")
public class Pays implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="no_pays")
	private int noPays;

	private String nom;

	//bi-directional many-to-one association to Continent
	@ManyToOne
	@JoinColumn(name="no_continent")
	private Continent continent;

	//bi-directional many-to-one association to Village
	@OneToMany(mappedBy="pay")
	private List<Village> villages;

	public Pays() {
	}

	public int getNoPays() {
		return this.noPays;
	}

	public void setNoPays(int noPays) {
		this.noPays = noPays;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Continent getContinent() {
		return this.continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public List<Village> getVillages() {
		return this.villages;
	}

	public void setVillages(List<Village> villages) {
		this.villages = villages;
	}

	public Village addVillage(Village village) {
		getVillages().add(village);
		village.setPay(this);

		return village;
	}

	public Village removeVillage(Village village) {
		getVillages().remove(village);
		village.setPay(null);

		return village;
	}

}