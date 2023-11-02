package simulacrum;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sm01 extends JFrame {
	//--------------------------
	private JPanel		pn_center ; 
	private JComboBox	cb_days ;
	private JButton		bt_mont[] ; 
	//-------------------------
	
	public Sm01() {
		setTitle("Simulacrum");
		setSize(400 , 400) ; 
		setupWidgets();
		setupEvents() ; 
		setVisible(true);
	}
	
	//---------------------------------------
	private void setupEvents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//-------------------------------------
		for(int i=0 ; i<11 ; i++) {
			int j= i ; 
			bt_mont[i].addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent ev) {
					setTitle(bt_mont[j].getText()); 
					if(bt_mont[j].getText()=="February") {
						for(int i=1 ; i<=28 ; i++) {
							cb_days.addItem(i);
						}
						
					}
					else if (bt_mont[j].getText()=="April" || bt_mont[j].getText()=="June" || bt_mont[j].getText()=="September" || bt_mont[j].getText()=="November") {
							for(int i=1 ; i<=30 ; i++) {
								cb_days.addItem(i);
							}
							
						}
					else {
							for(int i=1 ; i<=31 ; i++) {
								cb_days.addItem(i);
							}
							
					}
				}
			});
		}
	}
	
	//----------------------------------------
	private void setupWidgets() {
		pn_center 	= new JPanel(new GridLayout(4,3));
		bt_mont	= new JButton[12]; 
		cb_days		= new JComboBox(); 
		
		add(pn_center , BorderLayout.CENTER);
		add(cb_days , BorderLayout.SOUTH); 
		
		bt_mont[0]	= new JButton("January");
		bt_mont[1]	= new JButton("February");
		bt_mont[2]	= new JButton("March");
		bt_mont[3]	= new JButton("April");
		bt_mont[4]	= new JButton("May");
		bt_mont[5]	= new JButton("June");
		bt_mont[6]	= new JButton("July");
		bt_mont[7]	= new JButton("August");
		bt_mont[8]	= new JButton("September");
		bt_mont[9]	= new JButton("October");
		bt_mont[10]	= new JButton("November");
		bt_mont[11]	= new JButton("December");
		
		for(int i=0 ; i<12 ; i++) {
			pn_center.add(bt_mont[i]);
		}
	}
	
	public static void main (String []args) {
		new Sm01() ; 
	}
}
