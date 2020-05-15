package com.sbc.springboot.app.covid.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sbc.springboot.app.covid.models.entity.Countries;

public interface CountriesDao extends CrudRepository<Countries, Long>{

}
