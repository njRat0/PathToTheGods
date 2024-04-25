package PathToTheGods.Scripts;

//import javax.swing.DebugGraphics;

class GameData{
    private int money = 100;
    private int guildTokens = 0;
    public Inventory inventory;
    public Character player;

    public GameData(){
        inventory = new Inventory();  
        player = new Character();      
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int count){
        money+= count;
    }

    public void removeMoney(int count){
        money-= count;
    }

    public int getGuildTokens() {
        return guildTokens;
    }

    public void setGuildTokens(int guildTokens) {
        this.guildTokens = guildTokens;
    }

    public void addGuildTockens(int count){
        guildTokens+= count;
    }

    public void removeGuildTockens(int count){
        guildTokens-= count;
    }

    class Inventory{
        private int sizeOfInventory = 20;
        private int countOfRows = sizeOfInventory/4;
        private int countOfColumns = 4;
        private int[][] mapOfItems = new int[countOfRows][countOfColumns];

        public int getSizeOfInventory() {
            return sizeOfInventory;
        }

        public void setSizeOfInventory(int sizeOfInventory) {
            this.sizeOfInventory = sizeOfInventory;
            countOfRows = (this.sizeOfInventory % countOfColumns == 0)? this.sizeOfInventory / countOfColumns : this.sizeOfInventory / countOfColumns + 1;
        }

        public int[][] getMapOfItems() {
            return mapOfItems;
        }

        public void setMapOfItems(int[][] mapOfItems) {
            this.mapOfItems = mapOfItems;
        }

        public void addNewItem(int id){
            boolean isEmptySpace = false;

            for(int row = 0; row < countOfRows; row++){
                for (int column = 0; column < countOfColumns; column++){
                    if(mapOfItems[row][column] == 0){
                        mapOfItems[row][column] = id;
                        isEmptySpace = true;
                        break;
                    }
                }
            }

            if(isEmptySpace == false){
                System.out.println("Your inventory is full");
                //==>++
            }
        }
        
        
    }
}