import lejos.nxt.Motor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class ChangeBox implements Behavior {

	private boolean suppressed = false;
	private UltrasonicSensor ultra;

	public ChangeBox(UltrasonicSensor us) {
		this.ultra = us;
	}

	public void suppress() {
		suppressed = true;
	}

	public boolean takeControl() {
		if (ultra.getDistance() <= 10) {
			return true;
			// if distance is less than or equal to ten, returns true
		}
		return false;
	}

	/** moves robot forward
	 * @parameters no parameters
	 * @return returns distance value
	 */
	public void action() {
		Motor.B.forward();
		
		Motor.A.forward();
		
		

		// Motor.A.rotate(720, true);
		// Motor.B.rotate(720);
		// //moves the robot
	}
}
