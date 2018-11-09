package com.raju.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.raju.model.Student;

public class StreamToList {
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
		
		Stream<List<Student>> studentStream = Stream.of(studentList);
		//adding list to stream and iteration
		//studentStream.forEach(stuList->stuList.forEach(stu->System.out.println(stu.toString())));
		List<List<Student>> stuListFromStream = studentStream.collect(Collectors.toList());
		stuListFromStream.forEach(list -> list.forEach(stu-> {
			if(stu.getAge()>=30){
				System.out.println(stu.toString());
			}
		}
		));
		
	}
}
