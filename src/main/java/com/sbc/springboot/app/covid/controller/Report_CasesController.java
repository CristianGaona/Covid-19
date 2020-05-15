package com.sbc.springboot.app.covid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sbc.springboot.app.covid.models.entity.Reporte_Cases;
import com.sbc.springboot.app.covid.models.service.IReport_cases;
import com.sbc.springboot.app.covid.models.service.Report_CasesImp;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api/v1/reportcases")
public class Report_CasesController {

	@Autowired
	IReport_cases report_cases_service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Reporte_Cases> listar(){
		return report_cases_service.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Reporte_Cases detalle(@PathVariable Long id) {
		return report_cases_service.findById(id);
	}
}
