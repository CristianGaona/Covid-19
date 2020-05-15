package com.sbc.springboot.app.covid.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sbc.springboot.app.covid.models.entity.Reporte_Cases;

public interface Report_casesDao extends CrudRepository<Reporte_Cases, Long> {

}
