package ex05;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class List extends JFrame {
    private JCheckBox[] cb_checks;
    private JTextField[] tf_text;
    private JLabel lb_title;
    private JButton bt_send;
    
    public List() {
    	setTitle("Activities");
    	setSize(500,350);
    	setupWidgets();
    	setupEvents();
    	setVisible(true);
    }

	private void setupWidgets() {
		// TODO Auto-generated method stub
		JPanel pn_center = new JPanel(new GridLayout(10,1));
		JPanel pn_west = new JPanel(new GridLayout(10,1));
		
		lb_title = new JLabel("List your activities and uncheck the irrelevant ones");
		cb_checks = new JCheckBox[10];
		tf_text = new JTextField[10];
		bt_send=new JButton("Send CheckList");
		
		add(lb_title,BorderLayout.NORTH);
		add(pn_center,BorderLayout.CENTER);
		add(pn_west,BorderLayout.WEST);
		add(bt_send,BorderLayout.SOUTH);
		
		for(int i=0;i<10;i++) {
			cb_checks[i]=new JCheckBox("",true);
			tf_text[i]=new JTextField();
			pn_center.add(tf_text[i]);
			pn_west.add(cb_checks[i]);
		}
	}

	private void setupEvents() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new List();
	}
}
