package ex01_notes_complete;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class NoteForm extends JFrame {

	private JLabel lb_info;
	private JTextArea ta_note;
	private JButton bt_analize;
	private JProgressBar pb_effort;

	public NoteForm() {
		setTitle("Note");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setupWidgets();
		setupEvents();
		setVisible(true);
	}

	private void setupWidgets() {
		lb_info = new JLabel("Write your note inside the text box");
		ta_note = new JTextArea();
		bt_analize = new JButton("Analize text");
		pb_effort = new JProgressBar(JProgressBar.VERTICAL);

		setLayout(new BorderLayout());
		add(lb_info, BorderLayout.NORTH);
		add(ta_note, BorderLayout.CENTER);
		add(bt_analize, BorderLayout.SOUTH);
		add(pb_effort, BorderLayout.EAST);

	}

	public void setupEvents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		bt_analize.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = ta_note.getText();
				int uppercase = 0;
				int lowercase = 0;
				int digits = 0;

				for (int i = 0; i < text.length(); i++) {
					char symbol = text.charAt(i);

					if (symbol >= 65 && symbol <= 90) {
						uppercase++;
					} else if (symbol >= 97 && symbol <= 122) {
						lowercase++;
					} else if (symbol >= 48 && symbol <= 57) {
						digits++;
					}
				}
				String message = "Upper cases: " + uppercase + "\nLower cases: " + lowercase + "\nDigits: " + digits;
				pb_effort.setValue(uppercase+lowercase+digits);
				JOptionPane.showMessageDialog(null, "Analyzing...");
				JOptionPane.showMessageDialog(null, message);

			}
		});
	}

	public static void main(String[] args) {
		new NoteForm();

	}
}
