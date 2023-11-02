package opposedsliders;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class OpposedSliders extends JFrame {

	/* ATTRIBUTES ___________________________________________________________ */
	// <editor-fold defaultstate="collapsed" desc="Attributes">
	private JSlider northSlider;
	private JSlider southSlider;

	// </editor-fold>
	/* CONSTRUCTORS _________________________________________________________ */
	public OpposedSliders() {
		// Init Frame
		setLayout(new GridLayout(2, 1));
		setMinimumSize(new Dimension(200, 100));
		setTitle("Ex2 Opposed Sliders");

		setSize(260, 100);
		setLocationRelativeTo(null);

		initComponents();
		initEvents();
	}

	/* METHODS ______________________________________________________________ */
	private void initComponents() {
		northSlider = new JSlider();
		southSlider = new JSlider();

		add(northSlider);
		add(southSlider);
	}

	/* ______________________________________________________________________ */
	private void initEvents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		northSlider.addChangeListener(cl -> {
			Integer valueNorth = northSlider.getValue();
			Integer maximumSouth = southSlider.getMaximum();
			southSlider.setValue(maximumSouth - valueNorth);
		});

		/*
		 * southSlider.addChangeListener(cl -> { Integer valueSouth =
		 * southSlider.getValue(); Integer maximumNorth = northSlider.getMaximum();
		 * northSlider.setValue(maximumNorth - valueSouth); });
		 */
		southSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				Integer valueSouth = southSlider.getValue();
				Integer maximumNorth = northSlider.getMaximum();
				northSlider.setValue(maximumNorth - valueSouth);
			}
		});
	}

	/* MAIN _________________________________________________________________ */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			new OpposedSliders().setVisible(true);
		});
	}
}
