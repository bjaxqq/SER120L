/**
 * Brooks Jackson
 * Lab 1
 * @date 1/23/2023
 * @author bjaxqq
 * This is a helloWorld Example
 */

import javax.swing.JOptionPane;

public class HelloWorldDialog2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, "Hello " + name + "!!!");

	}

}
