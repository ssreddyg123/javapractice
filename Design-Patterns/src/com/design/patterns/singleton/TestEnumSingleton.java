package com.design.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

public class TestEnumSingleton {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		
		EnumSingleton s1 = EnumSingleton.INSTANCE;
		EnumSingleton s2 = EnumSingleton.INSTANCE;
		
		//if two objects hashcode is equal, then has single instance.
		print("s1", s1);
		print("s2", s2);
		
		
		
		//2. Serialization & DeSerialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/singleto.ser"));
		oos.writeObject(s2);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/singleto.ser"));
		EnumSingleton s4 = (EnumSingleton) ois.readObject();
		ois.close();
		print("s4", s4);
		
		
		
		//4.a Multiple threads
		Thread th1 = new Thread(()-> createInstance());
		Thread th2 = new Thread(()-> createInstance());
		th1.start();th2.start();

	}
	
	static void print(String name, EnumSingleton instance) {
		System.out.println(String.format("Object : %s, Hashcode : %d", name, instance.hashCode()));
	}
	
	static void createInstance() {
		EnumSingleton sing = EnumSingleton.INSTANCE;
		print("EnumSingleton", sing);
	}

}
