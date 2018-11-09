package com.raju.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamToMap {
	public static void main(String[] args) {
		Map<String, String>  nameVsAgemap = new HashMap<String, String>();
		nameVsAgemap.put("Raju", "35");
		nameVsAgemap.put("Gnaga", "30");
		nameVsAgemap.put("Battem", "32");
		nameVsAgemap.put("John", "36");
		nameVsAgemap.put("Smith", "53");
		nameVsAgemap.put("Joe", "60");
		Map<String, String> map = Stream.of(nameVsAgemap).findFirst().get();
		map.keySet().forEach(name -> System.out.println(name +"="+map.get(name)));
		Stream.of(nameVsAgemap).findFirst().get().keySet().forEach(name -> System.out.println(name.toString()));
		Stream<Map<String, String>> mapStream = Stream.of(nameVsAgemap).filter(mapp -> mapp.containsKey("Raju"));
		mapStream.forEach(filteredMap -> System.out.println(filteredMap +"=="+filteredMap.get(filteredMap)));
	}
}
