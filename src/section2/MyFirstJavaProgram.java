package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot Alex = new Robot();		
Alex.penDown();
Alex.setSpeed(100);	
for(int i=0;i<4;i++) {
Alex.move(275);	
Alex.turn(91);
}}}
