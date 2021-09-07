package com.xworkz.birds.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.xworkz.birds.dao.BirdDAO;
import com.xworkz.birds.dao.BirdDAOImpl;
import com.xworkz.birds.entity.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {
		
		//BirdEntity entity=new BirdEntity(18,"Sawerla",false,true,"Brown","India",1,1,"Flight feathers","Columbaves");
		//BirdEntity entity1=new BirdEntity(19,"Crow",false,true,"Green","India",0,5,"Flight feathers","Columbaves");
		BirdEntity entity2=new BirdEntity(23,"Sparoow",false,true,"Green","India",0,5,"Flight feathers","Columbaves");
				
		BirdDAO dao =new BirdDAOImpl();
		
		//dao.save(entity2);
		//dao.save(entity1);
		
		
		//dao.readById(entity);
		
		dao.update(1,"Duck");
		
		//dao.delete(3);
		
		List<BirdEntity> list= Arrays.asList(entity2);
		dao.saveList(list);
		
		dao.delete(19);
		
		
		
		
		
	}

}
