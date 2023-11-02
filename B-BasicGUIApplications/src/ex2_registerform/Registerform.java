package ex2_registerform;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registerform extends JFrame{
	
	private JLabel lb_info1,lb_info2,lb_info3,lb_info4,lb_info5;
	private JTextField tf_id,tf_name,tf_address,tf_phone;
	private JComboBox cb_genre;
	private JButton bt_cancel,bt_accept;
	
	public Registerform() {
		setTitle("Register Form");
		setSize(200, 200);
		setupWidgets();
		setVisible(true);
	}
	
	
	private void setupWidgets() {
		lb_info1 	 = new JLabel("Identification");
		lb_info2 	 = new JLabel("Name");
		lb_info3 	 = new JLabel("Genre");
		lb_info4 	 = new JLabel("Address");
		lb_info5     = new JLabel("Phone");
		tf_id		 = new JTextField();
		tf_name	 	 = new JTextField();
		tf_address	 = new JTextField();
		tf_phone	 = new JTextField();
		cb_genre	 = new JComboBox();
		bt_cancel	 = new JButton("Cancel");
		bt_accept	 = new JButton("Accept");
		
		setLayout(new GridLayout(6, 2));
		
		add(lb_info1); add(tf_id);
		add(lb_info2); add(tf_name);
		add(lb_info3); add(cb_genre);
		add(lb_info4); add(tf_address);
		add(lb_info5); add(tf_phone);
		add(bt_cancel);add(bt_accept);
		
		cb_genre.addItem("Male");
		cb_genre.addItem("Female");
	}

}
