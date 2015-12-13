package com.davis.director;

import com.davis.builder.impl.BigWheelBuilderImpl;
import com.davis.builder.impl.ChinaMachineBuilderImpl;
import com.davis.builder.impl.MitsubishiSteeringBuilderImpl;

public class GermanyCarDirector extends CarDirector {

	@Override
	void initComponenet() {
		init(new ChinaMachineBuilderImpl(), new MitsubishiSteeringBuilderImpl(), new BigWheelBuilderImpl());
	}

	@Override
	void createCarFinish() {
		System.out.println("create GermanyCar finish");
	}

}
