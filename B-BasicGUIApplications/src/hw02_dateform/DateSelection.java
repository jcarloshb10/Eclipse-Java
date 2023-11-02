package hw02_dateform;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DateSelection extends JFrame {
	
	private JLabel 		lb_year,lb_month,lb_day;
	private JComboBox 	cb_year,cb_month,cb_day;
	
	public DateSelection() {
		setTitle("Date Selection");
		setSize(400,100);
		setupWidgets();
		setVisible(true);
	}
	
	private void setupWidgets() {
		lb_year		=	new JLabel("Year");
		lb_month	=	new JLabel("Month");
		lb_day		=	new JLabel("Day");
		cb_year		= 	new JComboBox();
		cb_month	= 	new JComboBox();
		cb_day		= 	new JComboBox();
		
		setLayout(new GridLayout(2, 3));
		
		add(lb_year);
		add(lb_month);
		add(lb_day);
		add(cb_year);
		add(cb_month);
		add(cb_day);
		
		for(int year=1970;year<=2019;year++) {
			cb_year.addItem(year);
		}
		for(int day=1;day<=31;day++) {
			cb_day.addItem(day);
		}
		cb_month.addItem("January");
		cb_month.addItem("Frebrary");
		cb_month.addItem("March");
		cb_month.addItem("April");
		cb_month.addItem("May");
		cb_month.addItem("June");
		cb_month.addItem("July");
		cb_month.addItem("August");
		cb_month.addItem("September");
		cb_month.addItem("October");
		cb_month.addItem("Novembre");
		cb_month.addItem("December");
	}
	
	public static void main(String[] args) {
		new DateSelection();
	}

}
