package checklist;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckListForm extends JFrame {

    private JCheckBox[] checkBoxes;
    private JTextField[] textFields;

    public CheckListForm()
    {
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        setTitle(" Activities ");

        setSize(400, 300);

        initWidgets();

    }

    private void initWidgets()
    {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(10, 1);

        JPanel pn_checks = new JPanel(layout);
        JPanel pn_fieds  = new JPanel(layout);
        checkBoxes       = new JCheckBox[10];
        textFields       = new JTextField[10];

        JLabel texto     = new JLabel(" List your activities and uncheck the irrelevant ones ");
        JButton boton    = new JButton(" Send checkList ");

        for (int i = 0; i < 10; i++)
        {
            checkBoxes[i] = new JCheckBox();
            pn_checks.add(checkBoxes[i]);
        }

        for (int j = 0; j < 10; j++)
        {
            
            textFields[j] = new JTextField("");
            pn_fieds.add(textFields[j]);
        }

        add(texto, BorderLayout.NORTH);
        add(pn_checks, BorderLayout.WEST); add(pn_fieds, BorderLayout.CENTER);
        add(boton, BorderLayout.SOUTH);

    }

    public static void main(String[] args)
    {
        
        CheckListForm lista = new CheckListForm();
        lista.setVisible(true);
    }
}
