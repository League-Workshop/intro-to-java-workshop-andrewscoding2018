package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Jarvis = new Robot();
		// 5. Set your robot's pen down
		Jarvis.penDown();
		Jarvis.hide();
		// 3. Set the robot to go at max speed (10)
		Jarvis.setSpeed(1000);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int J = 0; J < 75; J++) {
			// 7. Change the pen color to random
			Jarvis.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			Jarvis.move(2 * J);
			// 2. Turn the robot 360/7 degrees to the right
			Jarvis.turn(360/7);
			// 8. Set the pen width to i
			Jarvis.setPenWidth(J);

		}

	}
}
