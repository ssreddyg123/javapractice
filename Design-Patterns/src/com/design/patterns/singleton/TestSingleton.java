package com.design.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {

	public static void main(String[] args) throws Exception {
		
		/*Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();*/
		
		//if two objects hashcode is equal, then has single instance.
		/*print("s1", s1);
		print("s2", s2);*/
		
		//1. Reflection
		/*Class clazz = Class.forName("com.design.patterns.singleton.Singleton");//load class file
		Constructor<Singleton>  constructor = clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton s3 = constructor.newInstance();
		print("s3", s3);*/
		
		//2. Serialization & DeSerialization
		/*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/singleto.ser"));
		oos.writeObject(s2);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/singleto.ser"));
		Singleton s4 = (Singleton) ois.readObject();
		ois.close();
		print("s4", s4);*/
		
		//3. Clone
		/*Singleton s5 = (Singleton)s1.clone();
		print("s5", s5);*/
		
		//4.a Multiple threads
		/*Thread th1 = new Thread(()-> createInstance());
		Thread th2 = new Thread(()-> createInstance());
		th1.start();th2.start();*/
		
		//4.b using executor service
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.submit(TestSingleton::createInstance);
		service.submit(TestSingleton::createInstance);
		service.submit(TestSingleton::createInstance);
		service.shutdown();
	}
	
	static void print(String name, Singleton instance) {
		System.out.println(String.format("Object : %s, Hashcode : %d", name, instance.hashCode()));
	}
	
	static void createInstance() {
		Singleton singleton = Singleton.getInstance();
		print("singleton", singleton);
	}

}
