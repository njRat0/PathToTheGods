package PathToTheGods.Scripts;

//import com.google.gson.Gson; 

public class Main {
    static public Window window;
    static public GameData data;
    static public void main(String[] arg){
        window = new Window();
        window.CreateAllLayouts();
        data = new GameData();

        ChangeLayout("Settings");
        ChangeLayout("MainMenu");
        //ChangeLayout("MainMenu");
        //window.CreateWindow();
        System.out.println(window);
        data.removeMoney(30);
        System.out.println("\n count of money: " + data.getMoney());
    }


    static public void ChangeLayout(String name){
        window.ChangeLayout(name);
    }

    static public void ExitOfGame(){
        window.dispose();
    }
}