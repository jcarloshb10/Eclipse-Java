package ex05_calculator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorFormComplete extends JFrame {
	private JLabel lb_display;
	private JButton bt_numbers[], bt_operators[], bt_clear;
	private boolean restarNumber = true;
	double total = 0;
	private int operation = 1; // 0 =, 1+, 2-.3*,4/;

	public CalculatorFormComplete() {
		setTitle("Calculator");
		setSize(250, 300);
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
			bt_numbers[i].setFont(new Font("Arial", Font.BOLD, 30));
		}

		bt_operators = new JButton[5];
		String operators[] = { "=", "+", "-", "x", "/" };
		for (int i = 0; i < 5; i++) {
			bt_operators[i] = new JButton(operators[i]);
			bt_operators[i].setFont(new Font("Arial", Font.BOLD, 30));
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

		lb_display.setFont(new Font("Arial", Font.BOLD, 20));
		bt_clear.setFont(new Font("Arial", Font.BOLD, 30));
	}

	private void setupEvents() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for (int i = 0; i < 10; i++) {
			bt_numbers[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton bt_selected = (JButton) e.getSource();
					if (restarNumber) {
						lb_display.setText(bt_selected.getText());
						restarNumber = false;
					} else {
						lb_display.setText(lb_display.getText() + bt_selected.getText());
					}
				}
			});

		}
		for (int i = 0; i < 5; i++) {
			bt_operators[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					restarNumber = true;
					JButton bt_selected = (JButton) arg0.getSource();
					long valor = Long.parseLong(lb_display.getText());

					switch (operation) {
					case 1:
						total = total + valor;
						break;
					case 2:
						total = total - valor;
						break;
					case 3:
						total = total * valor;
						break;
					case 4:
						total = total / valor;
						break;
					}
					lb_display.setText("" + total);
					switch (bt_selected.getText()) {
					case "+":
						operation = 1;
						break;
					case "-":
						operation = 2;
						break;
					case "*":
						operation = 3;
						break;
					case "/":
						operation = 4;
						break;
					case "=":
						operation = 1;
						total = 0;
						break;
					default:
						break;
					}
				}
			});
		}
		bt_clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				total = 0;
				restarNumber = true;
				operation = 1;
				lb_display.setText("0");
			}
		});
	}

	public static void main(String[] args) {
		new CalculatorFormComplete();
	}
}
