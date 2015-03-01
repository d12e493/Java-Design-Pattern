package com.davis.client;

import com.davis.factory.AbstractFactory;
import com.davis.factory.Factory1;
import com.davis.factory.Factory2;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = null;

		factory = new Factory1();
		factory.commonExecute();

		factory = new Factory2();
		factory.commonExecute();
	}

}
