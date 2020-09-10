package com.design.patterns.singleton;

public class CloneSingleton {

	public static void main(String[] args) throws Exception {
		
		Singleton s2 = Singleton.getInstance();
		print("s2", s2);
		
		Singleton s3 = (Singleton) s2.clone();
		print("s3", s3);
	}
	
	static void print(String name, Singleton instance) {
		System.out.println(String.format("Object : %s, Hashcode : %d", name, instance.hashCode()));
	}

}
