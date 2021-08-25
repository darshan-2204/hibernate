package com.xwork.soap.tester;

import com.xwork.soap.constant.SoapType;
import com.xwork.soap.dao.SoapDAO;
import com.xwork.soap.dao.SoapDAOImpl;
import com.xwork.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {
		SoapDTO dto = new SoapDTO(4,"Mysore Sandal","darshan","Wood",SoapType.HUMAN);

		SoapDAO dao = new SoapDAOImpl();
		dao.save(dto);

		dao.saveAndUpdate(dto);
		
		dao.read(dto);
		
		dao.delete(dto);
	}

}
