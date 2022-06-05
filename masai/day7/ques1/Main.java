package com.masai.day7.ques1;

public class Main{
	
	public static void main(String[] args) {
		Member m1 = new Member();
	
		Employee e1 = new Employee();
		
		e1.setName("Vibhav");
		e1.setAge(22);
		e1.setPhone_number("9621204970");
		e1.setAddress("Uttar pradesh");
		e1.setSalary(99000.0);
		e1.setSpecialisation("java");
		e1.setDepartment("SDE-1");
		e1.printDetails();
		e1.printSalary();
		
		Manager m2 = new Manager();
		e1.setName("Vibhav Mishra");
		e1.setAge(21);
		e1.setPhone_number("9090909090");
		e1.setAddress("Parayagraj");
		e1.setSalary(100000.0);
		e1.setSpecialisation("java tech manager");
		e1.setDepartment("Manager");
		e1.printDetails();
		e1.printSalary();
		
	}
}