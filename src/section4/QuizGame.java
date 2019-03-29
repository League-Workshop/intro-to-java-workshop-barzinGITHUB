package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		// 2.  Ask the user a question 
		String name = JOptionPane.showInputDialog(null, "How many keys are on a standard keyboard?");
		
		// 3.  Use an if statement to check if their answer is correct
		if (name.equals("101")) {
		// 4.  if the user's answer is correct
		score = score+1;
		// -- add one to their score 
		}
		String game = JOptionPane.showInputDialog(null, "What is the year of the mac I am using right now?");
		if (game.equals("2012")) {
		score = score+1;
		}
		String tane = JOptionPane.showInputDialog(null, "What month was Benjamin Franklin born in?");
		if (tane.equals("January")) {
		score = score+1;
		}
		String zane = JOptionPane.showInputDialog(null, "The more you take, the more you leave behind. What am I?");
		if (zane.equals("Footsteps")) {
		score = score+1;
		}
		String rane = JOptionPane.showInputDialog(null, "Sorta bonus question: What year was Benjamin Franklin born in?");
		if (rane.equals("1706")) {
		score = score+2;
		}
		String fane = JOptionPane.showInputDialog(null, "BONUS Question: 159 times 281 no Caculator or paper do it in your head");
		if (fane.equals("44679")) {
		score = score+3;
		}
		
		JOptionPane.showMessageDialog(null, "Congrats person " + score + " Out of 12 you are good if you got at least 5 points");
		
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
