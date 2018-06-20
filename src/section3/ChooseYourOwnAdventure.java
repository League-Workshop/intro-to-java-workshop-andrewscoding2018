package section3;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		//Object[] O = {"A", "B", "C"};
		//int answer = JOptionPane.showOptionDialog(null, "HI", "HELLO", 0, JOptionPane.INFORMATION_MESSAGE, null, O, null);
		//JOptionPane.showMessageDialog(null, answer);
		
	String begin = JOptionPane.showInputDialog("Today is your big day! You are finally getting married to the woman of your dreams\n" + 
		", and you can hardly wait.You are excited to spend the rest of your life with her.\n" + "However, her parents are not ready for her to spend the rest of her life with you. Her dad thinks that \n"
				 + "You only want to marry her because you truly love her,however, the weekend visits at the mansion didn't hurt either.\n"
						+ "No matter what, this wedding is going to be a magical weekend, even if he is here.\n" + "Are you ready to get married?");
	if(begin.equals("Yes"))
	{
	Object[] beginning = {"Ignore him","Wave, and say hi", "Try to walk out like a total stranger." };
		JOptionPane.showOptionDialog(null, "It's", null, 0, JOptionPane.INFORMATION_MESSAGE, null, beginning, null);
	}
	}
}
