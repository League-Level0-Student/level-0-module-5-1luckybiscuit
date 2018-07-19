import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot owo = new Robot();
		owo.miniaturize();
		owo.penDown();
		//2. Set the speed to 100
		owo.setSpeed(200);
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose your color!", "Waa", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
			owo.setPenColor(255,50,0);
		}else if(colorChoice == 2) {
			owo.setPenColor(0,255,50);
		}else {
			owo.setPenColor(0,50,255);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String poly = JOptionPane.showInputDialog("How many polygons do you want?");
		int polNum = Integer.parseInt(poly);
		//5. Use the robot to draw the number of polygons the user requested.
		for(int i = 0;i<polNum;i++) {
			int ang = 360/polNum;
			for(int o = 0;o<4;o++) {
				int move = 70;
				owo.move(move);
				owo.turn(ang);
				owo.move(move);
				owo.turn(180-ang);
			}
			owo.turn(ang);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

