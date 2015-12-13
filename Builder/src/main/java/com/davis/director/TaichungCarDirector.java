package com.davis.director;

import com.davis.builder.impl.BetaSteeringBuilderImpl;
import com.davis.builder.impl.BigWheelBuilderImpl;
import com.davis.builder.impl.JapanMachineBuilderImpl;

public class TaichungCarDirector extends CarDirector {

	@Override
	void initComponenet() {
		init(new JapanMachineBuilderImpl(), new BetaSteeringBuilderImpl(), new BigWheelBuilderImpl());
	}

	@Override
	void createCarFinish() {
		System.out.println("create TaichungCar finish");
	}

}
