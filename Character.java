package game;
public abstract class Character{
    private int defence;
    private int attack;
    private int HP;

    public Character(int defence, int attack, int HP) {
        this.defence = defence;
        this.attack = attack;
        this.HP = HP;
    }
    public void heal(){};
    
    public abstract boolean attack();
    
    public void recieveDamage(int attack){
        if(this.getHP() - (attack - this.getDefence()) < 0)
            this.setHP(0);
        else
            this.setHP(this.getHP() - (attack - this.getDefence()));
    }
    
    public void info(){
        
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}