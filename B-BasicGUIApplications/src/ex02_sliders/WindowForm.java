package ex02_sliders;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class WindowForm extends JFrame{
	
	private JButton button;
	private JSlider slider_vertical_west;
	private JSlider slider_vertical_east;
	private JSlider slider_horizontal_south;
	private JSlider slider_horizontal_north;
	
	public WindowForm() {
		
		setSize(500,300);
		setupWidgets();
		setVisible(true);
	}
	
	private void setupWidgets() {
		button=new JButton();
		slider_vertical_east 	= new JSlider(JSlider.VERTICAL);
		slider_vertical_west 	= new JSlider(JSlider.VERTICAL);
		slider_horizontal_south = new JSlider();
		slider_horizontal_north = new JSlider();
		
		setLayout(new BorderLayout());
		
		add(button					, 	BorderLayout.CENTER);
		add(slider_horizontal_south	, 	BorderLayout.SOUTH);
		add(slider_horizontal_north	, 	BorderLayout.NORTH);
		add(slider_vertical_east	, 	BorderLayout.EAST);
		add(slider_vertical_west	, 	BorderLayout.WEST);
	}
	

}
