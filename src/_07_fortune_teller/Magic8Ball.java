package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int num = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(num);
	// 4. Get the user to enter a question for the 8 ball
		String ques = JOptionPane.showInputDialog("Enter a question for the all mighty Magic 8 Ball");
		if (num == 0){
			JOptionPane.showMessageDialog(null, "Yes");
		}
		
	// -- tell the user "Yes"

	if (num == 1) {
		JOptionPane.showMessageDialog(null, "No");
	}
		
	// -- tell the user "No"

	if (num == 2) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}

	// -- tell the user "Maybe you should ask Google?"

	if (num == 3) {
		JOptionPane.showMessageDialog(null, "Error: can not compute");
	}

	// -- write your own answer
	}

}
