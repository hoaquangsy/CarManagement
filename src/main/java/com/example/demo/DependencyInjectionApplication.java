package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.component.superCar.EngineSuperCar;
import com.example.demo.component.superCar.WheelSuperCar;
import com.example.demo.component.useCar.EngineUseCar;
import com.example.demo.component.useCar.WheelUseCar;
import com.example.demo.domain.SuperCar;
import com.example.demo.domain.UseCar;
import com.example.demo.interfaces.IEngine;
import com.example.demo.interfaces.IWheel;

@SpringBootApplication
public class DependencyInjectionApplication {
	
	
	public static void main(String[] args) {
//		SpringApplication.run(DependencyInjectionApplication.class, args);
		IWheel wheelsc= new WheelSuperCar() ;
		IEngine enginesc= new EngineSuperCar();
		SuperCar superCar=new SuperCar(enginesc, wheelsc);
		superCar.runNable();
		superCar.getCarInfo();
		System.out.println("----------");
		IWheel wheeluc= new WheelUseCar() ;
		IEngine engineuc= new EngineUseCar();
		UseCar useCar= new UseCar(engineuc, wheeluc);
		useCar.runNable();
		useCar.getCarInfo();
		
	}

}
