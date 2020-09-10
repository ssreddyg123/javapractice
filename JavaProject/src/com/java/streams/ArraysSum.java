package com.java.streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArraysSum {

	public static void main(String[] args) {
		
		int[] marks = {20,21,25,62,24,54,78,45,79,95,75,65,52,73,20,21,25,62,24,54,78,45,79,95,75,65,52,73};
		
		int total = Arrays.stream(marks).sum();
		System.out.println("Total : "+total);
		
		OptionalDouble avg = Arrays.stream(marks, 1, 4).average();
		System.out.println("Average : "+avg.getAsDouble());
		
		int total1 = Arrays.stream(marks, 1, 4).sum();
		System.out.println("Total 1 : "+total1);
		
		System.out.println("Distinct array elements ");
		
		Arrays.stream(marks).distinct().forEach(System.out::println);
		
	}

}
