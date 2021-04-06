package com.wolken.wolkenapp.DAO;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.MobilesDTO;



public interface MobilesDAO {
	public void add(MobilesDTO mobilesDTO) throws SQLException;
	public void get() throws SQLException;
	public void update(int id,int price) throws SQLException;
	public void delete(int id) throws SQLException;

}
