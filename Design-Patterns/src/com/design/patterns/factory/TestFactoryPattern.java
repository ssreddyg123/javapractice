package com.design.patterns.factory;

public class TestFactoryPattern {

	public static void main(String[] args) {
		Parser parser = ParserFactory.createParser(Parser.JSON);
		parser.getRecords(null);

	}

}
