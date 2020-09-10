package com.design.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerailSingleton {

	public static void main(String[] args) throws Exception {
		
		Singleton s2 = Singleton.getInstance();
		print("s2", s2);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/singleto.ser"));
		oos.writeObject(s2);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/singleto.ser"));
		Singleton s4 = (Singleton) ois.readObject();
		ois.close();
		print("s4", s4);

	}

	static void print(String name, Singleton instance) {
		System.out.println(String.format("Object : %s, Hashcode : %d", name, instance.hashCode()));
	}
}
