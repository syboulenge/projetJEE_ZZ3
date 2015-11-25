package com.spring.projetJEE.model;


import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the activites database table.
 * 
 */
@Entity
@Table(name="activites")
@NamedQuery(name="Activite.findAll", query="SELECT a FROM Activite a")
public class Activite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="no_activite")
	private int noActivite;

	private String designation;

	//bi-directional many-to-one association to VillageActivite
	@OneToMany(mappedBy="activite")
	private List<VillageActivite> villageActivites;

	public Activite() {
	}

	public int getNoActivite() {
		return this.noActivite;
	}

	public void setNoActivite(int noActivite) {
		this.noActivite = noActivite;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<VillageActivite> getVillageActivites() {
		return this.villageActivites;
	}

	public void setVillageActivites(List<VillageActivite> villageActivites) {
		this.villageActivites = villageActivites;
	}

	public VillageActivite addVillageActivite(VillageActivite villageActivite) {
		getVillageActivites().add(villageActivite);
		villageActivite.setActivite(this);

		return villageActivite;
	}

	public VillageActivite removeVillageActivite(VillageActivite villageActivite) {
		getVillageActivites().remove(villageActivite);
		villageActivite.setActivite(null);

		return villageActivite;
	}

}