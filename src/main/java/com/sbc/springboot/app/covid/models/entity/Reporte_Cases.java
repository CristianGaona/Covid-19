package com.sbc.springboot.app.covid.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="report_cases")
public class Reporte_Cases implements Serializable {

	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_report_case;
	
	
	private String date_report;
	private Long new_cases;
	private Long total_case;
	
	@ManyToMany(mappedBy = "report_cases")
	private List<Countries> countries;
	
	public Long getId_report_case() {
		return id_report_case;
	}


	public void setId_report_case(Long id_report_case) {
		this.id_report_case = id_report_case;
	}


	public String getDate_report() {
		return date_report;
	}


	public void setDate_report(String date_report) {
		this.date_report = date_report;
	}


	public Long getNew_cases() {
		return new_cases;
	}


	public void setNew_cases(Long new_cases) {
		this.new_cases = new_cases;
	}


	public Long getTotal_case() {
		return total_case;
	}


	public void setTotal_case(Long total_case) {
		this.total_case = total_case;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1010651338485079722L;
}
