package evaluation2;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex1About extends JFrame {

    /* ATTRIBUTES ___________________________________________________________ */
    private JButton nameButton;
    private JButton codeButton;
    private JButton programButton;
    private JLabel label;

    /* CONSTRUCTORS _________________________________________________________ */
    public Ex1About() {
        // Set Up Frame
        setLayout(new GridLayout(1, 2));
        setSize(500, 100);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 100));
        setTitle("Ex1 About");

        initComponents();
        initEvents();
    }
    public void method() {
        
    }

    
    /* METHODS ______________________________________________________________ */
    private void initComponents() {
        JPanel buttonsPanel = new JPanel(new GridLayout(3, 1));

        nameButton = new JButton("Show Name");
        codeButton = new JButton("Show Code");
        programButton = new JButton("Show Program");

        label = new JLabel("");
        label.setHorizontalAlignment(JLabel.CENTER);

        buttonsPanel.add(nameButton);
        buttonsPanel.add(codeButton);
        buttonsPanel.add(programButton);

        add(buttonsPanel);
        add(label);
    }

    /* ______________________________________________________________________ */
    private void initEvents() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        nameButton.addActionListener(al -> {
            label.setText("Jose Alejandro Castrillón");
            label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        });
        codeButton.addActionListener(al -> {
            label.setText("217034080");
            label.setFont(new Font("Arial", Font.ITALIC, 30));
        });
        programButton.addActionListener(al -> {
            label.setText("Engeneering of Systems");
            label.setFont(new Font("Noto Serif", Font.PLAIN, 12));
        });

    }

    /* MAIN _________________________________________________________________ */
    public static void main(String[] args) {
        new Ex1About().setVisible(true);
    }
}
