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
@Table(name = "tax_tipo_poblacion")
public class tipoPoblacion {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_POBLACION")
	private long ID_TIPO_POBLACION; 
	@Column(name = "NO_POBLACION")
	private String NO_POBLACION;  
	@ManyToOne()
	@JoinColumn(name="ID_TI_PO")
	private poblacion pob;
	
	public long getID_TIPO_POBLACION() {
		return ID_TIPO_POBLACION;
	}
	public void setID_TIPO_POBLACION(long iD_TIPO_POBLACION) {
		ID_TIPO_POBLACION = iD_TIPO_POBLACION;
	}
	public String getNO_POBLACION() {
		return NO_POBLACION;
	}
	public void setNO_POBLACION(String nO_POBLACION) {
		NO_POBLACION = nO_POBLACION;
	}
	public poblacion getPob() {
		return pob;
	}
	public void setPob(poblacion pob) {
		this.pob = pob;
	} 
	
	
}
