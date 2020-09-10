package com.java.streams;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCountInString {

	public static void main(String[] args) {
		
		String content = "helloabcdschelloyeydydyhelloesyuhghelloyfbcbcv";
		Pattern pattern = Pattern.compile("hello");
		Matcher matcher = pattern.matcher(content);
		
		int occurences = 0;
		
		while(matcher.find()) {
			occurences++;
		}
		
		System.out.println("Word Count : "+occurences);

	}

}
