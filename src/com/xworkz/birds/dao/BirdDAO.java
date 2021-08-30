package com.xworkz.birds.dao;

import com.xworkz.birds.entity.BirdEntity;

public interface BirdDAO {

	int save(BirdEntity entity);

	BirdEntity readById(BirdEntity entity);

	void update(int id, String name);

	void delete(int id);
}
