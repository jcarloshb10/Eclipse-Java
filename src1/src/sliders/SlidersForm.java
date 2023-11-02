package sliders;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.BorderLayout;

public class SlidersForm extends JFrame {

    private JSlider[] desplazadores;
    private JButton boton;

    public SlidersForm()
    {
        BorderLayout layout = new BorderLayout();

        setSize(300, 300);
        setLayout(layout);

        initWidgets();

    }

    private void initWidgets()
    {

        desplazadores = new JSlider[4];

        desplazadores[1] = new JSlider(JSlider.VERTICAL);
        add(desplazadores[1], BorderLayout.WEST);

        desplazadores[2] = new JSlider(JSlider.VERTICAL);
        add(desplazadores[2], BorderLayout.EAST);

        desplazadores[0] = new JSlider(JSlider.HORIZONTAL);
        add(desplazadores[0], BorderLayout.NORTH);

        desplazadores[3] = new JSlider(JSlider.HORIZONTAL);
        add(desplazadores[3], BorderLayout.SOUTH);

        boton = new JButton();
        add(boton, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args)
    {
        SlidersForm form = new SlidersForm();
        form.setVisible(true);

    }
    
}
