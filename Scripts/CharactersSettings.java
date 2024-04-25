package PathToTheGods.Scripts;

enum TypesOfCharacter{
    Enemy,
    Player
}

class Character{
    private int currentHP = 100;
    private int maxHP = 100;
    private int currentMana = 20;
    private int maxMana = 20;
    
    public int getCurrentHP() {
        return currentHP;
    }
    public void setCurrentHP(int currentHP) {
        this.currentHP = (currentHP > this.maxHP)? this.maxHP: currentHP;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public int getCurrentMana() {
        return currentMana = (currentMana > this.maxMana)? this.maxMana: currentHP;
    }
    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }
    public int getMaxMana() {
        return maxMana;
    }
    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }
}

interface BlockingSystem {
    
}

interface CritDamageSystem {
    int critChange = 0;
    int critDamage = 140;

    default void setCritDamage(){
        
    }
    //void getCritDamage();
}

interface RandomModule{
    static public int RandomDecision(){
        int result = 1;
        return result;
    }
}



