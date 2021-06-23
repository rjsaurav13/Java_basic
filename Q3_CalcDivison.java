package javab.Java_basic;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Q3_CalcDivison extends JApplet implements ActionListener {

	/*
	 * 
	 * <applet code="DivApplet" width=350 height=300>
	 * 
	 * </applet>
	 * 
	 */

	public void init() {

		try {

			SwingUtilities.invokeAndWait(

					new Runnable() {

						public void run() {

							makeGUI();

						}

					});

		}

		catch (Exception exc) {

			System.out.println("Can't create because of " + exc);

		}

	}

	JTextField number1, number2, result;

	JButton divide;

	private void makeGUI() {

		setLayout(new FlowLayout());

		Label number1p = new Label("Number1: ", Label.RIGHT);

		Label number2p = new Label("Number2: ", Label.RIGHT);

		number1 = new JTextField(20);

		number2 = new JTextField(20);

		result = new JTextField(20);

		divide = new JButton("Divide");

		add(number1p);

		add(number1);

		add(number2p);

		add(number2);

		add(result);

		add(divide);

		divide.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		String snumber1, snumber2;

		snumber1 = number1.getText();

		snumber2 = number2.getText();

		try {

			int number1 = Integer.parseInt(snumber1);

			int number2 = Integer.parseInt(snumber2);

			if (number2 == 0)

				JOptionPane.showMessageDialog(null, "Division by zero not defined.");

			else {

				double r = (double) number1 / number2;

				result.setText(((Double) r).toString());

			}

		}

		catch (NumberFormatException ne)

		{

			JOptionPane.showMessageDialog(null, "Enter a number");

		}

	}

}