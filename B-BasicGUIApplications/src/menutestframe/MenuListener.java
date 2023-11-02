package menutestframe;

import java.awt.event.MouseEvent;

public interface MenuListener {

    public void MenuAction(MenuEvent me);
    
    public class MenuEvent extends MouseEvent {
        public MenuEvent(MouseEvent me) {
            super(me.getComponent(), me.getID(), me.getWhen(), me.getModifiers(), me.getX(), me.getY(), me.getClickCount(), me.isPopupTrigger());
        }
    }
}
