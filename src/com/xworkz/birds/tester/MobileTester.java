
package com.xworkz.birds.tester;

import com.xworkz.birds.dao.BirdDAO;
import com.xworkz.birds.dao.BirdDAOImpl;
import com.xworkz.birds.dao.MobileDAO;
import com.xworkz.birds.dao.MobileImpl;
import com.xworkz.birds.entity.MobileEntity;

public class MobileTester {

	public static void main(String[] args) {

		// MobileEntity mob =new MobileEntity("Vivo",1500.00,"White",11.4,true);

		MobileDAO dao = new MobileImpl();
		// dao.save(mob);

		dao.readAllReacords();
		dao.updateColorByBrand();
		dao.readMaxPrice();
		dao.readMinPrice();
		dao.readAvgPrice();
		dao.readSumPrice();
	}

}
