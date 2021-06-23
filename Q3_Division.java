package javab.Java_basic;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Q3_Division {
	String msg;
	TextField num1, num2, res;
	Label l1, l2, l3;
	Button div;

	public void init() {
		l1 = new Label("Dividend");
		l2 = new Label("Divisor");
		l3 = new Label("Result");
		num1 = new TextField(10);
		num2 = new TextField(10);
		res = new TextField(10);
		div = new Button("Click");
		div.addActionListener((ActionListener) this);
		add(l1);
		add(num1);
		add(l2);
		add(num2);
		add(l3);
		add(res);
		add(div);
	}

	private void add(Label l12) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent ae) {
		String arg = ae.getActionCommand();
		int num1 = 0, num2 = 0;
		if (arg.equals("Click")) {
			if (this.num1.getText().isEmpty() && this.num2.getText().isEmpty()) {
				msg = "Enter the valid numbers!";
				repaint();
			} else {
				try {
					num1 = Integer.parseInt(this.num1.getText());
					num2 = Integer.parseInt(this.num2.getText());

					int num3 = num1 / num2;

					res.setText(String.valueOf(num3));
					msg = "Operation Succesfull!!!";
					repaint();
				} catch (NumberFormatException ex) {
					System.out.println(ex);
					res.setText("");
					msg = "NumberFormatException - Non-numeric";
					repaint();
				} catch (ArithmeticException e) {
					System.out.println("Can't be divided by Zero" + e);
					res.setText("");
					msg = "Can't be divided by Zero";
					repaint();
				}
			}
		}
	}

	public void paint(Graphics g) {
		g.drawString(msg, 30, 70);
	}
}
