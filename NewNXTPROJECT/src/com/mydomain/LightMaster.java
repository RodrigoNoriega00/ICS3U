package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;

public class LightMaster {

	public static void main(String[] args) {
		LightSensor light = new LightSensor(SensorPort.S1);
		
		Motor.A.setSpeed(500);
		Motor.B.setSpeed(500);
		Motor.A.forward();
		Motor.B.forward();
		
		while(!Button.ENTER.isDown()){
			if(light.getLightValue()>40){
				Motor.A.rotate(3);
				
			}
			else{
				Motor.A.forward();
				Motor.B.forward();
			}
		}
		Motor.A.stop();
		Motor.B.stop();
				
			
		}

	}


