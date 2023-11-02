package classwork;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SightWindow extends JFrame {
	private JButton bt_left , bt_right,	 bt_up , bt_down; 
	private JLabel 	lb_sight;
	
	
	public SightWindow() {
		setTitle("Gun Sight");
		setSize(400,450) ; 
		setupWidgets(); 
		setVisible(true);
	}
	
	private void setupWidgets() {
		bt_left		= new JButton() ;
		bt_right	= new JButton() ;
		bt_up		= new JButton() ;
		bt_down		= new JButton() ;
		lb_sight	= new JLabel("x" , JLabel.CENTER);
		
		setLayout(null);
		
		add(bt_left); 	bt_left.setBounds(20,160,80,80); //(x,y,ancho,alto)
		add(bt_right); 	bt_right.setBounds(300,160,80,80);
		add(bt_up); 	bt_up.setBounds(160,20,80,80);
		add(bt_down); 	bt_down.setBounds(160,300,80,80);
		
		add(lb_sight);	lb_sight.setBounds(160,160,80,80);
		
		bt_up.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/ArrowUp.png")));
		bt_down.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/ArrowDown.png")));
		bt_right.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/ArrowRight.png")));
		bt_left.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/ArrowLeft.png")));
		lb_sight.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/GunSight.png")));
	}
	
}
