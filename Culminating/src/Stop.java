import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Stop implements Behavior {

	private boolean suppressed = false;

	public void suppress(){
		suppressed = true;
	}

	/** stops the robot if button is pressed
	 * @parameters no parameters
	 * @return no return
	 */
	public boolean takeControl(){
		if(Button.ESCAPE.isDown()){
			return true;
			//stops the program
		}
		return false;
	}

	public void action(){
		System.exit(0);
	}
}
