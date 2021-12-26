package folder.WindowsParts.InfoPanelParts;

import folder.MyWindow;
import folder.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {

    private InfoPanel infoPanel;
    private MyWindow myWindow;

    public GameInfoArea(InfoPanel infoPanel, MyWindow myWindow) {
        this.infoPanel = infoPanel;
        this.myWindow = myWindow;
        setBackground (new Color(104, 169, 192));
        setLayout(new GridLayout(4,1));
        add(new JLabel("= Game Info =", SwingConstants.CENTER));
        add(new JLabel("Map: ", SwingConstants.CENTER));
        add(new JLabel("Level: ", SwingConstants.CENTER));
        add(new JLabel("Count Trap: ", SwingConstants.CENTER));
    }
}
