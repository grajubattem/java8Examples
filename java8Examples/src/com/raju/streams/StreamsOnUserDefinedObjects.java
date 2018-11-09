package com.raju.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.raju.model.Student;

public class StreamsOnUserDefinedObjects {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student(75, "Raju", "Hyderabad");
		Student student2 = new Student(20, "Ganga", "Hyderabad");
		Student student3 = new Student(50, "Battem", "Hyderabad");
		Student student4 = new Student(60, "Raju", "Hyderabad");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		Stream<Student> studentStream = studentList.stream().filter(Student->Student.getAge()>50).sorted(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAge()-s2.getAge();
			}
		});
		studentStream.forEach(Student->System.out.println(Student.toString()));
	}
}
