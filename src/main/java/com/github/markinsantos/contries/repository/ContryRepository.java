package com.github.markinsantos.contries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.markinsantos.contries.entities.Country;

public interface ContryRepository extends JpaRepository<Country, Long> {

}
