package game;
public class Healer extends Character{

    public Healer(int defence, int attack, int HP) {
        super(defence, attack, HP);
    }
    
    @Override
    public boolean attack(){
        int a = (int)(Math.random()*10) + 1;
        
        return a > 0 && a < 9;
    }
    
    @Override
    public void recieveDamage(int attack){
        if(this.attack() == true)
            super.recieveDamage(attack);
    }
   
    @Override
    public void info(){
        System.out.println("-----PLAYER'S STATS-----");
        System.out.println("Role\t: " + this.getClass().getSimpleName());
        System.out.println("HP\t: " +   this.getHP());
        System.out.println("Attack\t: " + this.getAttack());
        System.out.println("Defense\t: " + this.getDefence());
        System.out.println("------------------------");
    }
    
    public void heal(){
        this.setHP(this.getHP() + 25);
    }   
}