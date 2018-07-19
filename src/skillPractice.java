import java.util.Random;

import javax.swing.JOptionPane;

public class skillPractice {
	public static void main(String[] args) {
		
		skillPractice skills = new skillPractice();
      		skills.skill1();
      		//skills.skill2();
      		skills.skill3();
      		skills.skill4();
      		skills.skill5();
	}
void skill1() {
	// Use pop-ups for the following.
	// Ask the user how many dimes they have
	String dime = JOptionPane.showInputDialog("How many dimes you got?");
	int d = Integer.parseInt(dime);
	// Tell them how many cents they have (hint multiply by 10)
	JOptionPane.showMessageDialog(null, "You have " + (d*10) + " cents.");
	// Ask the user how tall they are (inches)
	String tall = JOptionPane.showInputDialog("How tall are you?");
	int t = Integer.parseInt(tall);
	// If they are shorter than 36 inches, tell them to eat their Wheaties
	if(t<36) {
		JOptionPane.showMessageDialog(null, "Eat your Wheaties!!!!111!!!!11!1!");
		}else {
		JOptionPane.showMessageDialog(null, "Congrats. You are a big boy (or girl, I'm not excluding)");
		}
	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
		int o = 0;
		for(int i = 2;i<30;i++) {
			if((o % 3) == 0) {
				System.out.println(i);
			}
			o++;
		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console 
		Random num = new Random();
		int n = num.nextInt(20);
		System.out.println(n);
	// Get another random number that is less than 10 and print it to the console 
		Random num2 = new Random();
		int n2 = num2.nextInt(10);
		System.out.println(n2);
	// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
		JOptionPane.showMessageDialog(null, "The difference between " + n + " and " + n2 + " is " + (n-n2));
	}

	void skill4() { // In a pop-up, ask the user for the city they live in 
		String sd = JOptionPane.showInputDialog("What city do you live in?");
		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if(sd.equalsIgnoreCase("San Diego")) {
			// If they answered "San Diego", tell them they live in America's Finest City 
			JOptionPane.showMessageDialog(null, "You live in America's Finest City! Very cool!");
			}else {
			// Otherwise, tell them to move to San Diego 
			JOptionPane.showMessageDialog(null, "You should move to San Diego.");
			}
	// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
		String cars = JOptionPane.showInputDialog("How many cars do you have? (In number form)");
		int c = Integer.parseInt(cars);
		if(c == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
			}else if (c == 1 ){
			// If there is 1 car, use a pop-up to display the make/model of the car 
			JOptionPane.showInputDialog(null, "What model is it? Toyota? Subaru?");
			JOptionPane.showMessageDialog(null, "Ah, good choice.");
			}else {
				// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
				JOptionPane.showMessageDialog(null, "If I am correct, you should have " + (c*4) + " wheels total (not including spares).");
			}

	}

	void skill5() { // In a pop-up, ask the user for the name of their school 
		String school = JOptionPane.showInputDialog("Where do you go to school? Just curious.");
	// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
		JOptionPane.showMessageDialog(null, school + "? I've heard great things about " + school + "! Truly fantastic!");


	}
	}
