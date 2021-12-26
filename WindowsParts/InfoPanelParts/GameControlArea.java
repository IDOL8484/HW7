package folder.WindowsParts.InfoPanelParts;

import folder.MyWindow;
import folder.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class GameControlArea extends JPanel {

    private InfoPanel infoPanel;
    private MyWindow myWindow;

    public GameControlArea(InfoPanel infoPanel, MyWindow myWindow) {
        this.infoPanel = infoPanel;
        this.myWindow = myWindow;
        setBackground (new Color(80, 150, 120));
        setLayout(new GridLayout(3,1));
        JButton startGame = new JButton("Start game");
        JButton exitGame = new JButton("Exit");
        add(new JLabel("= Game Controls =", SwingConstants.CENTER));
        add(startGame);
        add(exitGame);
        }
    }