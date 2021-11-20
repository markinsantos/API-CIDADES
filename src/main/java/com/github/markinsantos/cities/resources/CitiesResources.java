package com.github.markinsantos.cities.resources;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.markinsantos.cities.repository.CitiesRepository;
import com.github.markinsantos.cities.entities.Cities;

@RestController
@RequestMapping("cities")
public class CitiesResources {

	private final CitiesRepository repository;

	  public CitiesResources(final CitiesRepository repository) {
	    this.repository = repository;
	  }

	  /* 1st
	  @GetMapping
	  public List<City> cities() {
	      return repository.findAll();
	  }*/

	  // 2nd - Pageable
	  @GetMapping
	  public Page<Cities> cities(final Pageable page) {
	    return repository.findAll(page);
	  }
	
}
