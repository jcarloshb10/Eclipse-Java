package menutestframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuTestFrame extends JFrame {

    private Menu[] menus;
    private JTextArea textArea;

    public MenuTestFrame() {
        initComponents();
        initEvents();
    }

    private void initComponents() {
        // Set Up Frame
        setLayout(new BorderLayout());
        setSize(500, 300);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(250, 150));
        setTitle("Menu Test");

        // Set Components
        textArea = new JTextArea();
        String[] names = {"File", "Edit", "View", "Help"};
        JPanel menusPanel = new JPanel();
        menusPanel.setLayout(new BoxLayout(menusPanel, BoxLayout.Y_AXIS));
        menusPanel.setPreferredSize(new Dimension(90, getHeight()));

        menus = new Menu[4];
        for (int i = 0; i < 4; i++) {
            menus[i] = new Menu(names[i]);
            menus[i].setMinimumSize(new Dimension(menusPanel.getWidth(), 20));
            menus[i].setMaximumSize(new Dimension(Integer.MAX_VALUE, menus[i].getMinimumSize().height));
            menusPanel.add(menus[i]);
        }

        add(menusPanel, BorderLayout.WEST);
        add(textArea, BorderLayout.CENTER);
    }

    private void initEvents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MenuListener menuListener = me -> {
            textArea.setText("");
        };

        for (int i = 0; i < 3; i++) {
            menus[i].addMenuListener(menuListener);
        }

        menus[3].addMenuListener(me -> {
            textArea.setText("This Window has a custom menu\nPick anywhere.");
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new MenuTestFrame().setVisible(true);
        });
    }
}
