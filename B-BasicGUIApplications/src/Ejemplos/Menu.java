package Ejemplos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame {

	private JLabel bt_tictactoecomplete, bt_tictactoe;
	private JCheckBox[] cb_window;
	private JFrame[] jf_frames;

	public Menu() {
		setTitle("Menú");
		setSize(300, 100);
		setLocationRelativeTo(null);
		setupWidgets();
		setupEvents();
		setVisible(true);
	}

	private void setupWidgets() {
		// TODO Auto-generated method stub
		bt_tictactoecomplete = new JLabel("Tic Tac Toe (Complete)");
		bt_tictactoe = new JLabel("Tic Tac Toe");
		cb_window = new JCheckBox[2];
		jf_frames = new JFrame[2];

		JPanel pn_center = new JPanel(new GridLayout(2, 1));
		JPanel pn_west = new JPanel(new GridLayout(2, 1));

		for (int i = 0; i < 2; i++) {
			cb_window[i] = new JCheckBox();
			pn_west.add(cb_window[i]);
		}
		pn_center.add(bt_tictactoecomplete);
		pn_center.add(bt_tictactoe);

		add(pn_center, BorderLayout.CENTER);
		add(pn_west, BorderLayout.WEST);
	}

	private void setupEvents() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for(int i=0;i<2;i++) {
			int j=i;
			cb_window[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JCheckBox c= (JCheckBox)e.getSource();
					if(c == cb_window[j]) {
						if(cb_window[j].isSelected()) {
							switch (j) {
							case 0:
								jf_frames[0]=new TicTacToeComplete();
								break;
							case 1:
								jf_frames[1]=new TicTacToe();
								break;
							default:
								break;
							}
							jf_frames[j].addWindowListener(new WindowAdapter() {
								
								@Override
								public void windowClosed(WindowEvent arg0) {
									// TODO Auto-generated method stub
									cb_window[j].setSelected(false);
								}
								
							});
						}else {
							jf_frames[j].setVisible(false);
						}
					}
				}
			});
		}
	}

	public static void main(String[] args) {
		new Menu();
	}
}
