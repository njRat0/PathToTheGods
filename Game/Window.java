package PathToTheGods.Game;

import javax.swing.JFrame;

public class Window extends javax.swing.JFrame{ 
    public Window(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("Tic-tac-toe");
        setLocationRelativeTo(null);
    }

    public void CreateWindow (){
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }
}
