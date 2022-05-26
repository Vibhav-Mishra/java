package com.masai.day4;

public class Student {

	int roll;
	String name;
	String address;
	String collageName;
	
	Student(int roll, String name, String address){
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = "ASU";
	}
	
	Student(int roll, String name, String address, String collage){
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collage;
	}
	
	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT == true) {
			Student s1 = new Student(69,"Raj","Allahabad");
			return s1;
		}
		else {
			Student s1 = new Student(469, "Vibhav", "Prayagraj", " ASU");
			return s1;
		}
	}

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = getStudent(true);
		System.out.println("Student From ASU");
		System.out.println("Roll No : "+st.roll);
		System.out.println("Name : "+st.name);
		System.out.println("Address : "+st.address);
		System.out.println("Collage : "+st.collageName);
		
		System.out.println("--------------------------------------");
		
		Student s = getStudent(false);
		System.out.println("Student from another Collage");
		System.out.println("Roll No : "+s.roll);
		System.out.println("Name : "+s.name);
		System.out.println("Address : "+s.address);
		System.out.println("Collage : "+s.collageName);
		
		
	}

}
