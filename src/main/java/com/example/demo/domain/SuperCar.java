package com.example.demo.domain;

import com.example.demo.interfaces.IEngine;
import com.example.demo.interfaces.IRun;
import com.example.demo.interfaces.IWheel;

public class SuperCar extends Car implements IRun{
	public SuperCar(IEngine engine, IWheel wheel) {
		super(engine, wheel);
	}

	@Override
	public void runNable() {
		System.out.println("SuperCar running...");
		
	}

	@Override
	public void getCarInfo() {
		iEngine.getEngine();
		iWheel.getWheel();
		
	}
}
