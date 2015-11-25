package com.spring.projetJEE.model;


import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the continents database table.
 * 
 */
@Entity
@Table(name="continents")
@NamedQuery(name="Continent.findAll", query="SELECT c FROM Continent c")
public class Continent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="no_continent")
	private int noContinent;

	private String nom;

	//bi-directional many-to-one association to Pays
	@OneToMany(mappedBy="continent")
	private List<Pays> pays;

	public Continent() {
	}

	public int getNoContinent() {
		return this.noContinent;
	}

	public void setNoContinent(int noContinent) {
		this.noContinent = noContinent;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Pays> getPays() {
		return this.pays;
	}

	public void setPays(List<Pays> pays) {
		this.pays = pays;
	}

	public Pays addPay(Pays pay) {
		getPays().add(pay);
		pay.setContinent(this);

		return pay;
	}

	public Pays removePay(Pays pay) {
		getPays().remove(pay);
		pay.setContinent(null);

		return pay;
	}

}