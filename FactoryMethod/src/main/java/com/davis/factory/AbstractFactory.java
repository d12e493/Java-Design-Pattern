package com.davis.factory;

import com.davis.product.AbstractProduct;

public abstract class AbstractFactory {
	public abstract <T extends AbstractProduct> T createProduct(Class<T> c);
}
