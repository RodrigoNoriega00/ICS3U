package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;

public class SonarBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UltrasonicSensor sonar= new UltrasonicSensor(SensorPort.S4);
		
		Motor.A.setSpeed(360);
		Motor.B.setSpeed(360);
		Motor.A.forward();
		Motor.B.forward();
		
		while(Motor.A.isMoving() && !Button.ENTER.isDown()){
		sonar.ping();
		Delay.msDelay(20);
		
		if(sonar.getDistance()<30){
			Motor.A.stop();
			Motor.B.stop();
			Sound.buzz();
			Sound.buzz();
			Sound.buzz();
			Motor.A.rotate(180);
			Motor.A.setSpeed(360);
			Motor.B.setSpeed(360);
			Motor.A.forward();
			Motor.B.forward();
		}

		else if (sonar.getDistance()<=50){
			Motor.A.setSpeed(1440);
			Motor.B.setSpeed(1440);
			
			Motor.A.forward();
			Motor.B.forward();
				
			}
		else{
			Motor.A.setSpeed(360);
			Motor.B.setSpeed(360);
			Motor.A.forward();
			Motor.B.forward();
		}
		}
		
	}
	
}


