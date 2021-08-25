package com.xwork.soap.dao;

import com.xwork.soap.dto.SoapDTO;

public interface SoapDAO {

	int save(SoapDTO dto);

	int saveAndUpdate(SoapDTO dto);

	int delete(SoapDTO dto);

	int read(SoapDTO dto);

}
