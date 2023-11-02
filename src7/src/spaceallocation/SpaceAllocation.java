package spaceallocation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SpaceAllocation extends JFrame {

    private JComboBox cb_freeSpaces, cb_takedSpaces;
    private JButton bt_takeSpace, bt_freeSpace;
    
    public SpaceAllocation()
    {
        
        setLayout(null);
        
        setTitle(" Allocation of Spaces ");
        
        setResizable(false);
        
        setSize(490, 185);

        initWidgets();
        initEvents();
    }

    
    private void initWidgets()
    {

        JLabel lb_freeSpaces  = new JLabel(" Free spaces ");
        JLabel lb_takedSpaces = new JLabel(" Taked spaces ");
        
        cb_takedSpaces = new JComboBox();

        String[] lugares = new String[3];
        lugares[0] = "Coliseo";
        lugares[1] = "Picina";
        lugares[2] = "Cancha";
        
        cb_freeSpaces  = new JComboBox(lugares);
        
        bt_takeSpace = new JButton(" Take space "); 
        bt_freeSpace = new JButton(" Free space ");
        
        lb_freeSpaces.setBounds(30, 20, 80, 30);
        lb_takedSpaces.setBounds(250, 20, 90, 30);

        cb_freeSpaces.setBounds(30, 55, 200, 30);
        cb_takedSpaces.setBounds(250, 55, 200, 30);
        
        bt_takeSpace.setBounds(30, 100, 200, 30);
        bt_freeSpace.setBounds(250, 100, 200, 30);

        
        add(lb_freeSpaces); add(lb_takedSpaces);
        add(cb_freeSpaces); add(cb_takedSpaces);
        add(bt_takeSpace);  add(bt_freeSpace);
    }
    
    private void initEvents() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ActionListener take = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                DefaultComboBoxModel comboBoxModel;
                Object space = cb_freeSpaces.getSelectedItem();

                if (space == null)
                {
                    JOptionPane.showMessageDialog(null, " There are not elements ");
                }
                else
                {
                    comboBoxModel = (DefaultComboBoxModel) cb_takedSpaces.getModel();
                    comboBoxModel.addElement(space.toString());
                    
                    comboBoxModel = (DefaultComboBoxModel) cb_freeSpaces.getModel();
                    comboBoxModel.removeElement(space.toString());
                }
                
            }
        };
        ActionListener free = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                DefaultComboBoxModel comboBoxModel;
                Object space = cb_takedSpaces.getSelectedItem();

                if (space == null)
                {
                    JOptionPane.showMessageDialog(null, " There are not elements ");
                }
                else
                {
                    comboBoxModel = (DefaultComboBoxModel) cb_freeSpaces.getModel();
                    comboBoxModel.addElement(space.toString());
                    
                    comboBoxModel = (DefaultComboBoxModel) cb_takedSpaces.getModel();
                    comboBoxModel.removeElement(space.toString());
                    
                }
                
            }
        };
        
        bt_takeSpace.addActionListener(take);
        bt_freeSpace.addActionListener(free);
    }
    
    public static void main(String[] args)
    {
        SpaceAllocation espacios =  new SpaceAllocation();
        espacios.setVisible(true);
        
    }
    
}
