package evaluation2;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex3TicTacToeComplete extends JFrame {

    /* ATTRIBUTES ___________________________________________________________ */
    private JButton[] buttons;
    private String currentPlayer = "X";

    /* CONSTRUCTORS _________________________________________________________ */
    public Ex3TicTacToeComplete() {

        // Set Up Frame
        setLayout(new GridLayout(3, 3));
        setSize(400, 400);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(300, 300));
        setTitle("Ex3 Tic-Tac-Toe (Complete)");

        initComponents();
        initEvents();
    }

    /* METHODS ______________________________________________________________ */
    private void initComponents() {

        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Dialog", Font.BOLD, 40));

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

            if (verifyTicTacToe()) {
                JOptionPane.showMessageDialog(null, "The Winner is: " + currentPlayer, "¡Winner!", JOptionPane.INFORMATION_MESSAGE);
            }
            currentPlayer = currentPlayer.equals("X") ? "O" : "X";

        };

        for (int i = 0; i < 9; i++) {
            buttons[i].addActionListener(al);
        }
    }

    /* ______________________________________________________________________ */
    private boolean verifyTicTacToe() {
        return verifyIndexes(0, 1, 2)
                || verifyIndexes(3, 4, 5)
                || verifyIndexes(6, 7, 8)
                || verifyIndexes(0, 3, 6)
                || verifyIndexes(1, 4, 7)
                || verifyIndexes(2, 5, 8)
                || verifyIndexes(0, 4, 8)
                || verifyIndexes(6, 4, 2);
    }

    /* ______________________________________________________________________ */
    public boolean verifyIndexes(int i1, int i2, int i3) {
        return buttons[i1].getText().equals(currentPlayer)
                && buttons[i2].getText().equals(currentPlayer)
                && buttons[i3].getText().equals(currentPlayer);
    }


    /* MAIN _________________________________________________________________ */
    public static void main(String[] args) {
        new Ex3TicTacToeComplete().setVisible(true);
    }
}
