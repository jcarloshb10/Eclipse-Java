package Ejemplos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Triki extends JFrame{
    private JButton casillas[];
    private boolean turno; //true para X   false para O
    public Triki(){
        turno=true;// empiezan las X
        setSize(500,500);
        setupWidgets();
        setupEvents();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  
    public void setupWidgets(){
        setLayout(new GridLayout(3,3));
        casillas=new JButton[9];
        for(int i=0;i<9;i++){
            casillas[i]=new JButton();
            add(casillas[i]);
        }
    }
    private void setupEvents(){
        for(int i=0;i<9;i++){
            casillas[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton bt_actual = (JButton)e.getSource();
                    if(turno){ //si turno es true marca X
                        bt_actual.setText("X");                     
                    }else{ //si turno es false marcara O
                        bt_actual.setText("O"); 
                    }
                    bt_actual.setEnabled(false);
                    turno=!turno; //Cambia de false a true y viseversa
                }
            });
        }
    }
    public static void main(String[] args){
        new Triki();
    } 
}
