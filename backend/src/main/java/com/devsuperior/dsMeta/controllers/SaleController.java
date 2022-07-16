package com.devsuperior.dsMeta.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsMeta.entities.Sale;
import com.devsuperior.dsMeta.service.SaleService;
import com.devsuperior.dsMeta.service.SmsService;



@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService serviceSale;
	
	@Autowired
	private SmsService serviceSms;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue = "") String minDate, 
			@RequestParam(value="maxDate", defaultValue = "") String maxDate, 
			Pageable pageable){
		return serviceSale.findSales(minDate, maxDate, pageable);
		 
	}
	
	
	@GetMapping("/{id}/notification")
	public void notifySms(@PathVariable Long id) {
		serviceSms.sendSms(id);
		
	}

}
