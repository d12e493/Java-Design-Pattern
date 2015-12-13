package com.davis.director;

import com.davis.builder.MachineBuilder;
import com.davis.builder.SteeringBuilder;
import com.davis.builder.WheelBuilder;

public abstract class CarDirector {

	MachineBuilder machine;
	SteeringBuilder steering;
	WheelBuilder wheel;

	public CarDirector() {

	}

	void init(MachineBuilder machine, SteeringBuilder steering, WheelBuilder wheel) {
		this.machine = machine;
		this.steering = steering;
		this.wheel = wheel;
	}

	/**
	 * 初始化零件
	 */
	abstract void initComponenet();

	abstract void createCarFinish();

	public void createCar() {

		initComponenet();

		machine.createMachine();
		steering.createSteering();
		wheel.createWheel();

		createCarFinish();
	}
}
