package PathToTheGods.Game;

public class Main {
    static public Window window;
    static public void main(String[] arg){
        window = new Window();
        window.CreateAllLayouts();
        ChangeLayout("MainMenu");
        //ChangeLayout("MainMenu");
        //window.CreateWindow();
        System.out.println(window);
    }

    static public void ChangeLayout(String name){
        window.ChangeLayout(name);
    }
}
