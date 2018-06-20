package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String bike = JOptionPane.showInputDialog("What is your dream bike?");
		JOptionPane.showMessageDialog(null, "Why is your dream bike a" + bike + "?");
		JOptionPane.showInputDialog("?");
		
	}

}
