package com.raju.java8examples;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionTest {
	public static void main(String[] args) {
		List<Integer> ageList = new ArrayList<Integer>();
		ageList.add(20);
		ageList.add(40);
		ageList.add(50);
		ageList.add(60);
		ageList.add(20);
		ageList.add(10);
		ageList.add(9);
		ageList.add(50);
		ageList.add(40);
		ageList.add(0);
		ageList.add(2);
		
		//traditional
		for(Integer age : ageList) {
			//System.out.println(age);
		}
		//lambda expression
		ageList.forEach(age->System.out.println(age));
		
		ageList.forEach(age-> {
			age = age*20;
			System.out.println("age 20 times"+age);
			}
		);
		
	}
}
