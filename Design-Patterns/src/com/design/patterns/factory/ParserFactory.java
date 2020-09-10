package com.design.patterns.factory;

public class ParserFactory {
	
	public static Parser createParser(String type) {
		Parser parser = null;
		switch (type) {
		case Parser.JSON:
			parser = new JsonParser();
			break;
		case Parser.TEXT:
			parser = new TextParser();
			break;
		case Parser.XML:
			parser = new XmlParser();
			break;
		case Parser.CSV:
			parser = new CSVParser();
			break;
		default:
			break;
		}
		return parser;
	}

}
