package com.davis.builder;

import com.davis.model.AbstractHouse;
import com.davis.model.ChinaHouse;

public class ChinaBuilder implements Builder {

	private AbstractHouse house = new ChinaHouse();

	public void createHouseName() {
		house.setHouseName("china house");
	}

	public void createDoor() {
		house.setDoor("china door");
	}

	public void ceateWindow() {
		house.setWindow("china windows");
	}

	public AbstractHouse getHouse() {
		return house;
	}

}
