package folder.WindowsParts;

import folder.MyWindow;
import folder.WindowsParts.InfoPanelParts.GameControlArea;
import folder.WindowsParts.InfoPanelParts.GameInfoArea;
import folder.WindowsParts.InfoPanelParts.PlayerControlArea;
import folder.WindowsParts.InfoPanelParts.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

    private GameControlArea gameControlArea;
    private GameInfoArea gameInfoArea;
    private PlayerInfoArea playerInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea log;
    private JScrollPane scroll;

    private MyWindow myWindow;



    public InfoPanel(MyWindow myWindow){
        this.myWindow = myWindow;
        preparePanel();
        createParts();
        add(gameControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        prepareLogs();
    }
    private void preparePanel() { // Вся инфо панель
        setBackground(Color.GRAY);
        JPanel preparePanel = new JPanel();
        setLayout(new GridLayout(5,1));
    }
    private void createParts(){ // части меню
        gameControlArea = new GameControlArea(this, myWindow); // кнопки Start и Exit
        gameInfoArea = new GameInfoArea(this, myWindow); // меню Game Info
        playerInfoArea = new PlayerInfoArea(this, myWindow); // меню Player Info
        playerControlArea = new PlayerControlArea(this, myWindow); // меню кнопок
    }
    private void prepareLogs() { // log панель
        setBackground (new Color(80, 150, 120));
        log = new JTextArea();
        scroll = new JScrollPane(log);
        add (new JLabel("New Game have been created. Go !! go !"));
    }
}
