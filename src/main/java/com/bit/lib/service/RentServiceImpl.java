package com.bit.lib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.lib.dao.RentDAO;
import com.bit.lib.dto.RentDTO;


@Service("rentService")
public class RentServiceImpl implements RentService {
	
	@Autowired
	private RentDAO rentDAO;

	@Override
	public List<RentDTO> getRentHistoryList(String id) {
		// TODO Auto-generated method stub
		return rentDAO.getRentHistoryList(id);
	}

	@Override
	public List<RentDTO> selectRentNow(String id) {
		// TODO Auto-generated method stub
		return rentDAO.selectRentNow(id);
	}

	@Override
	public int renew(List<String> chkcodes) {
		
		return rentDAO.renew(chkcodes);
	}

	
}