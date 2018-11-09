package com.raju.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAnyMatch {
	public static void main(String[] args) {
		//List 
		List<Integer> list = Arrays.asList(3,4,6,12,20,20,12);
		Stream<Integer> ageStream = list.stream();
		/*boolean answer = ageStream.anyMatch(n->n==4);
		System.out.println(answer);*/
		Stream<Integer> distinctStream = list.stream().distinct();
		//System.out.println(distinctStream);
		System.out.println(ageStream.filter(n->n==20).count());
		
		//String Stream
		Stream<String> nameStream = Stream.of("ganga", "raju", "battem", "graju.battem@gmail.com");
		boolean answer2 = nameStream.anyMatch(name -> name.equalsIgnoreCase("RAJU"));
		System.out.println(answer2);
		
		
		
	}
}
