//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

public static void main(String[] args) {

	// 1. correct the birthdays for your family below
	String mom = "Agust 28th";
	String dad = "April 22nd";
	String andrea = "April 29th";
	String brother = "July 7th";
	// 2. Find out which birthday the user wants and and store their response in a variable
	String Birthday = JOptionPane.showInputDialog("Whose birthday do you want, 'mom', 'dad', 'andrea', 'brother'");
	// 3. Print out what the user typed
	if (Birthday .equals("mom")) {
		JOptionPane.showMessageDialog(null, mom);
	}
	if (Birthday .equals("dad")) {
		JOptionPane.showMessageDialog(null, dad);
	}
	if (Birthday .equals("andrea")) {
		JOptionPane.showMessageDialog(null, andrea);
	}if (Birthday .equals("brother")) {
		JOptionPane.showMessageDialog(null, brother);
	}
	// 4. if user asked for "mom"
		//print mom's birthday
	// 5. if user asked for "dad"
		// print dad's birthday
	// 6. if user asked for your name
		// print myBirthday
	//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else {
		JOptionPane.showMessageDialog(null, "Sorry I don't remember that person's birthday!");

	}
} 
}