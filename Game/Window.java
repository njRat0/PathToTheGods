package PathToTheGods.Game;

import javax.swing.JFrame;

public class Window extends javax.swing.JFrame{
    public Window(){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("Tic-tac-toe");

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setSize(100, 100);;
    }

    public void CreateWindow (){
        
    }
}
