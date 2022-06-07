package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.component.superCar.EngineSuperCar;
import com.example.demo.component.superCar.WheelSuperCar;
import com.example.demo.component.useCar.EngineUseCar;
import com.example.demo.component.useCar.WheelUseCar;
import com.example.demo.domain.Car;
import com.example.demo.interfaces.IEngine;
import com.example.demo.interfaces.IWheel;

@SpringBootApplication
public class DependencyInjectionApplication {
	
	
	public static void main(String[] args) {
		IWheel wheelsc= new WheelSuperCar() ;
		IEngine enginesc= new EngineSuperCar();
		Car carSuperCar=new Car(enginesc, wheelsc);
		IWheel wheeluc= new WheelUseCar() ;
		IEngine engineuc= new EngineUseCar();
		Car carUseCard= new Car(engineuc, wheeluc);
		System.out.println(carSuperCar.toString());
		System.out.println(carUseCard.toString());
	}

}
