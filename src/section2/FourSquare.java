package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot dude = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		dude.setSpeed(100);
		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
			dude.setRandomPenColor();
			dude.penDown();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			dude.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		// JOptionPane.showMessageDialog(null, "yay! you called the drawSquare()
		// method!");
		for (int i = 0; i < 5; i++) {
			dude.move(90);
			dude.turn(45);
			dude.sparkle();
			dude.turn(90);
			dude.move(34);
			dude.turn(45);
			dude.move(97);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
