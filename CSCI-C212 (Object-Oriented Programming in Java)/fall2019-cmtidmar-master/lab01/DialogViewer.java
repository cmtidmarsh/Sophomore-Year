package lab01;

import javax.swing.JOptionPane;

public class DialogViewer {

	public static void main(String[] args) {
		// E1.15
		JOptionPane.showMessageDialog(null, "Hello, Clare!"); 
		
		// E1.16
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.print("Hello, " + name);
		System.out.print("\n");
		
		// E1.17
		String Name = JOptionPane.showInputDialog("What is your name?");
		String machine = JOptionPane.showInputDialog(null, "My name is Hal! What would you like me to do?");
		System.out.print("I'm sorry, " + Name + "." + " I'm afraid I can't do that.");
	}

}
