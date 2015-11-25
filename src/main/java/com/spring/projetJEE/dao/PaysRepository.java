package com.spring.projetJEE.dao;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.projetJEE.model.Pays;

@RepositoryRestResource(collectionResourceRel = "pays", path = "pays")
public interface PaysRepository extends PagingAndSortingRepository<Pays, Long> {

}
