package ex05_calculator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorForm extends JFrame {
	private JLabel lb_display;
	private JButton bt_numbers[], bt_operators[], bt_clear;

	public CalculatorForm() {
		setTitle("Calculator");
		setSize(200, 280);
		setupWidgets();
		setupEvents();
		setVisible(true);

	}

	private void setupWidgets() {
		// TODO Auto-generated method stub
		JPanel pn_center = new JPanel(new GridLayout(4, 3));
		JPanel pn_east = new JPanel(new GridLayout(6, 1));

		lb_display = new JLabel("0", JLabel.RIGHT);

		bt_numbers = new JButton[10];
		for (int i = 0; i < 10; i++) {
			bt_numbers[i] = new JButton("" + i);
		}

		bt_operators = new JButton[5];
		String operators[] = { "=", "+", "-", "x", "/" };
		for (int i = 0; i < 5; i++) {
			bt_operators[i] = new JButton(operators[i]);
		}

		bt_clear = new JButton("C");

		add(lb_display, BorderLayout.NORTH);
		add(pn_center, BorderLayout.CENTER);
		add(pn_east, BorderLayout.EAST);

		pn_center.add(bt_numbers[7]);
		pn_center.add(bt_numbers[8]);
		pn_center.add(bt_numbers[9]);
		pn_center.add(bt_numbers[4]);
		pn_center.add(bt_numbers[5]);
		pn_center.add(bt_numbers[6]);
		pn_center.add(bt_numbers[1]);
		pn_center.add(bt_numbers[2]);
		pn_center.add(bt_numbers[3]);
		pn_center.add(bt_numbers[0]);
		pn_center.add(new JLabel());
		pn_center.add(new JLabel());
		
		pn_east.add(bt_clear);
		pn_east.add(bt_operators[1]);
		pn_east.add(bt_operators[2]);
		pn_east.add(bt_operators[3]);
		pn_east.add(bt_operators[4]);
		pn_east.add(bt_operators[0]);
		
		lb_display.setFont(new Font("Arial",Font.BOLD,20));
		
	}

	private void setupEvents() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CalculatorForm();
	}
}
