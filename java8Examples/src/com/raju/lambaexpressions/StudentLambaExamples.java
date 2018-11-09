package com.raju.lambaexpressions;

import java.util.ArrayList;
import java.util.List;

import com.raju.model.Student;


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
