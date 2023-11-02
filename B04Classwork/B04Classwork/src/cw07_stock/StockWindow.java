package cw07_stock;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StockWindow extends JFrame {
	//--------------------------------------
	private JTextField					tf_article ; 		
	private JList<String> 				ls_healthles , ls_damages ; 
	private DefaultListModel<String> 	lm_healthles , lm_damages ; 
	//--------------------------------------
	public StockWindow() {
		setTitle("Stock Management") ; 
		setSize(400 , 400);
		setupWidgets ();
		setupEvents ();
		setVisible(true);
	}
	
	private void setupWidgets() {
		tf_article 		= new JTextField();
		lm_damages		= new DefaultListModel<String>();
		lm_healthles	= new DefaultListModel<String>();
		ls_damages 		= new JList(lm_damages); 
		ls_healthles 	= new JList(lm_healthles);
		
		JPanel pn_center = new JPanel(new GridLayout(1,2)); // (FILA , COLUMNA)
		
		add(tf_article , BorderLayout.NORTH);
		add(pn_center , BorderLayout.CENTER);
		
		pn_center.add(ls_healthles) ; 
		pn_center.add(ls_damages);
	}
	
	private void setupEvents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//-----------------------------
		tf_article.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lm_healthles.addElement(tf_article.getText() );
				tf_article.setText("");
			}
		});
		//------------------------
		ls_healthles.addMouseListener(new MouseListener() {
			
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
				if(ev.getClickCount() == 2 && ls_healthles.getSelectedIndex()>=0) {
					lm_damages.addElement(ls_healthles.getSelectedValue());
					lm_healthles.remove(ls_healthles.getSelectedIndex());
				}
				
			}
		});
		//-------------------------------------
		
	}
	
	public static void main(String []args) {
		
		new StockWindow() ; 
	}
}

