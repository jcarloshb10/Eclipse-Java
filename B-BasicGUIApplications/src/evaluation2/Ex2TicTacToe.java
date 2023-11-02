package evaluation2;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex2TicTacToe extends JFrame {

    /* ATTRIBUTES ___________________________________________________________ */
    private JButton[] buttons;
    private String currentPlayer = "X";

    /* CONSTRUCTORS _________________________________________________________ */
    public Ex2TicTacToe() {
        // Set Up Frame
        setLayout(new GridLayout(3, 3));
        setSize(400, 400);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(300, 300));
        setTitle("Ex2 Tic-Tac-Toe");

        initComponents();
        initEvents();
    }

    /* METHODS ______________________________________________________________ */
    private void initComponents() {

        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Dialog", Font.BOLD, 30));

            add(buttons[i]);
        }

    }

    /* ______________________________________________________________________ */
    private void initEvents() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ActionListener al = ae -> {

            JButton button = (JButton) ae.getSource();
            button.setText(currentPlayer);
            button.setEnabled(false);

            if (currentPlayer.equals("X")) {
                currentPlayer = "O";
            } else if (currentPlayer.equals("O")) {
                currentPlayer = "X";
            }
        };

        for (int i = 0; i < 9; i++) {
            buttons[i].addActionListener(al);
        }
    }

    /* MAIN _________________________________________________________________ */
    public static void main(String[] args) {
        new Ex2TicTacToe().setVisible(true);
    }
}
