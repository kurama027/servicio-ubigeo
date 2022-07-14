package com.formacionbdi.spring.app.ubigeo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tax_caserio")
public class caserio {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CASERIO")
	private long ID_CASERIO; 
	@Column(name = "NO_CASERIO")
	private String NO_CASERIO;
	@ManyToOne()
	@JoinColumn(name="ID_CAS_DIS")
	private distrito dis;
	public long getID_CASERIO() {
		return ID_CASERIO;
	}
	public void setID_CASERIO(long iD_CASERIO) {
		ID_CASERIO = iD_CASERIO;
	}
	public String getNO_CASERIO() {
		return NO_CASERIO;
	}
	public void setNO_CASERIO(String nO_CASERIO) {
		NO_CASERIO = nO_CASERIO;
	}
	public distrito getDis() {
		return dis;
	}
	public void setDis(distrito dis) {
		this.dis = dis;
	}
	
	

}
