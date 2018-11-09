package com.raju.java8examples;

interface FunctionalInterfaces {

	void abstractFun(int x);
	
	default void normalFun() {
		System.out.println("hello");
	}
}

public class FunctionalInterfacesTest{
	public static void main(String[] args) {
		FunctionalInterfaces funInter = (int x)->System.out.println(2*x);
		funInter.abstractFun(10);
	}
}