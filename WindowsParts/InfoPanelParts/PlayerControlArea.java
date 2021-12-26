package folder.WindowsParts.InfoPanelParts;

import folder.MyWindow;
import folder.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerControlArea extends JPanel {

    private InfoPanel infoPanel;
    private MyWindow myWindow;

    public PlayerControlArea(InfoPanel infoPanel, MyWindow myWindow) {
        this.infoPanel = infoPanel;
        this.myWindow = myWindow;
        setBackground (new Color(80, 150, 120));
        setLayout(new GridLayout(2, 3));
        JButton up = new JButton("UP");
        JButton left = new JButton("LEFT");
        JButton down = new JButton("DOWN");
        JButton right = new JButton("RIGHT");
        add(new JLabel());
        add(up);
        add(new JLabel());
        add(left);
        add(down);
        add(right);
    }
}
