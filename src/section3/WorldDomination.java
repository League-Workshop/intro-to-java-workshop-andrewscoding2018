package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String code = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(code.equals ("Yes"))
{
	JOptionPane.showMessageDialog(null, "You will rule the world");
} else
{
	JOptionPane.showMessageDialog(null, "Have fun working in Olive Garden");
}
}
}
	// 3. Otherwise, wish them good luck washing dishes.


