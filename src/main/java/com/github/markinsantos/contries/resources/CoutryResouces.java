package com.github.markinsantos.contries.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.markinsantos.contries.entities.Country;
import com.github.markinsantos.contries.repository.ContryRepository;


@RestController
@RequestMapping("/countries")
public class CoutryResouces {

	@Autowired
	private ContryRepository repository;

	@GetMapping
	public Page<Country> contries(Pageable page) {

		return repository.findAll(page);
	}

	
}
