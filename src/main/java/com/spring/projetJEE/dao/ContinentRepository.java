package com.spring.projetJEE.dao;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.projetJEE.model.Continent;

@RepositoryRestResource(collectionResourceRel = "continent", path = "continent")
public interface ContinentRepository extends PagingAndSortingRepository<Continent, Long> {

}
