package pkl55.component;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HelpBt extends JButton {

    private ImageIcon icon;

    public HelpBt() {

        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        icon = new ImageIcon(getClass().getResource("/pkl55/images/help.png"));
        setIcon(icon);

        setPreferredSize(new Dimension(169, 44));
        setVisible(true);
        setText(null);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/help-hover.png"));
                setIcon(icon);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/help.png"));
                setIcon(icon);
            }

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/help-pressed.png"));
                setIcon(icon);
            }
            
            @Override
            public void mouseReleased(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/help-hover.png"));
                setIcon(icon);
                //setActive(true);
            }
        });
    }

}
