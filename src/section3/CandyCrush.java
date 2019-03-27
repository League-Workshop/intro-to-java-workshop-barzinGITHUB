package section3;

import java.awt.Component;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String name = JOptionPane.showInputDialog(null,  "Who do you not like?");

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null,  "Well, on my instagram account, I have 50 million followers and all of them are poeple that know you or you know them. I just exposed you by saying you are in love with " + name);
		// 3. Ask the user for the name of their best friend
		String Jacob = JOptionPane.showInputDialog("What is the name of your best friend?");

		// 4. Tell them their best friend is as sweet as candy
				JOptionPane.showMessageDialog(null, "You are in LOOOOOVVVVEEEE with " + Jacob);

	} 
}



