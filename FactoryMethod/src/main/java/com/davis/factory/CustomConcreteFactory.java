package com.davis.factory;

import com.davis.product.AbstractProduct;

public class CustomConcreteFactory extends AbstractFactory {

	@Override
	public <T extends AbstractProduct> T createProduct(Class<T> c) {

		AbstractProduct product = null;

		try {
			product = (T) c.newInstance();
			product.commonMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (T) product;
	}

}
