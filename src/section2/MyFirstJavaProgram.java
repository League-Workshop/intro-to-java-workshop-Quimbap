package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot dude = new Robot();
		dude.setPenColor(Color.CYAN);
		dude.sparkle();
		dude.setSpeed(100);
		dude.penDown();
		for (int i = 0; i < 4; i++) {
			dude.move(70);
			dude.turn(90);

		}
	}
}