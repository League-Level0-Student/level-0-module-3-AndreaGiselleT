package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
	public static void main(String[] args) {
		String Happy = JOptionPane.showInputDialog("Are You Happy");
	if(Happy.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	if(Happy.equals("no")) {
		Happy=JOptionPane.showInputDialog("Do you want to be happy?");
		if(Happy.equals("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");}
		if(Happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something");}
	} } }