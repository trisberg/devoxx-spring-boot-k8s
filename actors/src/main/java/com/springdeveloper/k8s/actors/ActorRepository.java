package com.springdeveloper.k8s.actors;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ActorRepository extends PagingAndSortingRepository<Actor, Long> {

	List<Actor> findByName(@Param("name") String name);

}
