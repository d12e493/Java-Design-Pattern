package com.davis.factory;

import com.davis.product.AbstractProductA;
import com.davis.product.AbstractProductB;

public abstract class AbstractFactory {

	public void commonExecute() {
		AbstractProductA productA = createProductA();
		AbstractProductB productB = createProductB();
		productA.execute();
		productB.execute();
	}

	public abstract AbstractProductA createProductA();

	public abstract AbstractProductB createProductB();

}
