package com.spring.projetJEE.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the villages database table.
 * 
 */
@Entity
@Table(name="villages")
@NamedQuery(name="Village.findAll", query="SELECT v FROM Village v")
public class Village implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="no_village")
	private int noVillage;

	private String nom;

	//bi-directional many-to-many association to Langue
	@ManyToMany
	@JoinTable(
		name="langue_village"
		, joinColumns={
			@JoinColumn(name="no_village")
			}
		, inverseJoinColumns={
			@JoinColumn(name="no_langue")
			}
		)
	private List<Langue> langues;

	//bi-directional many-to-one association to VillageActivite
	@OneToMany(mappedBy="village")
	private List<VillageActivite> villageActivites;

	//bi-directional many-to-one association to Pays
	@ManyToOne
	@JoinColumn(name="no_pays")
	private Pays pay;

	public Village() {
	}

	public int getNoVillage() {
		return this.noVillage;
	}

	public void setNoVillage(int noVillage) {
		this.noVillage = noVillage;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Langue> getLangues() {
		return this.langues;
	}

	public void setLangues(List<Langue> langues) {
		this.langues = langues;
	}

	public List<VillageActivite> getVillageActivites() {
		return this.villageActivites;
	}

	public void setVillageActivites(List<VillageActivite> villageActivites) {
		this.villageActivites = villageActivites;
	}

	public VillageActivite addVillageActivite(VillageActivite villageActivite) {
		getVillageActivites().add(villageActivite);
		villageActivite.setVillage(this);

		return villageActivite;
	}

	public VillageActivite removeVillageActivite(VillageActivite villageActivite) {
		getVillageActivites().remove(villageActivite);
		villageActivite.setVillage(null);

		return villageActivite;
	}

	public Pays getPay() {
		return this.pay;
	}

	public void setPay(Pays pay) {
		this.pay = pay;
	}

}