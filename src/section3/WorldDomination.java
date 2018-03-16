package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog("Do you know how to write code?");
		if (input.equalsIgnoreCase("yes")) {
			// 2. If they say "yes", tell them they will rule the world.

			JOptionPane.showMessageDialog(null, "Good job! You're going to rule the world!");
		} else {
			// 3. Otherwise, wish them good luck washing dishes.
			JOptionPane.showMessageDialog(null, "Hm... good luck washing dishes!");
		}
	}
}
