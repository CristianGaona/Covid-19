package com.sbc.springboot.app.covid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sbc.springboot.app.covid.models.entity.Countries;
import com.sbc.springboot.app.covid.models.service.CountryServiceImp;
import com.sbc.springboot.app.covid.models.service.ICountryService;
import com.sbc.springboot.app.covid.models.service.IReport_cases;

@RestController
@RequestMapping("/api/v1/countries")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CountryController {

	@Autowired
	private ICountryService countryService;
	
	@Autowired
	private IReport_cases report_caseService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Countries> listar(){
		return countryService.findAll();
		
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Countries detalle(@PathVariable Long id) {
		Countries country = countryService.findById(id);
		return country;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Countries crear(Countries country) {
		return countryService.save(country);
	}
	
	public void eliminar(@PathVariable Long id) {
		countryService.deleteById(id);
	}
	
}
