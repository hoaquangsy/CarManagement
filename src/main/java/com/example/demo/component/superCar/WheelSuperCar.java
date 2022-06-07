package com.example.demo.component.superCar;

import com.example.demo.interfaces.IWheel;

import lombok.ToString;

@ToString
public class WheelSuperCar implements IWheel{

	@Override
	public void getWheel() {
		System.out.println("Wheel SuperCar");
		
	}

}
