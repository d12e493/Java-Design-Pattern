package com.davis.client;

import com.davis.factory.AbstractFactory;
import com.davis.factory.ConcreteFactory;
import com.davis.factory.CustomConcreteFactory;
import com.davis.product.AbstractProduct;
import com.davis.product.ConcreteProduct1;
import com.davis.product.ConcreteProduct2;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = new ConcreteFactory();

		// product1
		AbstractProduct product1 = factory.createProduct(ConcreteProduct1.class);
		product1.commonMethod();

		// product2
		AbstractProduct product2 = factory.createProduct(ConcreteProduct2.class);
		product2.commonMethod();

		factory = new CustomConcreteFactory();
		AbstractProduct customProduct = factory.createProduct(ConcreteProduct2.class);
		customProduct.method2();
	}

}
