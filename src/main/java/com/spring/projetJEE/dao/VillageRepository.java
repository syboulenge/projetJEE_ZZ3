package com.spring.projetJEE.dao;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.projetJEE.model.Village;

@RepositoryRestResource(collectionResourceRel = "village", path = "village")
public interface VillageRepository extends PagingAndSortingRepository<Village, Long> {

}
