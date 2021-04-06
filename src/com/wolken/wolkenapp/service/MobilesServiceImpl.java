package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.DAO.MobilesDAOImpl;
import com.wolken.wolkenapp.DAO.MobilesDAO;
import com.wolken.wolkenapp.DTO.MobilesDTO;



public class MobilesServiceImpl implements MobilesService {
MobilesDAO mobilesDAO = new MobilesDAOImpl();
	
	
	@Override
	public void validate(MobilesDTO mobilesDTO) {
		// TODO Auto-generated method stub
		if(mobilesDTO.getMobileId()>0) {
			if(mobilesDTO.getBrandName()!=null) {
				if(mobilesDTO.getPrice()>0) {
					if(mobilesDTO.getModelName()!=null) {
						try {
							mobilesDAO.add(mobilesDTO);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else 
						System.out.println("wrong model name ");
				}else 
					System.out.println("wrong price ");
			}else 
				System.out.println("wrong brand name ");
		}else 
			System.out.println("wrong mobile id ");
		
	}
	@Override
	public void validateUpdate(int id, int price) {
		// TODO Auto-generated method stub
		if(id >0) {
			if(price>0) {
				System.out.println("data is validate for update");
				try {
					mobilesDAO.update(id, price);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	@Override
	public void validateDelete(int id) {
		// TODO Auto-generated method stub
		if(id>0) {
			System.out.println("data is validate for delete");
			try {
				mobilesDAO.delete(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
