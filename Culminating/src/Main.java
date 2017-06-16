import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;


/**Main
 * 15/06/2017
 * Controls robot to push a dark object
 * @author Rodrigo Noriega
 *
 */
public class Main {

	public static void main(String[] args) {

		LightSensor light = new LightSensor(SensorPort.S2);
		TouchSensor touch = new TouchSensor(SensorPort.S1);
		UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S4);
		
		Behavior b1 = new Stop();
		Behavior b2 = new PushBox(light, touch);
		Behavior b3 = new ChangeBox(ultra);
		//assigns behavior 

		Behavior[] behaviours = {b2, b3, b1};// level of importance for robot
		Arbitrator arbitrator = new Arbitrator(behaviours);
		arbitrator.start();
	}

}
