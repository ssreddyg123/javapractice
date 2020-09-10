package com.design.patterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {

	public static void main(String[] args) throws Exception {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		print("s1", s1);
		print("s2", s2);
		
		Class clazz = Class.forName("com.design.patterns.singleton.Singleton");//load class file
		Constructor<Singleton>  constructor = clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton s3 = constructor.newInstance();
		print("s3", s3);
		
		

	}
	

	static void print(String name, Singleton instance) {
		System.out.println(String.format("Object : %s, Hashcode : %d", name, instance.hashCode()));
	}

}
