package com.spring.projetJEE.model;


import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the village_activite database table.
 * 
 */
@Embeddable
public class VillageActivitePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="no_village", insertable=false, updatable=false)
	private int noVillage;

	@Column(name="no_activite", insertable=false, updatable=false)
	private int noActivite;

	public VillageActivitePK() {
	}
	public int getNoVillage() {
		return this.noVillage;
	}
	public void setNoVillage(int noVillage) {
		this.noVillage = noVillage;
	}
	public int getNoActivite() {
		return this.noActivite;
	}
	public void setNoActivite(int noActivite) {
		this.noActivite = noActivite;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VillageActivitePK)) {
			return false;
		}
		VillageActivitePK castOther = (VillageActivitePK)other;
		return 
			(this.noVillage == castOther.noVillage)
			&& (this.noActivite == castOther.noActivite);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.noVillage;
		hash = hash * prime + this.noActivite;
		
		return hash;
	}
}