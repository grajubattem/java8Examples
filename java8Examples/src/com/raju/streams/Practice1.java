package com.raju.streams;

import java.util.ArrayList;
import java.util.List;

import com.raju.model.Student;

public class Practice1{
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student(36, "Raju1", "Hyderabad1");
		Student student2 = new Student(37, "Raju2", "Hyderabad2");
		Student student3 = new Student(38, "Raju3", "Hyderabad3");
		Student student4 = new Student(39, "Raju4", "Hyderabad4");
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);//change
		
		studentList.forEach(stu->{
			System.out.println(stu.getAddress());
			System.out.println(stu.getAge());
		});
		
		boolean student = studentList.stream().allMatch(stu->stu.getAge()==20);
		System.out.println(student);
	}
}