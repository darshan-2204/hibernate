package com.xwork.soap.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xwork.soap.constant.SoapType;

@Entity
@Table(name="soap_table")

public class SoapDTO implements Serializable{
	@Column(name="s_id")
	@Id
	private int id;
	@Column(name="s_name")
	private String name;
	@Column(name="s_brandAmb")
	private String brandAmb;
	@Column(name="s_color")
	private String color;
	@Column(name="s_type")
	private SoapType type;
	
	public SoapDTO() {
		
	}

	public SoapDTO(int id, String name, String brandAmb, String color, SoapType type) {
		super();
		this.id = id;
		this.name = name;
		this.brandAmb = brandAmb;
		this.color = color;
		this.type = type;
	}

	@Override
	public String toString() {
		return "SoapDTO [id=" + id + ", name=" + name + ", brandAmb=" + brandAmb + ", color=" + color + ", type=" + type
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoapDTO other = (SoapDTO) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandAmb() {
		return brandAmb;
	}

	public void setBrandAmb(String brandAmb) {
		this.brandAmb = brandAmb;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public SoapType getType() {
		return type;
	}

	public void setType(SoapType type) {
		this.type = type;
	}

	

}
