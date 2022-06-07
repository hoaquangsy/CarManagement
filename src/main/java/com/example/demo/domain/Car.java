package com.example.demo.domain;

import com.example.demo.interfaces.IEngine;
import com.example.demo.interfaces.IWheel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Car {
IEngine iEngine;
IWheel iWheel;

@Override
public String toString() {
	return "Car [iEngine=" + iEngine.toString() + ", iWheel=" + iWheel.toString() + "]";
}


}

