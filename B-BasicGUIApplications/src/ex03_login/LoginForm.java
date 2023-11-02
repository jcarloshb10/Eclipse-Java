package ex03_login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame{
	
	private JLabel 			lb_info1,lb_info2;
	private JTextField 		tf_user;
	private JPasswordField 	pf_pass;
	private JButton 		bt_cancel,bt_verify;
	
	public LoginForm() {
		setTitle("User validation");
		setSize(320,150);
		setupWidgets();
		setVisible(true);
		
	}
	
	private void setupWidgets() {
		lb_info1	=	new JLabel("Name");
		lb_info2	= 	new JLabel("Password");
		tf_user		=	new JTextField();
		pf_pass		=	new JPasswordField();
		bt_cancel	=	new JButton("Cancel");
		bt_verify	= 	new JButton("Verify");
		
		setLayout(null);
		
		add(lb_info1);	lb_info1.setBounds(20, 20, 80, 20);
		add(lb_info2);  lb_info2.setBounds(20, 45, 80, 20);
		add(tf_user); 	tf_user.setBounds(120, 20, 180, 20);
		add(pf_pass);	pf_pass.setBounds(120,45,180,20);
		add(bt_cancel); bt_cancel.setBounds(20,80,130,20);
		add(bt_verify); bt_verify.setBounds(170,80,130,20);
	}
}
