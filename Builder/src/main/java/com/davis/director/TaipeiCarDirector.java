package com.davis.director;

import com.davis.builder.impl.BetaSteeringBuilderImpl;
import com.davis.builder.impl.ChinaMachineBuilderImpl;
import com.davis.builder.impl.SmallWheelBuilderImpl;

public class TaipeiCarDirector extends CarDirector {

	@Override
	void initComponenet() {
		init(new ChinaMachineBuilderImpl(), new BetaSteeringBuilderImpl(), new SmallWheelBuilderImpl());
	}

	@Override
	void createCarFinish() {
		System.out.println("create taipei car finish");
	}

}
