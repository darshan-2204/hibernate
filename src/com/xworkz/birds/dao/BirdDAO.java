package com.xworkz.birds.dao;

import com.xworkz.birds.entity.BirdEntity;

public interface BirdDAO {

	int save(BirdEntity entity);
	
	 BirdEntity readById(int id);
	 
	 BirdEntity update(int id);
	 
	 BirdEntity delet(int id);

}
