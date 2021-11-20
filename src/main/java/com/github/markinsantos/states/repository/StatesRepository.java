package com.github.markinsantos.states.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.markinsantos.states.entities.States;

public interface StatesRepository extends JpaRepository<States, Long> {

}
