package com.design.patterns.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	/* Eagerly creation */
	// private static Singleton singleton = new Singleton();

	private static volatile Singleton singleton;

	private Singleton() {
		if (singleton != null) {
			throw new InstantiationError("Can't instantiate singleton twice");
		}
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {// double check locking
					singleton = new Singleton();// lazy creation
				}
			}
		}
		return singleton;
	}

	// clone object from the instance
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();
		return getInstance();
	}

	// serialization & deserialization
	protected Object readResolve() {
		return getInstance();
	}

}
