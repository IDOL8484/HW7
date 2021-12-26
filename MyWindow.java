package folder;

import folder.WindowsParts.GamePanel;
import folder.WindowsParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    private int widhtWindow = 1280;
    private int heightWindow = 768;
    private int positionXWindow = 150;
    private int positionYWindow = 100;
    private String titleWindow = "Game have been load";

    private InfoPanel infoPanel;
    private GamePanel map;

    MyWindow(){
        setupWindow(); // параметры окна.
        map = new GamePanel(); // Создает карту
        infoPanel = new InfoPanel(this); // создает infoPanel
        add(map);  // добавляет карту в окно
        add(infoPanel, BorderLayout.EAST); // добавляет infoPanel и определяет на правую часть окна
        setVisible(true); // метод делает окно видимым.
    }

   private void setupWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // кнопка Закрыть
        setSize(widhtWindow, heightWindow); // Размеры окна
        setLocation(positionXWindow,positionXWindow); // Позиция окна на экране
        setTitle(titleWindow); // Надпись рамки
        setResizable(false); // true - окно можно изменять вручную, false - нельзя.
   }
}
