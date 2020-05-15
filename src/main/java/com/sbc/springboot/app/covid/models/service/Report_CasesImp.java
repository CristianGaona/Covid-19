package com.sbc.springboot.app.covid.models.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbc.springboot.app.covid.models.dao.Report_casesDao;
import com.sbc.springboot.app.covid.models.entity.Reporte_Cases;

@Service
public class Report_CasesImp implements IReport_cases {

	@Autowired
	private Report_casesDao rp_cases;
	
	@Override
	@Transactional(readOnly = true)
	public List<Reporte_Cases> findAll() {
		
		return (List<Reporte_Cases>) rp_cases.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Reporte_Cases findById(Long id) {
		// TODO Auto-generated method stub
		return rp_cases.findById(id).orElse(null);
	}

}
