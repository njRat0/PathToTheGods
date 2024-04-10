package PathToTheGods.Game;

import javax.swing.*;
import java.awt.*;

public class Window extends javax.swing.JFrame{ 
    public Image gameIcon = Toolkit.getDefaultToolkit().getImage("PathToTheGods\\Images\\Icons\\GameLogo.png");
      
    public Window(){
        //gameIcon = new Image("/Image/Icons/GameLogo.png");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("PathToTheGods");
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(gameIcon);
        setVisible(true);
    }

    
}
