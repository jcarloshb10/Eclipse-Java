package cw00_calssrelationships;

import javax.swing.JFrame;

public class WithAssociationWindow {
	
	private JFrame fm_main;
	
	public WithAssociationWindow() {
		fm_main=new JFrame("Creating a window by means of Association");
		fm_main.setSize(500,300);
		fm_main.setVisible(true);
	}
	
	public static void main(String[] args) {
		new WithAssociationWindow();
		
	}
}
