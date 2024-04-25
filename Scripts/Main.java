package PathToTheGods.Scripts;

//import PathToTheGods.maven.*;
//import com.google.gson.Gson; 
//import com.google.gson.GsonBuilder; 

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
        Skeleton skeleton = new Skeleton();
        System.out.println(skeleton.getMaxHP());
    }


    static public void ChangeLayout(String name){
        window.ChangeLayout(name);
    }

    static public void ExitOfGame(){
        window.dispose();
    }
}
