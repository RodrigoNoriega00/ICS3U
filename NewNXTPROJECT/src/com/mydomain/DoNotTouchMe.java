package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.util.Delay;

public class DoNotTouchMe {

	public static void main(String[] args) {
		TouchSensor touch = new TouchSensor(SensorPort.S1);
		Motor.A.setSpeed(420);
		Motor.B.setSpeed(1440);
		
		Motor.A.forward();
		Motor.B.forward();
		
		while(Motor.A.isMoving() && !Button.ENTER.isDown()){
			if(touch.isPressed()){
				Motor.A.rotate(45);
				Motor.A.setSpeed(1440);
				Motor.B.setSpeed(1440);
				
				Motor.A.forward();
				Motor.B.forward();
				Delay.msDelay(2000);
				Motor.A.stop();
				Motor.B.stop();
			}
		}

	}

}
