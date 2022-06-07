package com.example.demo.component.useCar;

import com.example.demo.interfaces.IWheel;

import lombok.ToString;
@ToString
public class WheelUseCar implements IWheel{

	@Override
	public void getWheel() {
		System.out.println("Wheel UseCar");
		
	}

}
