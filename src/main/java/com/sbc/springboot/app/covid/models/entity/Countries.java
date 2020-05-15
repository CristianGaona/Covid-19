package com.sbc.springboot.app.covid.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "countries")
public class Countries implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_country;

	private String iso_code;
	private String name_country;
	private Double dsp_per_capita;
	private Double hospital_beds_per;
	
	@JoinTable(name="countries_reports",
			joinColumns = @JoinColumn(name ="id_country", nullable = false),
			inverseJoinColumns = @JoinColumn(name="id_report_case", nullable = false))

	@ManyToMany()
	private List<Reporte_Cases> report_cases;
	
	
	public List<Reporte_Cases> getReport_cases() {
		return report_cases;
	}

	public void setReport_cases(List<Reporte_Cases> report_cases) {
		this.report_cases = report_cases;
	}

	public Long getId_country() {
		return id_country;
	}

	public void setId_country(Long id_country) {
		this.id_country = id_country;
	}

	public String getIso_code() {
		return iso_code;
	}

	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}

	public String getName_country() {
		return name_country;
	}

	public void setName_country(String name_country) {
		this.name_country = name_country;
	}

	public Double getDsp_per_capita() {
		return dsp_per_capita;
	}

	public void setDsp_per_capita(Double dsp_per_capita) {
		this.dsp_per_capita = dsp_per_capita;
	}

	public Double getHospital_beds_per() {
		return hospital_beds_per;
	}

	public void setHospital_beds_per(Double hospital_beds_per) {
		this.hospital_beds_per = hospital_beds_per;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -6361377372474408704L;

}
