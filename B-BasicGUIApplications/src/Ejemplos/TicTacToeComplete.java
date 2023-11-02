package Ejemplos;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToeComplete extends JFrame {

	private JButton[] bt_selection;
	private int cont = 1;

	public TicTacToeComplete() {
		setTitle("Three in a row");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setupWidgets();
		setupEvents();
		setVisible(true);
	}

	private void setupWidgets() {
		// TODO Auto-generated method stub
		bt_selection = new JButton[9];
		for (int i = 0; i < 9; i++) {
			bt_selection[i] = new JButton();
			bt_selection[i].setFont(new Font("Dialog", Font.BOLD, 40));

		}
		setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 9; i++) {
			add(bt_selection[i]);
		}
	}

	private void setupEvents() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		for (int i = 0; i < 9; i++) {

			bt_selection[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton bt_action = (JButton) e.getSource();
					if (cont == 1) {
						bt_action.setText("X");
						cont = 0;
					} else if (cont == 0) {
						bt_action.setText("O");
						cont = 1;
					}
					bt_action.setEnabled(false);

					boolean flag = true;

					if (bt_selection[0].getText() == "X" && bt_selection[1].getText() == "X"
							&& bt_selection[2].getText() == "X"
							|| bt_selection[0].getText() == "X" && bt_selection[4].getText() == "X"
									&& bt_selection[8].getText() == "X"
							|| bt_selection[2].getText() == "X" && bt_selection[4].getText() == "X"
									&& bt_selection[6].getText() == "X"
							|| bt_selection[3].getText() == "X" && bt_selection[4].getText() == "X"
									&& bt_selection[5].getText() == "X"
							|| bt_selection[6].getText() == "X" && bt_selection[7].getText() == "X"
									&& bt_selection[8].getText() == "X"
							|| bt_selection[0].getText() == "X" && bt_selection[3].getText() == "X"
									&& bt_selection[6].getText() == "X"
							|| bt_selection[1].getText() == "X" && bt_selection[4].getText() == "X"
									&& bt_selection[7].getText() == "X"
							|| bt_selection[2].getText() == "X" && bt_selection[5].getText() == "X"
									&& bt_selection[8].getText() == "X") {
						JOptionPane.showMessageDialog(null, "The X's wins");
						dispose();
						;
					} else if (bt_selection[0].getText() == "O" && bt_selection[1].getText() == "O"
							&& bt_selection[2].getText() == "O"
							|| bt_selection[0].getText() == "O" && bt_selection[4].getText() == "O"
									&& bt_selection[8].getText() == "O"
							|| bt_selection[2].getText() == "O" && bt_selection[4].getText() == "O"
									&& bt_selection[6].getText() == "O"
							|| bt_selection[3].getText() == "O" && bt_selection[4].getText() == "O"
									&& bt_selection[5].getText() == "O"
							|| bt_selection[6].getText() == "O" && bt_selection[7].getText() == "O"
									&& bt_selection[8].getText() == "O"
							|| bt_selection[0].getText() == "O" && bt_selection[3].getText() == "O"
									&& bt_selection[6].getText() == "O"
							|| bt_selection[1].getText() == "O" && bt_selection[4].getText() == "O"
									&& bt_selection[7].getText() == "O"
							|| bt_selection[2].getText() == "O" && bt_selection[5].getText() == "O"
									&& bt_selection[8].getText() == "O") {

						JOptionPane.showMessageDialog(null, "The O's wins");
						dispose();
						;

					} else {
						int k = 0;
						for (int j = 0; j < bt_selection.length; j++) {
							if (!bt_selection[j].isEnabled()) {
								k++;
							}
						}
						if (k == 9) {
							JOptionPane.showMessageDialog(null, "Dead heat");
							System.exit(0);
						}
					}

				}
			});

		}
	}

	public static void main(String[] args) {
		new TicTacToeComplete();
	}

}
