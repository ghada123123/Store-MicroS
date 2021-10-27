/*
 * Copyright (C) TALYS ™ - All Rights Reserved Unauthorized copying of this file, via any medium is
 * strictly prohibited Proprietary and confidential
 */
package com.esprit.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.entity.Store;
import com.esprit.microservice.repository.StoreRepository;

/**
 * {@link } class.
 *
 * @author hp
 * @since 0.1.0
 */
@Service
public class StoreService {
	@Autowired
	private StoreRepository storeRepository;

	public Store addAero(Store a) {

		return storeRepository.save(a);

	}

	public List<Store> getAllAero() {

		return storeRepository.findAll();
	}

	public String deleteAero(int id) {

		if (storeRepository.findById(id).isPresent()) {
			storeRepository.deleteById(id);
			return "store supprimé";
		}
		else
			return " store non supprimé";
	}

	public Store updateAero(int id, Store a) {

		if (storeRepository.findById(id).isPresent()) {
			Store existingAero = storeRepository.findById(id).get();
			existingAero.setNom(a.getNom());
			existingAero.setType(a.getType());
			existingAero.setLieu(a.getLieu());
			return storeRepository.save(existingAero);

		}
		else
			return null;

	}

}
