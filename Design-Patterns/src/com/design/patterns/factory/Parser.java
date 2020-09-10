package com.design.patterns.factory;

import java.io.File;
import java.util.List;

public interface Parser {
	
	String CSV = "csv";
	String XML = "xml";
	String TEXT = "text";
	String JSON = "json";
	
	List<Record> getRecords(File file);

}
