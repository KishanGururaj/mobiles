package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.DTO.MobilesDTO;
import com.wolken.wolkenapp.service.MobilesService;
import com.wolken.wolkenapp.service.MobilesServiceImpl;



public class MobilesUtil {
	public static void main(String[] args) {
		try {
			
			// Class.forName("com.wolken.wolkenapp.Festivals");
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the size");
			int size = scanner.nextInt();
		
			MobilesService mobilesService = new MobilesServiceImpl();

			for (int i = 0; i < size; i++) {
				MobilesDTO mobilesDTO = new MobilesDTO();
				
			
				System.out.println("enter the data for prison ");
				System.out.println("enter the  mobile id ");
				mobilesDTO.setMobileId(scanner.nextInt());
				System.out.println("enter the model name");
				mobilesDTO.setModelName(scanner.next());
				System.out.println("enter the  mobile price  ");
				mobilesDTO.setPrice(scanner.nextInt());
				System.out.println("enter the mobile brand name ");
				mobilesDTO.setBrandName(scanner.next());
				
				mobilesService.validate(mobilesDTO);
				
			}
			//Connect.closeConnect();
			
			System.out.println("enter the mobile id for which update has to been done");
			int id = scanner.nextInt();
			System.out.println("enter the price to be updated");
			int price = scanner.nextInt();
			

			mobilesService.validateUpdate(id, price);

			System.out.println("enter the mobile id ");
			id = scanner.nextInt();
			mobilesService.validateDelete(id);
			//prison.close();

		} finally {
			System.out.println("bye bye go home!!");
		}
	}

}
