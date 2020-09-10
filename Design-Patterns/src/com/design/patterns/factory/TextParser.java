package com.design.patterns.factory;

import java.io.File;
import java.util.List;

public class TextParser implements Parser {

	@Override
	public List<Record> getRecords(File file) {
		System.out.println("Parsing text file and generate records....");
		return null;
	}
	
	

}
