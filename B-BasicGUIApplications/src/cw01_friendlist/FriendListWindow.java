package cw01_friendlist;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FriendListWindow extends JFrame{
	
	private  JTextField 	tf_name;
	private  JList      	ls_friends;
	private  JButton     	bt_remove; 
		
	public  FriendListWindow() {
		
		setSize(400,400);
		setTitle("Friend List");
		setupWidgets();
		setVisible(true);
	}

	private void setupWidgets() {
		// TODO Auto-generated method stub
		tf_name		=	new JTextField();
		ls_friends	=	new JList();
		bt_remove 	= 	new JButton("Remove");
		
		//This frame use BorderLayout by default
		
		add(tf_name, BorderLayout.NORTH);
		add(ls_friends, BorderLayout.CENTER);
		add(bt_remove, BorderLayout.SOUTH);
		
	}
	public static void main(String [] args) {
		new FriendListWindow();
	}
	
	
}
