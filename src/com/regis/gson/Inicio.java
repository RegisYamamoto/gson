package com.regis.gson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Inicio {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		Address address = new Address("Brasil", "Londrina");
		
		List<FamilyMember> familyMember = new ArrayList<>();
		familyMember.add(new FamilyMember("pai", 71));
		familyMember.add(new FamilyMember("m�e", 70));
		
		Employee employee = new Employee("R�gis Yamamoto", 39, "regisyamamoto@gmail.com", address, familyMember);
		String json = gson.toJson(employee);
		
		System.out.println(json);
		
		//------------------------------
		
		/*String json = "{\"firstName\":\"R�gis Yamamoto\",\"age\":39,\"mail\":\"regisyamamoto@gmail.com\",\"address\":{\"country\":\"Brasil\",\"city\":\"Londrina\"}}";
		Employee employee = gson.fromJson(json, Employee.class);
		
		System.out.println(employee);*/
		
	}

}
