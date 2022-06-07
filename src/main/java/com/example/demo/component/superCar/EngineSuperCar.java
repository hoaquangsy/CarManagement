package com.example.demo.component.superCar;

import com.example.demo.interfaces.IEngine;

import lombok.ToString;

@ToString
public class EngineSuperCar implements IEngine{

	@Override
	public void getEngine() {
		System.out.println("Engine SuperCar");
		
	}

}
