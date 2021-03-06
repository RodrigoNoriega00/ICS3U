package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.util.Delay;

public class SoundMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoundSensor sound= new SoundSensor(SensorPort.S3,true);
		sound.readValue();
		
		Motor.A.setSpeed(180);
		Motor.B.setSpeed(180);
		Motor.A.forward();
		Motor.B.forward();
		
		while(Motor.A.isMoving() && !Button.ENTER.isDown()){
			if(sound.readValue()>50){
			Motor.A.setSpeed(1080);
			Motor.B.setSpeed(1080);
			Motor.A.forward();
			Motor.B.forward();
			Delay.msDelay(2000);

			Motor.A.setSpeed(180);
			Motor.B.setSpeed(180);
			Motor.A.forward();
			Motor.B.forward();
			}
		}
		
		
		}

		
	}


