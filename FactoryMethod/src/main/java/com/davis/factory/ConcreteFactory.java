package com.davis.factory;

import com.davis.product.AbstractProduct;

public class ConcreteFactory extends AbstractFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends AbstractProduct> T createProduct(Class<T> c) {
		AbstractProduct product = null;
		
		try {
			product=(T)c.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return (T)product;
	}

}
