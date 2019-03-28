package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below.
	public static void main(String[] args) {
		
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int random = new Random().nextInt(8);
	// 3. Print out this variable
	System.out.println(random);

	// 4. Get the user to enter something that they think is awesome
	String Awesome = JOptionPane.showInputDialog(null,  "Type in 0,1,2, or 3, and choose one of them out of which one of them you think is awesome");

	// 5. If the random number is 0
	if (random==0) {
	// -- tell the user whatever they entered is awesome!
	JOptionPane.showMessageDialog(null, Awesome+" is awesome "); 
	}
	// 6. If the random number is 1
	if (random==1) {
	// -- tell the user whatever they entered is ok.
		JOptionPane.showMessageDialog(null, Awesome+" is Ok "); 
	}
	// 7. If the random number is 2
		if (random==2) {
			JOptionPane.showMessageDialog(null, Awesome+" is BORING ");	
	// -- tell the user whatever they entered is boring.
		JOptionPane.showMessageDialog(null, Awesome+" is BORING ");
	}
	// 8. If the random number is 3
			if (random==3) {
				
			
	// -- write your own answer
				JOptionPane.showMessageDialog(null, Awesome+" is STOOPID ");
			}
	

}
}

