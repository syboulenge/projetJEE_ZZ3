package com.spring.projetJEE.dao;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.projetJEE.model.Activite;

@RepositoryRestResource(collectionResourceRel = "activite", path = "activite")
public interface ActiviteRepository extends PagingAndSortingRepository<Activite, Long> {

}
