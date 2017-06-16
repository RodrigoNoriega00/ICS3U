import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.subsumption.Behavior;

public class PushBox implements Behavior {
	
		private boolean suppressed = false;
		private LightSensor light;
		private TouchSensor touch;
		
		public PushBox(LightSensor ls, TouchSensor ts){
			this.light = ls;
			this.touch = ts;
		}
		
		public void suppress(){
			suppressed = true;
		}
		/** checks light value
		 * @parameters no parameters
		 * @return returns light value
		 */
		public boolean takeControl(){
			if(light.getLightValue() < 40){
				action();
				return true;
				//returns true if light value is less than 40
			}
			return false;
		}

		public void action(){
			while(touch.isPressed() && !suppressed ){
				Motor.A.forward();
				Motor.B.forward();
				Thread.yield();
				//moves robot forward if touch sensor is not suppressed
			}
			Motor.A.rotate(180, true);
			Motor.B.rotate(-180);

			Motor.A.rotate(800, true);
			Motor.B.rotate(800);

			Motor.A.rotate(-180, true);
			Motor.B.rotate(180);

			// Motor.A.rotate(720, true);
			// Motor.B.rotate(720);
			// //moves the robot
			
			Motor.A.stop();
			Motor.B.stop();
		}
}
