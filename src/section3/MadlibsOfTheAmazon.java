package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
	JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String dude = JOptionPane.showInputDialog("Tell me an adjective");
		// Get the user to enter a type of liquid
JOptionPane.showInputDialog("Tell me a liquid.");
		// Get the user to enter a body part
JOptionPane.showInputDialog("Tell me a body part.");
		// Get the user to enter a verb
JOptionPane.showInputDialog("Tell me a verb");
		// Get the user to enter a place
JOptionPane.showInputDialog("Quick! Give me a place/location!!");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more sassy during the day, so cross the river at
		// night. Piranhas are attracted to fresh coke and will most
		// likely take a bite out of your femur if you read. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the Dubai spa. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more sassy during the day, so cross the river at night. Piranhas are attracted to fresh coke and will mostlikely take a bite out of your femur if you read. Whatever you do, if you have an open wound, try to find another way to get back to the Dubai spa. Good luck!");

	}
}

