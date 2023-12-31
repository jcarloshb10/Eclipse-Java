package cw07_stock;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StockWindow extends JFrame {
	private JTextField tf_article;
	private JList<String> ls_healthies, ls_damages;
	private DefaultListModel<String> lm_healthies, lm_damages;

	// ---------------------------------------------------------
	public StockWindow() {
		setTitle("stock management");
		setSize(700, 400);
		setupwidgets();
		setupEvents();
		setVisible(true);
	}

	// ----------------------------------
	private void setupwidgets() {
		tf_article = new JTextField();
		lm_healthies = new DefaultListModel<String>();
		lm_damages = new DefaultListModel<String>();
		ls_healthies = new JList(lm_healthies);
		ls_damages = new JList(lm_damages);

		JPanel pn_center = new JPanel(new GridLayout(1, 2));
		add(tf_article, BorderLayout.NORTH);
		add(pn_center, BorderLayout.CENTER);
		pn_center.add(ls_healthies);
		pn_center.add(ls_damages);
	}

	// ----------------------------------------------------------

	private void setupEvents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		tf_article.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {
				lm_healthies.addElement(tf_article.getText());
				tf_article.setText("");
			}
		});
		ls_healthies.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent ev) {
				if (ev.getClickCount() == 2 && ls_healthies.getSelectedIndex() >= 0) {
					lm_damages.addElement(ls_healthies.getSelectedValue());
					lm_healthies.remove(ls_healthies.getSelectedIndex());
				}
			}
		});
		ls_damages.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent ev) {
				if (ev.getClickCount() == 2 && ls_damages.getSelectedIndex() >= 0) {
					lm_healthies.addElement(ls_damages.getSelectedValue());
					lm_damages.remove(ls_damages.getSelectedIndex());
				}
			}
		});
		;

	}
//-------------------------------------------------------

	public static void main(String[] args) {
		new StockWindow();
	}
}
