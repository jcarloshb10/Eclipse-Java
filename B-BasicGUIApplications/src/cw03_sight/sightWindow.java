package cw03_sight;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class sightWindow extends JFrame {
//-------------------------------------------------
	private JButton bt_left,bt_right, bt_up, bt_down;
	private JLabel lb_sight;
	//------------------------------------------------
	public sightWindow() {
	setTitle("GUN SIGHT");
	setSize(400, 450);
	setupwidget();
	setVisible(true);
	
	}
	//-------------------------------------------------------------
	private void setupwidget() {
		bt_left    =new JButton();
	    bt_right   =new JButton();
	    bt_up 	   =new JButton();
	    bt_down    =new JButton();
	    lb_sight   =new JLabel("x",JLabel.CENTER);
	    setLayout(null);
	    add(bt_left);    bt_left.setBounds(20, 160, 80, 80);
	    add(bt_right);   bt_right.setBounds(300, 160, 80, 80);
	    add(bt_up);      bt_up.setBounds(160, 20, 80, 80);
	    add(bt_down);    bt_down.setBounds(160,310, 80, 80);	    
	    add(lb_sight);   lb_sight.setBounds(160, 160, 80, 80);
	    
	    bt_up.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/arrow_up.png")));
	    bt_left.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/arrow_left.png")));
	    bt_right.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/arrow_right.png")));
	    bt_down.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/arrow_down.png")));
	    lb_sight.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/sight.png")));
				
	}
	public static void main(String[] args) {
		new sightWindow();
	}
}
