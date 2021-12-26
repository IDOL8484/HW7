package folder.WindowsParts.InfoPanelParts;

import folder.MyWindow;
import folder.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {

    private InfoPanel infoPanel;
    private MyWindow myWindow;

    public PlayerInfoArea(InfoPanel infoPanel, MyWindow myWindow) {
        this.infoPanel = infoPanel;
        this.myWindow = myWindow;
        setBackground (new Color(163, 113, 206));
        setLayout(new GridLayout(4,1));
        add(new JLabel("= Player Info =", SwingConstants.CENTER));
        add(new JLabel("HP: ", SwingConstants.CENTER));
        add(new JLabel("STR: ", SwingConstants.CENTER));
        add(new JLabel("EXP: ", SwingConstants.CENTER));
    }
}
