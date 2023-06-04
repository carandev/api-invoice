package com.uts.invoice.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.uts.invoice.models.entities.Client;
import com.uts.invoice.models.entities.Region;

public interface IClientDao extends CrudRepository<Client,Long> {
	
	@Query("from Region")
	public List<Region> findAllRegions();

}
