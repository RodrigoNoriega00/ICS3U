package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class program5 {

	public static void main(String[] args) {
		System.out.println("Program 5");
		Motor.A.setSpeed(720);
		Motor.B.setSpeed(720);
		Motor.A.rotateTo(720);
		Motor.B.rotateTo(720);
		
		while(Motor.A.isMoving()){
		Delay.msDelay(200);
		System.out.println(Motor.A.getTachoCount());
		System.out.println(Motor.A.getTachoCount());
		}
		int x = 0;
		
		Motor.A.rotateTo(720);
		Motor.B.rotateTo(720);
		
		while(Motor.A.isMoving() && x<8){
			Delay.msDelay(200);
			System.out.println(Motor.A.getTachoCount());
			System.out.println(Motor.A.getTachoCount());
			Button.waitForAnyPress();
			x++;
		}
	
	}
}

