package com.davis.builder;

import com.davis.model.AbstractHouse;

public interface Builder {
	void createHouseName();

	void createDoor();

	void ceateWindow();

	AbstractHouse getHouse();
}
