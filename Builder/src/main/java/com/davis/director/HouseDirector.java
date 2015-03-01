package com.davis.director;

import com.davis.builder.Builder;
import com.davis.builder.ChinaBuilder;
import com.davis.model.AbstractHouse;

public class HouseDirector {
	private Builder builder = new ChinaBuilder();;

	public AbstractHouse createHouse() {
		this.builder.ceateWindow();
		this.builder.createDoor();
		this.builder.createHouseName();
		return this.builder.getHouse();
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
}
