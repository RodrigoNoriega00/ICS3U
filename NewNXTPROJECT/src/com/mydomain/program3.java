package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;

public class program3 {

	public static void main(String[] args) {
		Button.waitForAnyPress();
		System.out.println("Program 3");
		Motor.A.rotate(1440);
		System.out.println(Motor.A.getTachoCount());
		Motor.A.rotateTo(0);
		System.out.println(Motor.A.getTachoCount());
		Button.waitForAnyPress();
		

	}

}
