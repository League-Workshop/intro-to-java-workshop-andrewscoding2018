package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
	
Robot moby = new Robot();
moby.setPenWidth(7);
moby.setSpeed(200);
moby.penDown();
for(int US = 0; US < 100; US++)
{
moby.turn(40);
moby.move(10);
for (int Tim = 0; Tim < 6; Tim++)
{
	moby.setRandomPenColor();
	moby.move(20);
	moby.turn(20);
}
}	
		
		
	}
}
