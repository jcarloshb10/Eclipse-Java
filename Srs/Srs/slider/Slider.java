package Slider;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame {
	private JSlider sl_1,sl_2;
	
	public Slider() {
		setTitle("Ejercicio meses");
		setSize(300,100);
		setupWidgets();
		setupEvents();
                setLocationRelativeTo(null);
		setVisible(true);
                
	}

	private void setupWidgets() {
		sl_1=new JSlider();
		sl_2=new JSlider();
		
		add(sl_1,BorderLayout.CENTER);
		add(sl_2,BorderLayout.SOUTH);
		
	}

	private void setupEvents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		sl_1.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				sl_2.setValue(sl_2.getMaximum()-sl_1.getValue());
			}
		});
		sl_2.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				sl_1.setValue(sl_1.getMaximum()-sl_2.getValue());
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Slider();
	}

}
