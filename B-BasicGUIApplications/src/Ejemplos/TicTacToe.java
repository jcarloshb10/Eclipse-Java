package Ejemplos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe extends JFrame {
	private JButton[] bt_selection;
	private int cont=1;
	
	
	public TicTacToe() {
		setTitle("Three in a row");
		setSize(400,400);
		setLocationRelativeTo(null);
		setupWidgets();
		setupEvents();
		setVisible(true);
	}
	
	private void setupEvents() {
		// TODO Auto-generated metxhod stub
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		for(int i=0;i<9;i++) {
			
			bt_selection[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton bt_action = (JButton)e.getSource();
					if(cont==1) {
						bt_action.setText("X");
						cont=0;
						bt_action.setEnabled(false);
					}else if (cont==0){
						bt_action.setText("O");
						cont=1;
						bt_action.setEnabled(false);
					}
				}});
			
	}}

	private void setupWidgets() {
		// TODO Auto-generated method stub
		bt_selection = new JButton[9];
		for(int i=0;i<9;i++) {
			bt_selection[i]=new JButton();
				
		}
		setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++) {
			add(bt_selection[i]);
		}
	}
	public static void main(String[] args) {
		new TicTacToe();
	}

}

