package PathToTheGods.Game;
import javax.swing.*;
import javax.swing.plaf.ButtonUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Layout_MainMenu extends JPanel implements ActionListener{
    private Button startButton;
    private Button settingsButton;
    private Button exitButton;

    public Layout_MainMenu(){
        startButton = new Button("Start");
        settingsButton = new Button("Settings");
        exitButton = new Button("Exit");

        startButton.addActionListener(this);
        settingsButton.addActionListener(this);
        exitButton.addActionListener(this);

        startButton.setColor(new Color(0,0,0));
        startButton.setColorOver(new Color(78, 78, 78));
        startButton.setColorClick(new Color(140, 140, 140));
        startButton.setForeground(new Color(255,255,255));

        //startButton.setBackground(getBackground().black);
        //startButton.setUI(ButtonUI);
        //startButton.setBounds(0,0,500,500);

        this.add(startButton);
        this.add(settingsButton);
        this.add(exitButton);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == settingsButton){
            Main.window.ChangeLayout("Settings");
        }
        else if(e.getSource() == exitButton){
            Main.ExitOfGame();
        }
    }
}

class Layout_Settings extends JPanel implements ActionListener{
    private JTextArea txt;
    private Button backButton;

    public Layout_Settings(){
        txt = new JTextArea("Settings");
        backButton = new Button("back");

        backButton.addActionListener(this);

        this.add(txt, BorderLayout.CENTER);
        this.add(backButton);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton){
            Main.window.ChangeLayout("MainMenu");
        }     
    }
}
