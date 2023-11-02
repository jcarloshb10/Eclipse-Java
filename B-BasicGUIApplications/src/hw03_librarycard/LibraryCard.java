package hw03_librarycard;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LibraryCard extends JFrame{
	
	private JLabel 		lb_code,lb_title,lb_author,lb_pages,lb_editorial;
	private JTextField 	tf_code,tf_title,tf_author,tf_pages,tf_editorial;
	private JButton 	bt_create;
	
	public LibraryCard() {
		setTitle("Library Book Card");
		setSize(420, 220);
		setupWidgets();
		setVisible(true);
	}

	private void setupWidgets() {
		lb_code			=	new JLabel("Code");
		lb_title		=	new JLabel("Title");
		lb_author		=	new JLabel("Author");
		lb_pages		=	new JLabel("Pages");
		lb_editorial	=	new JLabel("Editorial");
		tf_code			=	new JTextField();
		tf_title		=	new JTextField();
		tf_author		=	new JTextField();
		tf_pages		=	new JTextField();
		tf_editorial	=	new JTextField();
		bt_create		= 	new JButton("Create Card");
		
		setLayout(null);
		
		add(lb_code);		lb_code.setBounds(20, 20, 40, 20);	
		add(lb_title);		lb_title.setBounds(150,20,40,20);
		add(lb_author);		lb_author.setBounds(20,60,50,20);
		add(lb_pages);		lb_pages.setBounds(280, 60, 40, 20);
		add(lb_editorial);	lb_editorial.setBounds(20,100,60,20);
		add(tf_code);		tf_code.setBounds(60,20,80,20);
		add(tf_title);		tf_title.setBounds(190,20,200,20);
		add(tf_author);		tf_author.setBounds(70,60,200,20);
		add(tf_pages);		tf_pages.setBounds(320,60,70,20);
		add(tf_editorial);	tf_editorial.setBounds(80,100,310,20);
		add(bt_create);		bt_create.setBounds(20,140,370,20);
	}
	public static void main(String[] args) {
		new LibraryCard();
	}

}
