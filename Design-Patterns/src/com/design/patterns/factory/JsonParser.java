package com.design.patterns.factory;

import java.io.File;
import java.util.List;

public class JsonParser implements Parser {
	
	@Override
	public List<Record> getRecords(File file) {
		System.out.println("Parsing json file and generate records....");
		return null;
	}


}
