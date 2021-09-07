package com.xworkz.birds.dao;

import java.util.List;

import com.xworkz.birds.entity.BirdEntity;

public interface BirdDAO {

	int save(BirdEntity entity);

	BirdEntity readById(BirdEntity entity);

	void update(int id, String name);

	void delete(int id);
	
	void saveList(List<BirdEntity> entity);
	
	void deleteList(List<BirdEntity> ids);
}
