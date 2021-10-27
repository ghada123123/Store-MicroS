/*
 * Copyright (C) TALYS ™ - All Rights Reserved Unauthorized copying of this file, via any medium is
 * strictly prohibited Proprietary and confidential
 */
package com.esprit.microservice.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * {@link } class.
 *
 * @author hp
 * @since 0.1.0
 */
@Table(name="store")
@Entity
public class Store implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3090249096008711398L;
	@Id
	@GeneratedValue
	private int id;
	private String nom, type, lieu;

	/**
	 * @return the id
	 */
	public int getId() {

		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {

		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {

		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {

		this.nom = nom;
	}

	/**
	 * @return the pays
	 */
	public String getType() {

		return type;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setType(String type) {

		this.type = type;
	}

	/**
	 * @return the ville
	 */
	public String getLieu() {

		return lieu;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setLieu(String ville) {

		this.lieu = ville;
	}

	/**
	 * @param id
	 * @param nom
	 * @param pays
	 * @param ville
	 */
	public Store(int id, String nom, String type, String lieu) {

		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.lieu = lieu;
	}

	public Store() {

		super();
	}

}
