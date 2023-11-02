package evaluation2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ex4TimesTable extends JFrame {

    /* ATTRIBUTES ___________________________________________________________ */
    private JComboBox comboBox;
    private JTable table;

    /* CONSTRUCTORS _________________________________________________________ */
    public Ex4TimesTable() {

        // Set Up Frame
        setLayout(new BorderLayout());
        setSize(400, 400);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(300, 250));
        setTitle("Ex2 Tic-Tac-Toe");

        initComponents();
        initEvents();
    }

    /* METHODS ______________________________________________________________ */
    private void initComponents() {
        JPanel northPanel = new JPanel(new GridLayout(1, 2));

        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = (i + 1) + " Times Table";
        }
        comboBox = new JComboBox(strings);

        table = new JTable(new DefaultTableModel(0, 5));

        northPanel.add(new JLabel("Select a Table"));
        northPanel.add(comboBox);

        add(northPanel, BorderLayout.NORTH);
        add(table, BorderLayout.CENTER);
    }

    /* ______________________________________________________________________ */
    private void initEvents() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        comboBox.addActionListener(al -> {
            ((DefaultTableModel) table.getModel()).setRowCount(0);

            int i = comboBox.getSelectedIndex() + 1;

            for (int j = 0; j < 10; j++) {
                String[] strings = new String[]{i + "", "X", (j + 1) + "", "=", (i * (j + 1) + "")};
                ((DefaultTableModel) table.getModel()).addRow(strings);
            }

            table.updateUI();
        });
    }

    /* MAIN _________________________________________________________________ */
    public static void main(String[] args) {
        new Ex4TimesTable().setVisible(true);
    }
}
