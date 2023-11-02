package menutestframe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JComponent;
import menutestframe.MenuListener.MenuEvent;

public class Menu extends JComponent {

    private String name;
    private ArrayList<MenuListener> listeners;

    public Menu(String name) {
        this.name = name;
        listeners = new ArrayList<>();
        initEvents();
    }

    private void initEvents() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                listeners.forEach(listener -> {
                    listener.MenuAction(new MenuEvent(e));
                });
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(Color.red);
                paint(g);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(Color.black);
                paint(g);
            }
        });
    }

    public void addMenuListener(MenuListener listener) {
        listeners.add(listener);
    }

    public void removeMenuListener(MenuListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(name, 10, 18);
    }
}
