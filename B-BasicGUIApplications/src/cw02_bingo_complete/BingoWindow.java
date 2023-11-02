package cw02_bingo_complete;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BingoWindow extends JFrame {
	
	private JLabel lb_headers[];
	private JLabel lb_numbers[][];
	
	public BingoWindow() {
		setTitle("Bingo table");
		setSize(400,400);
		setupWidgets();
		setVisible(true);
	}

	private void setupWidgets() {
		
		lb_headers	=	new JLabel[5];
		lb_numbers	=	new JLabel[5][5];
		
		lb_headers[0]= new JLabel("B");
		lb_headers[1]= new JLabel("I");
		lb_headers[2]= new JLabel("N");
		lb_headers[3]= new JLabel("G");
		lb_headers[4]= new JLabel("O");
		
		setLayout(new GridLayout(6,5));
		
		for(int i =0;i<5;i++) {
			
			add(lb_headers[i]);
		}
		Random random = new Random();
		for(int row=0;row<5;row++) {
			for(int col=0;col<5;col++) {
				int number = random.nextInt(20)+(col*20);
				lb_numbers[row][col]= new JLabel(""+number);
				add(lb_numbers[row][col]);
			}
		}
	}
	
	public static void main(String [] args) {
		new BingoWindow();
		
	}

}
