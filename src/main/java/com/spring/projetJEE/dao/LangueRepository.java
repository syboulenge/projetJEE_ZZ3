package com.spring.projetJEE.dao;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.projetJEE.model.Langue;

@RepositoryRestResource(collectionResourceRel = "langue", path = "langue")
public interface LangueRepository extends PagingAndSortingRepository<Langue, Long> {

}
