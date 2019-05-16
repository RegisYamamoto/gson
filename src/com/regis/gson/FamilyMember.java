package com.regis.gson;

public class FamilyMember {

	private String role;
	private int age;
	
	public FamilyMember(String role, int age) {
		super();
		this.role = role;
		this.age = age;
	}

	@Override
	public String toString() {
		return "FamilyMember [role=" + role + ", age=" + age + "]";
	}
	
}