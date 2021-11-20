package com.github.markinsantos.cities.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.github.markinsantos.cities.entities.Cities;


public interface CitiesRepository extends JpaRepository <Cities, Long>{


	  @Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) <@> (SELECT lat_lon FROM cidade WHERE id=?2)) as distance", nativeQuery = true)
	  Double distanceByPoints(final Long cityId1, final Long cityId2);

	  @Query(value = "SELECT earth_distance(ll_to_earth(?1,?2), ll_to_earth(?3,?4)) as distance", nativeQuery = true)
	  Double distanceByCube(final Double lat1, final Double lon1, final Double lat2, final Double lon2);
	
	
}
