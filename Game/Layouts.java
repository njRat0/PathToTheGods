package PathToTheGods.Game;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Layout_MainMenu extends JPanel implements ActionListener{
    private JButton startButton;
    private JButton settingsButton;
    private JButton exitButton;

    public Layout_MainMenu(){
        startButton = new JButton("Start");
        settingsButton = new JButton("Settings");
        exitButton = new JButton("Exit");

        startButton.addActionListener(this);
        settingsButton.addActionListener(this);
        exitButton.addActionListener(this);

        this.add(startButton);
        this.add(settingsButton);
        this.add(exitButton);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == settingsButton){
            Main.window.ChangeLayout("Settings");
        }
    }
}

class Layout_Settings extends JPanel implements ActionListener{
    private JTextArea txt;
    private JButton backButton;

    public Layout_Settings(){
        txt = new JTextArea("Settings");
        backButton = new JButton("back");
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
