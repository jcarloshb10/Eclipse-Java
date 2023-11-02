package cw08_LevelsofSatisfaction;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MeterOfLevels extends JFrame {
	//------------------
	private JSlider		sl_levels[];
	private JLabel 		lb_result ; 
	//------------------
	
	public MeterOfLevels() {
		setTitle("Levels of Satisfaction");
		setSize(400 , 200);
		setupWidgets(); 
		setupEvents();
		setVisible(true);
	}
	//----------------------------------------------------------------
	private void setupWidgets() {
		sl_levels			= new JSlider[4];
		lb_result			= new JLabel("1" , JLabel.CENTER);
		JPanel	pn_west		= new JPanel(new GridLayout(4,1));
		JPanel  pn_center	= new JPanel(new GridLayout(4,1));
	
		add(pn_west , BorderLayout.WEST);
		add(pn_center , BorderLayout.CENTER);
		add(lb_result , BorderLayout.SOUTH); 
		
		pn_west.add(new JLabel("Puntuality"));
		pn_west.add(new JLabel("Metodology"));
		pn_west.add(new JLabel("Clarity"));
		pn_west.add(new JLabel("Evaluations"));
		
		for(int i=0 ; i<4 ; i++) {
			sl_levels[i] = new JSlider(0,5,1);
			pn_center.add(sl_levels[i]);
		}
	}
	//---------------------------------------------------------------------
	private void setupEvents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//--------------------------
		for(int i=0 ; i<4 ; i++) {
			sl_levels[i].addChangeListener(new ChangeListener() {
			
				@Override
				public void stateChanged(ChangeEvent arg0) {
					double result =    (sl_levels[0].getValue()+
										sl_levels[1].getValue()+
										sl_levels[2].getValue()+
										sl_levels[3].getValue())/4.0;
					lb_result.setText(""+result);
				}
			});
		}
	}
	//----------------------------------------------------------------------
	public static void main (String[]args) {
		new MeterOfLevels(); 
	}
}
