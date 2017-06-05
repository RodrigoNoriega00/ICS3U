package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;

public class program4 {

	public static void main(String[] args) {
		Button.waitForAnyPress();
		System.out.println("Program 4");
		Motor.A.rotate(-1440, true);
		while (Motor.A.isMoving()){
			System.out.println(Motor.A.getTachoCount());
			Button.waitForAnyPress();
			Motor.A.stop();
		}
		System.out.println(Motor.A.getTachoCount());
		Button.waitForAnyPress();
	}

}
