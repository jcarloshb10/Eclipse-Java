package verticaltexts;

import java.awt.Graphics;
import javax.swing.JComponent;

public class VerticalText extends JComponent {

    private String text;

    public VerticalText(String text) {
        this.text = text;
    }

    public VerticalText() {
        this.text = "";
    }

    @Override
    public void paint(Graphics g) {
        int w = getWidth();

        for (int i = 0; i < text.length(); i++) {
            g.drawString(text.charAt(i) + "", w / 2 - 5, i * 13 + 13);
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        repaint();
    }
}
