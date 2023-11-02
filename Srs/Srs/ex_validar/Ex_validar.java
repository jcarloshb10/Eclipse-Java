
package ex_validar;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ex_validar extends JFrame {
    private JTextField tf_text;
    private JButton bt_validar;
    private JLabel lb_vali;
    public Ex_validar(){
        setTitle("Ejercicio validacion");
		setSize(300,100);
		setupWidgets();
		setupEvents();
                setLocationRelativeTo(null);
		setVisible(true);
    }
    private void setupEvents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        bt_validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double aux=Double.parseDouble(tf_text.getText());
                    lb_vali.setText("Numero");
                }
                catch (Exception ex) {
                    lb_vali.setText("Error");
                }
                
            }
        });
    }

    private void setupWidgets() {
        tf_text=new JTextField();
        bt_validar=new JButton("Validar");
        lb_vali=new JLabel();
        
        GridLayout ly=new GridLayout(3,1);
        setLayout(ly);
        
        add(tf_text);
        add(bt_validar);
        add(lb_vali);
    }
    public static void main(String[] args) {
        new Ex_validar();
    }
}
