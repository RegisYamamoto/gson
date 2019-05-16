package com.regis.gson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Employee {

	/*@SerializedName("first_name")*/
	private String firstName;
	
	private /*transient*/ int age;
	private String mail;
	
	private Address address;
	
	private List<FamilyMember> familyMember;
	
	public Employee(String firstName, int age, String mail, Address address, List<FamilyMember> familyMember) {
		this.firstName = firstName;
		this.age = age;
		this.mail = mail;
		this.address = address;
		this.familyMember = familyMember;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", age=" + age + ", mail=" + mail + ", address=" + address
				+ ", familyMember=" + familyMember + "]";
	}
	
}