
package com.esprit.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.esprit.microservice.entity.Store;
import com.esprit.microservice.service.StoreService;

@RestController
@RequestMapping(value = "/api/store")
public class StoreController {
	private String title = "Hello,I'm the store Microservice";
	@Autowired
	StoreService aeroService;

	@RequestMapping("/hello")
	public String sayHello() {

		System.out.println(title);
		return title;
	}

	@PostMapping("/post")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Store> createAero(@RequestBody Store a) {

		return new ResponseEntity<>(aeroService.addAero(a), HttpStatus.OK);
	}

	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Store>> getAeros() {
		return new ResponseEntity<>(aeroService.getAllAero(), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Store updateAero(@PathVariable(value = "id") int id, @RequestBody Store a) {

		return aeroService.updateAero(id, a);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteStore(@PathVariable(value = "id") int id) {

		return new ResponseEntity<String>(aeroService.deleteAero(id), HttpStatus.OK);
	}

}
