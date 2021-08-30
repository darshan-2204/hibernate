package com.xworkz.birds.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bird_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BirdEntity implements Serializable {

	@Column(name = "b_id")
	@Id
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_lightWeight")
	private boolean lightWeight;
	@Column(name = "b_layEggs")
	private boolean layEggs;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_palceOfOriginel")
	private String placeOfOrigine;
	@Column(name = "b_lifeSpan")
	private int lifeSpan;
	@Column(name = "b_hoursOfFlying")
	private int hoursOfFlying;
	@Column(name="b_feathers")
	private String feathers;
	@Column(name="b_group")
	private String group;

	public BirdEntity() {

	}

	public BirdEntity(int id, String name, boolean lightWeight, boolean layEggs, String color, String placeOfOrigine,
			int lifeSpan, int hoursOfFlying, String feathers, String group) {
		super();
		this.id = id;
		this.name = name;
		this.lightWeight = lightWeight;
		this.layEggs = layEggs;
		this.color = color;
		this.placeOfOrigine = placeOfOrigine;
		this.lifeSpan = lifeSpan;
		this.hoursOfFlying = hoursOfFlying;
		this.feathers = feathers;
		this.group = group;
	}

	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", lightWeight=" + lightWeight + ", layEggs=" + layEggs
				+ ", color=" + color + ", placeOfOrigine=" + placeOfOrigine + ", lifeSpan=" + lifeSpan
				+ ", hoursOfFlying=" + hoursOfFlying + ", feathers=" + feathers + ", group=" + group + "]";
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
		BirdEntity other = (BirdEntity) obj;
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

	public boolean isLightWeight() {
		return lightWeight;
	}

	public void setLightWeight(boolean lightWeight) {
		this.lightWeight = lightWeight;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlaceOfOrigine() {
		return placeOfOrigine;
	}

	public void setPlaceOfOrigine(String placeOfOrigine) {
		this.placeOfOrigine = placeOfOrigine;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public int getHoursOfFlying() {
		return hoursOfFlying;
	}

	public void setHoursOfFlying(int hoursOfFlying) {
		this.hoursOfFlying = hoursOfFlying;
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
