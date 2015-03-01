package com.davis.client;

import com.davis.factory.AbstractFactory;
import com.davis.factory.ConcreteFactory;
import com.davis.product.AbstractProduct;
import com.davis.product.ConcreteProduct1;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = new ConcreteFactory();
		AbstractProduct product = factory.createProduct(ConcreteProduct1.class);
		product.commonMethod();
	}

}
