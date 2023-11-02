package checklist;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

        initEvents();
    }

    private void initWidgets()
    {
        
        GridLayout layout = new GridLayout(10, 1);

        JPanel pn_checks = new JPanel(layout);
        JPanel pn_fieds  = new JPanel(layout);
        checkBoxes       = new JCheckBox[10];
        textFields       = new JTextField[10];

        JLabel texto     = new JLabel(" List your activitis and uncheck the irelevant ones ");
        JButton boton    = new JButton(" Send checklist ");

        for (int i = 0; i < 10; i++)
        {
            checkBoxes[i] = new JCheckBox();
            checkBoxes[i].setSelected(true);
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

    private void initEvents()
    {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        for (int i = 0; i < 10; i++)
        {
            
            checkBoxes[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    JCheckBox checkBox = (JCheckBox) ae.getSource();

                    for (int i = 0; i < 10; i++)
                    {
                        if (checkBoxes[i].equals(checkBox))
                        {
                            textFields[i].setEnabled(checkBox.isSelected());
                        }
                    }
                }
            });
        }
    }
    
    public static void main(String[] args)
    {
        CheckListForm lista = new CheckListForm();
        lista.setVisible(true);
    }
}
