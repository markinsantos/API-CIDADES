package com.github.markinsantos.states.resources;

import com.github.markinsantos.states.entities.States;
import com.github.markinsantos.states.repository.StatesRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/staties")
public class StatesResouces {
	
	private final StatesRepository repository;

	  public StatesResouces(final StatesRepository repository) {
	    this.repository = repository;
	  }

	  @GetMapping
	  public List<States> staties() {
	    return repository.findAll();
	  }

}
