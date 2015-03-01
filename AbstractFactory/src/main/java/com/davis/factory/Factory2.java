package com.davis.factory;

import com.davis.product.AbstractProductA;
import com.davis.product.AbstractProductB;
import com.davis.product.ProductA2;
import com.davis.product.ProductB2;

public class Factory2 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
