package com.raju.streams;

import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		Stream<Integer> ageStream = Stream.of(1,2,3,4,5,6,7,8,9);
		ageStream.forEach(Integer -> System.out.println(Integer));
		
		Stream<Integer> ageStream1 = Stream.of(new Integer[] {1,2,3});
		ageStream1.forEach(age -> System.out.println(age));
	}
}
