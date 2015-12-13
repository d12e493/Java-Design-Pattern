package com.davis.client;

import com.davis.director.CarDirector;
import com.davis.director.GermanyCarDirector;
import com.davis.director.TaichungCarDirector;
import com.davis.director.TaipeiCarDirector;

public class Client {

	public static void main(String[] args) {
		CarDirector taipeiDirector = new TaipeiCarDirector();
		taipeiDirector.createCar();

		CarDirector taichungDirector = new TaichungCarDirector();
		taichungDirector.createCar();

		CarDirector germanyDirector = new GermanyCarDirector();
		germanyDirector.createCar();
	}

}
