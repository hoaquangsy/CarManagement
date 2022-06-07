package com.example.demo.component.useCar;

import com.example.demo.interfaces.IEngine;

import lombok.ToString;
@ToString
public class EngineUseCar implements IEngine{

	@Override
	public void getEngine() {
		System.out.println("Engine UseCar");
		
	}

}
