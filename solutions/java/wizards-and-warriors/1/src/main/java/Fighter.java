class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    public String toString(){
        return "Fighter is a Warrior";
    }
    public boolean isVulnerable(){
        return false;
    }
    int getDamagePoints(Fighter fighter) {
return fighter.isVulnerable() ? 10 : 6;  
    }
}
class Wizard extends Fighter{
    boolean preparedSpell=false;
    public String toString(){
        return "Fighter is a Wizard";
    }
    public void prepareSpell(){
        preparedSpell=true;
    }
    public boolean isVulnerable(){
       return !preparedSpell;
        
    }
        int getDamagePoints(Fighter fighter) {
return preparedSpell ? 12 : 3;  
    }
    
}