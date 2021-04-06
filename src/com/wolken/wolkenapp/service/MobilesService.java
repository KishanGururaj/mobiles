package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.DTO.MobilesDTO;

public interface MobilesService {
	 public void  validate(MobilesDTO mobilesDTO);
	 public void validateUpdate(int id,int price);
	 public void validateDelete(int id);


}
