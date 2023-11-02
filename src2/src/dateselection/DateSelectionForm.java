package dateselection;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class DateSelectionForm extends JFrame {

    private JComboBox cb_anios, cb_meses, cb_dias;

    public DateSelectionForm()
    {

        GridLayout layout = new GridLayout(2, 3);
        setLayout(layout);

        setSize(400, 200);

        setTitle(" Date Selection ");

        initWidgets();
    }

    private void initWidgets()
    {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] meses = new String[12];
        meses[0]  = "Enero";
        meses[1]  = "Febrero";
        meses[2]  = "Marzo";
        meses[3]  = "Abril";
        meses[4]  = "Mayo";
        meses[5]  = "Junio";
        meses[6]  = "Julio";
        meses[7]  = "Agosto";
        meses[8]  = "Septiembre";
        meses[9]  = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";


        String[] anios = new String[20];
        for (int i = 0; i < 20; i++)
        {
            anios[i] = 2000 + i + "";
        }

        Integer[] dias = new Integer[31];
        for (int i = 0; i < 31; i++)
        {
            dias[i] = i + 1;
        }

        JLabel anio = new JLabel(" Año ");
        JLabel mes  = new JLabel(" Mes ");
        JLabel dia  = new JLabel(" Dia ");
        
        cb_anios    = new JComboBox(anios);
        cb_meses    = new JComboBox(meses);
        cb_dias     = new JComboBox(dias);

        add(anio);     add(mes);      add(dia);
        add(cb_anios); add(cb_meses); add(cb_dias);

    }

    public static void main(String[] args)
    {

        DateSelectionForm fecha = new DateSelectionForm();
        fecha.setVisible(true);
    }
}
