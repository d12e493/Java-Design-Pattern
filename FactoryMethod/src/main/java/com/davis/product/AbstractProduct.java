package com.davis.product;

public abstract class AbstractProduct {
	private void privateMethod() {
		System.out.println("這是AbstractProduct私有方法");
	}

	public void commonMethod() {
		privateMethod();
		method2();
	}

	public abstract void method2();
}
