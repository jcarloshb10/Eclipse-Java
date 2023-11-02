package ex_meses;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class meses extends JFrame {
	private JButton jb_meses[];
	private JComboBox cb_fechas;
	private String[] mes_1;
	
	public meses() {
		setTitle("Ejercicio meses");
		setSize(300,300);
		setupWidgets();
		setupEvents();
                setLocationRelativeTo(null);
		setVisible(true);
	}

	private void setupWidgets() {
		jb_meses =new JButton[12];
		cb_fechas =new JComboBox();
		JPanel pn_meses=new JPanel(new GridLayout(4,3));
		
		add(pn_meses,BorderLayout.CENTER);
		add(cb_fechas,BorderLayout.SOUTH);
		
		jb_meses[0]=new JButton("Enero");
		jb_meses[1]=new JButton("Febrero");
		jb_meses[2]=new JButton("Marzo");
		jb_meses[3]=new JButton("Abril");
		jb_meses[4]=new JButton("Mayo");
		jb_meses[5]=new JButton("Junio");
		jb_meses[6]=new JButton("Julio");
		jb_meses[7]=new JButton("Agosto");
		jb_meses[8]=new JButton("Septiembre");
		jb_meses[9]=new JButton("Octubre");
		jb_meses[10]=new JButton("Noviembre");
		jb_meses[11]=new JButton("Diciembre");
		
		for (int i = 0; i <12; i++) {
		pn_meses.add(jb_meses[i]);	
                }
		
	}

	private void setupEvents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
                for (int i = 0; i < 12; i++) {
                jb_meses[i].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ev) {
                            JButton action = (JButton)ev.getSource();
                            cb_fechas.removeAllItems();
                            
                            if(action.getText().equals("Febrero")){
                                for (int i = 0; i < 28; i++) {
                                    mes_1=new String[28];
                                    int aux=i+1;
                                    mes_1[i]=""+aux;
                                    cb_fechas.addItem(mes_1[i]);
                                }
                            
                            }
                            if(action.getText().equals("Abril")
                                    ||action.getText().equals("Junio")
                                    ||action.getText().equals("Septiembre")
                                    ||action.getText().equals("Noviembre")){
                                for (int i = 0; i < 30; i++) {
                                    mes_1=new String[30];
                                    int aux=i+1;
                                    mes_1[i]=""+aux;
                                    cb_fechas.addItem(mes_1[i]);
                                }
                            
                            }
                            if(action.getText().equals("Enero")
                                    ||action.getText().equals("Marzo")
                                    ||action.getText().equals("Mayo")
                                    ||action.getText().equals("Julio")
                                    ||action.getText().equals("Agosto")
                                    ||action.getText().equals("Octubre")
                                    ||action.getText().equals("Diciembre")){
                                for (int i = 0; i < 31; i++) {
                                    mes_1=new String[31];
                                    int aux=i+1;
                                    mes_1[i]=""+aux;
                                    cb_fechas.addItem(mes_1[i]);
                                }
                            
                            }
                            
					
			}
		});
            }
		
	}
        
	public static void main(String[] args) {
		new meses();
	}
	
	

}
