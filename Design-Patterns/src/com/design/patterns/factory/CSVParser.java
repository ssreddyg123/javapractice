package com.design.patterns.factory;

import java.io.File;
import java.util.List;

public class CSVParser implements Parser {
	
	@Override
	public List<Record> getRecords(File file) {
		System.out.println("Parsing csv file and generate records....");
		return null;
	}


}
