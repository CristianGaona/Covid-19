package com.sbc.springboot.app.covid.models.service;

import java.util.List;

import com.sbc.springboot.app.covid.models.entity.Reporte_Cases;

public interface IReport_cases {

	public List<Reporte_Cases> findAll();
	public Reporte_Cases findById(Long id);
}
