package librarycard;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BookCardForm extends JFrame {

    public BookCardForm() 
    {
        
        setLayout(null);
        
        setTitle(" Library Book Card ");
        
        setResizable(false);
        
        setSize(455, 195);

        initWidgets();
    }

    private void initWidgets() 
    {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JButton bt_create_card  = new JButton(" Create Card ");
        
        JTextField tf_code      = new JTextField("");
        JTextField tf_title     = new JTextField("");
        JTextField tf_author    = new JTextField("");
        JTextField tf_pages     = new JTextField("");
        JTextField tf_editorial = new JTextField("");

        JLabel lb_code          = new JLabel(" Code ");
        JLabel lb_title         = new JLabel(" Title ");
        JLabel lb_author        = new JLabel(" Author ");
        JLabel lb_pages         = new JLabel(" Pages ");
        JLabel lb_editorial     = new JLabel(" Editorial ");


        
        lb_code.setBounds(30, 30, 35, 20); tf_code.setBounds(65, 30, 105, 20); lb_title.setBounds(180, 30, 35, 20); tf_title.setBounds(215, 30, 205, 20);

        lb_author.setBounds(30, 60, 45, 20); tf_author.setBounds(75, 60, 225, 20); lb_pages.setBounds(310, 60, 45, 20); tf_pages.setBounds(355, 60, 65, 20);

        lb_editorial.setBounds(30, 90, 55, 20); tf_editorial.setBounds(85, 90, 335, 20);
        bt_create_card.setBounds(30, 120, 390, 20);
        
        
        add(lb_code); add(tf_code); add(lb_title); add(tf_title);
        
        add(lb_author); add(tf_author); add(lb_pages); add(tf_pages);
        
        add(lb_editorial); add(tf_editorial);
        add(bt_create_card);
    }
    
    public static void main(String[] args)
    {
        
        BookCardForm book_card = new BookCardForm();
        book_card.setVisible(true);
        
    }
}
