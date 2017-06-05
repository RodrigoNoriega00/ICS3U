package com.mydomain;
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.Sound;

public class HelloWorld {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
        Button.waitForAnyPress();
        
        Motor.A.setSpeed(720);// 2 RPM
        Motor.B.setSpeed(720);
        Motor.A.forward();
        Motor.B.forward();
       Thread.sleep (1000);
        Motor.A.stop();
        Motor.B.stop();
        Motor.A.rotateTo( 360);
        Motor.A.rotate(-720,true);
        Motor.B.forward();
        Motor.A.rotateTo( 180);
        Motor.B.forward();
        
        Sound.beep();
        Sound.buzz();
        Sound.beep();
   
	}
}
