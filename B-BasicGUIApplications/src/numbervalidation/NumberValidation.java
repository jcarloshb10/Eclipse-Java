package numbervalidation;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberValidation extends JFrame {

    /* ATTRIBUTES ___________________________________________________________ */
    // <editor-fold defaultstate="collapsed" desc="Attributes">
    private JTextField textField;
    private JButton button;
    private JLabel label;
    // </editor-fold>

    /* CONSTRUCTORS _________________________________________________________ */
    public NumberValidation() {
        // Init Frame
        setLayout(new GridLayout(3, 1));
        setMinimumSize(new Dimension(150, 100));
        setTitle("Ex3 Number Validation");

        setSize(300, 150);
        setLocationRelativeTo(null);

        initComponents();
        initEvents();
    }

    /* METHODS ______________________________________________________________ */
    private void initComponents() {
        textField = new JTextField();
        button = new JButton("Validate");
        label = new JLabel();

        add(textField);
        add(button);
        add(label);
    }

    /* ______________________________________________________________________ */
    private void initEvents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.addActionListener(al -> {
            validateNumber();
        });

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if (ke.getKeyChar() == '\n') {
                    button.doClick();
                }
            }
        });
    }

    /* ______________________________________________________________________ */
    public void validateNumber() {
        float  f1 = -3f;
        double d1 = 44.4F;
        Float  f2 = -5.55f;
        Double d2 = 66D;

        String string = textField.getText().toLowerCase(); // Caracters to Lower case

        try {
            Integer.parseInt(string); // Posible NumberFormatException
            label.setText("Ok");

        } catch (NumberFormatException e) {
            // If is not integer
            try {

                Double.parseDouble(string); // Posible NumberFormatException

                if (!string.contains("d") && !string.contains("f")) {
                    label.setText("Ok");
                } else {
                    throw new NumberFormatException();
                }

            } catch (NumberFormatException nfe) {
                // If is not integer o double
                label.setText("Error");
            }
        }

    }

    /* MAIN _________________________________________________________________ */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new NumberValidation().setVisible(true);
        });
    }
}
