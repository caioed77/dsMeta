package com.devsuperior.dsMeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsMeta.entities.Sale;
import com.devsuperior.dsMeta.repositories.SaleRepository;



@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleRepository repository;
	
	
	@GetMapping
	public List<Sale> findAll(){
		List<Sale> into = repository.findAll();
		return into;
	}

	

}
