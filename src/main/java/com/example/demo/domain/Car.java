package com.example.demo.domain;

import com.example.demo.interfaces.IEngine;
import com.example.demo.interfaces.IWheel;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
abstract class Car {
IEngine iEngine;
IWheel iWheel;

public abstract void getCarInfo();
}
