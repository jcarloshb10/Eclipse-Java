package evaluation2;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex5Menu extends JFrame {

    /* ATTRIBUTES ___________________________________________________________ */
    private JFrame[] frames;
    private JCheckBox[] checkBoxes;

    /* CONSTRUCTORS _________________________________________________________ */
    public Ex5Menu() {

        // Set Up Frame
        setLayout(new GridLayout(4, 1));
        setSize(300, 200);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(150, 150));
        setTitle("Ex5 Menu");

        initComponents();
        initEvents();
    }

    /* METHODS ______________________________________________________________ */
    private void initComponents() {
        checkBoxes = new JCheckBox[4];
        frames = new JFrame[4];

        String[] strings = {"About", "Tic-Tac-Toe", "Tic-Tac-Toe (Complete)", "TimesTable"};

        for (int i = 0; i < 4; i++) {
            checkBoxes[i] = new JCheckBox(strings[i]);
            add(checkBoxes[i]);
        }
    }

    /* ______________________________________________________________________ */
    private void initEvents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ActionListener actionListener = ae -> {

            JCheckBox c = (JCheckBox) ae.getSource();

            for (int i = 0; i < 4; i++) {

                if (c.equals(checkBoxes[i])) {

                    if (checkBoxes[i].isSelected()) {

                        switch (i) {
                            case 0:
                                frames[i] = new Ex1About();
                                break;
                            case 1:
                                frames[i] = new Ex2TicTacToe();
                                break;
                            case 2:
                                frames[i] = new Ex3TicTacToeComplete();
                                break;
                            case 3:
                                frames[i] = new Ex4TimesTable();
                                break;
                        }

                        final int j = i;
                        frames[i].addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent we) {
                                checkBoxes[j].setSelected(false);
                            }
                        });

                        frames[i].setVisible(true);
                    } else {
                        frames[i].setVisible(false);
                    }
                }
            }

        };

        for (int i = 0; i < 4; i++) {
            checkBoxes[i].addActionListener(actionListener);
        }
    }

    /* MAIN _________________________________________________________________ */
    public static void main(String[] args) {
        new Ex5Menu().setVisible(true);
    }
}
