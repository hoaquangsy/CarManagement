package com.example.demo.domain;

import com.example.demo.interfaces.IEngine;
import com.example.demo.interfaces.IRun;
import com.example.demo.interfaces.IWheel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UseCar extends Car implements IRun {
	public UseCar(IEngine engineuc, IWheel wheeluc) {
		super(engineuc, wheeluc);
	}

	@Override
	public void runNable() {
		System.out.println("UseCar running...");

	}

	@Override
	public void getCarInfo() {
		iEngine.getEngine();
		iWheel.getWheel();
		
	}

}
