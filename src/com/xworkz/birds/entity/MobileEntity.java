package com.xworkz.birds.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_table")

public class MobileEntity implements Serializable {

	@Column(name = "m_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int Id;
	@Column(name = "m_brand")
	private String brand;
	@Column(name = "m_price")
	private double price;
	@Column(name = "m_color")
	private String color;
	@Column(name = "m_version")
	private double version;
	@Column(name = "m_support5g")
	private boolean support5G;

	public MobileEntity() {
		super();
	}

	public MobileEntity(String brand, double price, String color, double version, boolean support5g) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.version = version;
		support5G = support5g;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
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
		MobileEntity other = (MobileEntity) obj;
		if (Id != other.Id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MobileEntity [Id=" + Id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", version="
				+ version + ", support5G=" + support5G + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isSupport5G() {
		return support5G;
	}

	public void setSupport5G(boolean support5g) {
		support5G = support5g;
	}

}
