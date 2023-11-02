package ex01_notes;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;


public class NoteForm extends JFrame {
	
	private JLabel 			lb_info;
	private JTextArea 		ta_note;
	private JButton 		bt_analize;
	private JProgressBar 	pb_effort;
	
	
	public NoteForm() {
		setTitle("Note");
		setSize(500,300);
		setupWidgets();
		setVisible(true);
	}
	
	private void setupWidgets() {
		lb_info 	= 	new JLabel("Write your note inside the text box");
		ta_note		=	new JTextArea();
		bt_analize	= 	new JButton("Analize text");
		pb_effort	=	new JProgressBar(JProgressBar.VERTICAL);
		
		setLayout(new BorderLayout());
		add(lb_info, BorderLayout.NORTH);
		add(ta_note, BorderLayout.CENTER);
		add(bt_analize, BorderLayout.SOUTH);
		add(pb_effort, BorderLayout.EAST);
		
	}

}
