package com.xworkz.birds.dao;

import com.xworkz.birds.entity.BirdEntity;
import com.xworkz.birds.entity.MobileEntity;

public interface MobileDAO {

	int save(MobileEntity entity);

	void readAllReacords();

	void updateColorByBrand();

	double readMaxPrice();

	int readMinPrice();

	void readAvgPrice();

	void readSumPrice();

}
