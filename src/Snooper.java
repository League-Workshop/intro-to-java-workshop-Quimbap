import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String food = JOptionPane.showInputDialog("What is your favorite food?");
JOptionPane.showMessageDialog(null, "Hi?" + food);
}
}
