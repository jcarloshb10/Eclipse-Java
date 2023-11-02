package dayselector;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DaySelector extends JFrame {

    /* ATTRIBUTES ___________________________________________________________ */
    // <editor-fold defaultstate="collapsed" desc="Attributes">
    public final static String MONTHS[] = {
        "January", "February", "March",
        "April"  , "May"     , "June",
        "July"   , "August"  , "September",
        "October", "November", "December"};

    private JButton[] buttons;
    private JComboBox daysComboBox;
    // </editor-fold>

    /* CONSTRUCTORS _________________________________________________________ */
    public DaySelector() {
        // Init Frame
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(305, 150));
        setTitle("Ex1 Day Selector");
        setSize(340, 250);
        setLocationRelativeTo(null);

        initComponents();
        initEvents();
    }

    /* METHODS ______________________________________________________________ */
    private void initComponents() {
        JPanel buttonsPanel = new JPanel(new GridLayout(4, 3, 2, 2));

        buttons = new JButton[12];
        daysComboBox = new JComboBox();

        for (int i = 0; i < 12; i++) {
            buttons[i] = new JButton(MONTHS[i]); // Set button text

            buttons[i].setName(i + ""); // Set button indentifier

            buttonsPanel.add(buttons[i]); // Add button to buttons panel
        }

        add(buttonsPanel, BorderLayout.CENTER);
        add(daysComboBox, BorderLayout.SOUTH);
    }

    /* ______________________________________________________________________ */
    private void initEvents() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Action Listener
        ActionListener actionListener = al -> {

            // Get selected button
            JButton source = (JButton) al.getSource();

            // Get button identifier
            Integer selectedMonthIndex = Integer.parseInt(source.getName());

            // Get days in selected month
            Integer monthDays = getMonthDays(selectedMonthIndex + 1);

            // New ComboBox Model
            ((DefaultComboBoxModel) daysComboBox.getModel()).removeAllElements();
            for (int i = 0; i < monthDays; i++) {
                ((DefaultComboBoxModel) daysComboBox.getModel()).addElement(i + 1);
            }

            setTitle(MONTHS[selectedMonthIndex]);
        };

        for (int i = 0; i < 12; i++) {
            buttons[i].addActionListener(actionListener);
        }
    }

    /* ______________________________________________________________________ */
    /**
     * Calculate the days in a month
     *
     * @return The days depending on the month
     */
    public int getMonthDays(int month) {
        int monthDays = 0;

        switch (month) {
            // Months with 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthDays = 31;
                break;
            // February: 28
            case 2:
                monthDays = 28;
                break;
            // Months with 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                monthDays = 30;
        }
        return monthDays;
    }

    /* MAIN _________________________________________________________________ */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new DaySelector().setVisible(true);
        });
    }
}
