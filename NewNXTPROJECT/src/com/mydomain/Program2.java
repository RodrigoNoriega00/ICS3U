package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class Program2 {

	public static void main(String[] args) {
		
		Button.waitForAnyPress();
		LCD.drawString("Program 2", 0, 0);
		Motor.A.setSpeed(720);
	    Motor.B.setSpeed(720);
	    Motor.A.forward();
	    Delay.msDelay(2000);
	    System.out.println("720");
	    Motor.A.stop();
	    System.out.println(Motor.A.getTachoCount());
	    while(Motor.A.getTachoCount()>0){
	    	 Motor.A.backward();
	    	 Motor.B.backward();
	    }
	    System.out.println(Motor.A.getTachoCount());
	    Motor.A.stop();
	    Motor.B.stop();
	    System.out.println(Motor.A.getTachoCount());
	    Button.waitForAnyPress();
		
	  
	}

}
