package com.raju.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.raju.model.Student;

public class StreamWithCustomizedSortingStudentAndFilter {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student(75, "Raju", "Hyderabad");
		Student student2 = new Student(20, "Ganga", "Hyderabad");
		Student student3 = new Student(50, "Battem", "Hyderabad");
		Student student4 = new Student(60, "John", "Hyderabad");
		Student student5 = new Student(70, "Smith", "Hyderabad");
		Student student6 = new Student(40, "Sachin", "Hyderabad");
		Student student7 = new Student(55, "Dhoni", "Hyderabad");
		Student student8 = new Student(65, "Tendulkar", "Hyderabad");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);
		studentList.add(student8);
		
		Stream<Student> studentStream = studentList.stream().filter(Student->Student.getAge()>50).sorted(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAge()-s2.getAge();
			}
		});
		
		studentStream.forEach(Student -> System.out.println(Student.toString()));
	}
}
