package com.springdeveloper.k8s.images;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ImageRepository extends PagingAndSortingRepository<Image, Long> {

	List<Image> findByName(@Param("name") String name);

}
