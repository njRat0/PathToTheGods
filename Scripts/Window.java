package PathToTheGods.Scripts;

import javax.swing.*;
import java.awt.*;


public class Window extends javax.swing.JFrame{ 
    private Image gameIcon = Toolkit.getDefaultToolkit().getImage("PathToTheGods\\Images\\Icons\\GameLogo.png");
    static private Container container;
    static private CardLayout cardLayout;

    public Window(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("PathToTheGods");
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(gameIcon);
        setVisible(true);
    }

    //Layouts
    Layout_MainMenu mainMenu;
    Layout_Settings settingsMenu;
    public void CreateAllLayouts(){
        container = getContentPane();
        cardLayout = new CardLayout();
        container.setLayout(cardLayout);


        mainMenu = new Layout_MainMenu();
        settingsMenu = new Layout_Settings();

        container.add("MainMenu", mainMenu);
        container.add("Settings", settingsMenu);
    }

    public void ChangeLayout(String nameOfLayout){
        cardLayout.show(container, nameOfLayout);
        //cardLayout.next(container);
    }

}
