package com.spring.projetJEE.model;


import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the langues database table.
 * 
 */
@Entity
@Table(name="langues")
@NamedQuery(name="Langue.findAll", query="SELECT l FROM Langue l")
public class Langue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="no_langue")
	private int noLangue;

	private String designation;

	//bi-directional many-to-many association to Village
	@ManyToMany(mappedBy="langues")
	private List<Village> villages;

	public Langue() {
	}

	public int getNoLangue() {
		return this.noLangue;
	}

	public void setNoLangue(int noLangue) {
		this.noLangue = noLangue;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Village> getVillages() {
		return this.villages;
	}

	public void setVillages(List<Village> villages) {
		this.villages = villages;
	}

}