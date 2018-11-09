package com.raju.java8examples;

interface FunctInter1{
	int operation(int a, int b);
}

interface FunctInter2{
	void sayMessage(String message);
}


public class FunctionalInterfacesWithOperations {

	static int operate(int a, int b, FunctInter1 operation) {
		return operation.operation(a, b);
	}

	public static void main(String[] args) {
		FunctInter1 add = (int x, int y)->x+y;
		FunctInter1 mul = (int x, int y)->x*y;
		FunctInter2 message = (mess)->{System.out.println("Hello"+"how are you"+mess);};
		message.sayMessage(" John ");
		
		int output = operate(10, 20, add);
		System.out.println(output);
		
		int output2 = operate(10,  20, mul);
		System.out.println(output2);
	}
}
