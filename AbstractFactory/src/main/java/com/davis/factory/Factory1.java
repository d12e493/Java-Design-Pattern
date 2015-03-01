package com.davis.factory;

import com.davis.product.AbstractProductA;
import com.davis.product.AbstractProductB;
import com.davis.product.ProductA1;
import com.davis.product.ProductB1;

public class Factory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
