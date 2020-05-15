package com.sbc.springboot.app.covid.models.service;

import java.util.List;

import com.sbc.springboot.app.covid.models.entity.Countries;

public interface ICountryService {

	public List<Countries> findAll();
	public Countries findById(Long id);
	public Countries save(Countries country);
	public void deleteById(Long id);
}
