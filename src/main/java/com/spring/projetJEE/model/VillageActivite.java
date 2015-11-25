package com.spring.projetJEE.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the village_activite database table.
 * 
 */
@Entity
@Table(name="village_activite")
@NamedQuery(name="VillageActivite.findAll", query="SELECT v FROM VillageActivite v")
public class VillageActivite implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VillageActivitePK id;

	private String gratuite;

	//bi-directional many-to-one association to Activite
	@ManyToOne
	@JoinColumn(name="no_activite", insertable=false, updatable=false)
	private Activite activite;

	//bi-directional many-to-one association to Village
	@ManyToOne
	@JoinColumn(name="no_village", insertable=false, updatable=false)
	private Village village;

	public VillageActivite() {
	}

	public VillageActivitePK getId() {
		return this.id;
	}

	public void setId(VillageActivitePK id) {
		this.id = id;
	}

	public String getGratuite() {
		return this.gratuite;
	}

	public void setGratuite(String gratuite) {
		this.gratuite = gratuite;
	}

	public Activite getActivite() {
		return this.activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public Village getVillage() {
		return this.village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

}