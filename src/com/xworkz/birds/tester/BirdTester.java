package com.xworkz.birds.tester;

import com.xworkz.birds.dao.BirdDAO;
import com.xworkz.birds.dao.BirdDAOImpl;
import com.xworkz.birds.entity.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {
		
		//BirdEntity entity=new BirdEntity(5,"Eagle",false,true,"Brown","India",1,1,"Flight feathers","Columbaves");
		//BirdEntity entity1=new BirdEntity(3,"Peacock",false,true,"Green","India",0,5,"Flight feathers","Columbaves");
		
		BirdDAO dao =new BirdDAOImpl();
		
		//dao.save(entity);
		//dao.save(entity1);
		
		dao.readById(2);
		
		dao.update(1);
		
		dao.delet(2);
	}

}
