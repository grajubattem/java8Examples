package com.raju.lambaexpressions;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int age;
	private String name;
	private String address;
	
	public Student(int age, String name, String address) {
		this.age=age;
		this.name=name;
		this.address=address;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
}
public class StudentLambaExamples {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student(35, "Raju", "Hyderabad");
		Student student2 = new Student(35, "Raju", "Hyderabad");
		Student student3 = new Student(35, "Raju", "Hyderabad");
		Student student4 = new Student(35, "Raju", "Hyderabad");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		studentList.forEach(student->{
			System.out.println(student.toString());
			student.setAge(2*student.getAge());
			System.out.println(student.toString());
		});
	}
}
