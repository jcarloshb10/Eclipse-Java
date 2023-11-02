package verticaltexts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import verticaltexts.VerticalText;

public class VerticalTextFrame extends JFrame {

    private VerticalText[] verticalTexts;
    private JTextArea textArea;

    public VerticalTextFrame() {

        initComponents();
        initEvents();
    }

    private void initComponents() {
        // Set Up Frame
        setLayout(new BorderLayout());
        setSize(500, 300);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(250, 150));
        setTitle("Vertical Text");

        // Set Up Componets
        String[] strings = {"Universidad", "De", "Nariño"};
        textArea = new JTextArea();
        verticalTexts = new VerticalText[3];

        JPanel verticalTextsPanel = new JPanel(new GridLayout());
        verticalTextsPanel.setPreferredSize(new Dimension(60, getHeight()));

        for (int i = 0; i < 3; i++) {
            verticalTexts[i] = new VerticalText(strings[i]);
            verticalTextsPanel.add(verticalTexts[i]);
        }

        add(verticalTextsPanel, BorderLayout.WEST);
        add(textArea, BorderLayout.CENTER);
    }

    private void initEvents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new VerticalTextFrame().setVisible(true);
        });
    }
}
