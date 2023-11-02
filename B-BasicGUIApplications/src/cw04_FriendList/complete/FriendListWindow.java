package cw04_FriendList.complete;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;



public class FriendListWindow  extends JFrame {
//----------------------------------------------------------
	
	private JTextField 						tf_name;
	private DefaultListModel<String>        lm_friends;
	private JList       					ls_friend ;
	private JButton                         bt_remove;
	
	//----------------------------
	public FriendListWindow() {
		
		 setTitle("Friend List");
		 setSize(400,400);
		 setupwigdets();
		 setupevents();
		 setVisible(true);
}
	//---------------------------------------------------------------
	private void setupwigdets() {
		tf_name 			= new JTextField();
		lm_friends 			= new DefaultListModel<String>();
		ls_friend			= new JList(lm_friends);
		bt_remove 			= new JButton("REMOVE");
		//this frame just have BorderLayout
		add(tf_name,BorderLayout.NORTH);
		add(ls_friend,BorderLayout.CENTER);
		add(bt_remove, BorderLayout.SOUTH);		
	//---------------------------------	
	}	
	//-------------------------------------------
	private void setupevents() {
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
							
					 
		}
	
		
		
		});
		//------------------------------------------------------------
		tf_name.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lm_friends.addElement(tf_name.getText());
				tf_name.setText("");
			}
		});
		
		
	}	
	//-----------------------------------------------------------------
		public static void main(String[] args) {
		new FriendListWindow();

			
			 
}
}




