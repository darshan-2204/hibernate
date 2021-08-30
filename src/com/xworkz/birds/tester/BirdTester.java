package com.xworkz.birds.tester;

import com.xworkz.birds.dao.BirdDAO;
import com.xworkz.birds.dao.BirdDAOImpl;
import com.xworkz.birds.entity.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {
		
		BirdEntity entity=new BirdEntity(10,"Sawerla",false,true,"Brown","India",1,1,"Flight feathers","Columbaves");
		BirdEntity entity1=new BirdEntity(11,"Crow",false,true,"Green","India",0,5,"Flight feathers","Columbaves");
				
		BirdDAO dao =new BirdDAOImpl();
		
		dao.save(entity);
		dao.save(entity1);
		
		
		dao.readById(entity);
		
		dao.update(1,"Duck");
		
		dao.delete(3);
	}

}
