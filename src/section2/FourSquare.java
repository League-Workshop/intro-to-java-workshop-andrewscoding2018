package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot Jim = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		Jim.setSpeed(200);
		Jim.penDown();
		// 5. Set the pen width to 5
		Jim.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int o = 0; o < 4; o++) {
			// 7. Set the pen color to random
			Jim.setRandomPenColor();

			// 1. Call the drawSquare() method
			drawSquare();

			// 8. Turn the robot 90 degrees to the right
			Jim.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		for (int i = 0; i < 4; i++) {
			Jim.move(40);
			Jim.turn(90);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
