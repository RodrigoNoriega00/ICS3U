package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCD.drawString("Program 1",0,0); 
		Button.waitForAnyPress();
		Motor.A.setSpeed(1200);// 2 RPM
	       Motor.B.setSpeed(1200);
	      Motor.A.forward();
	        Motor.B.forward();
	        System.out.println("Forward");
	        Button.waitForAnyPress();
	        Motor.A.backward(); 
	        Motor.B.backward(); 
	        System.out.println("Backward");
	        Button.waitForAnyPress();
	        Motor.A.stop();
	        Motor.B.stop();
	}

}
