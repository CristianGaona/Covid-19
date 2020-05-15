package com.sbc.springboot.app.covid.models.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbc.springboot.app.covid.models.dao.CountriesDao;
import com.sbc.springboot.app.covid.models.entity.Countries;

@Service
public class CountryServiceImp implements ICountryService{

	@Autowired
	private CountriesDao conutryDao;

	@Override
	@Transactional(readOnly = true)
	public List<Countries> findAll() {
		
		return (List<Countries>) conutryDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Countries findById(Long id) {
		
		return conutryDao.findById(id).orElse(null);
	}

	@Override
	public Countries save(Countries country) {
		
		return conutryDao.save(country);
	}

	@Override
	public void deleteById(Long id) {
		conutryDao.deleteById(id);
	
		
	}
	
	
}
