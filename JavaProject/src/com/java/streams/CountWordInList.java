package com.java.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordInList {

	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("apple","banana","grapes","gauva","apple","grapes","apple");
		Map<String, Long> itemCount = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(itemCount);
		
		String[] names = {"Suresh", "Ramesh", "hari", "Suresh", "hari", "Mahesh"};
		Map<String, Long> namesCount = Arrays.stream(names).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(namesCount);
		
		System.out.println("sorting keys.....");
		
		Map<String, Long> itemsSort = new LinkedHashMap<>();
		itemCount.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEachOrdered(item -> itemsSort.put(item.getKey(), item.getValue()));		
		System.out.println(itemsSort);
		
	}

}
