package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) { 
        Character enemy = new Titan(0, 45, 200);
        Scanner sc = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI GAME DEFEND FILKOM");
        System.out.print("SILAHKAN MASUKKAN NAMA PLAYER : ");
        String name = sc.nextLine();        
        
        int role = 0;
        boolean input = true;
        
        while(input){
            try{
                System.out.println("SILAHKAN PILIH KARAKTER YANG ANDA INGINKAN : ");
                System.out.println("1. Magician \n2. Healer \n3. Warrior");
                role = sc.nextInt();
                if(role < 1 || role > 3){
                    input = true;
                    System.out.println("PILIH 1, 2, ATAU 3");
                }else
                    input = false;
            }catch(InputMismatchException e){
                System.out.println("TOLONG MASUKKAN ANGKA !");
                sc.next();
                input = true;
            }
        }
        Character player = null;
        
        switch (role) {
            case 1:
                player = new Magician(10,60,100);
                break;
            case 2:
                player = new Healer(10, 10, 70);
                break;
            case 3:
                player = new Warrior(30,25,80);
                break;
            default:
                break;
        } 
        
        System.out.println("SELAMAT DATANG, " + name.toUpperCase());
        player.info();
        
        boolean finish = true;
        int turn = 0;
        while(finish){
            System.out.println("---------TURN " + (turn+1) + "--------");
            System.out.println("Titan's HP\t:" + enemy.getHP());
            System.out.println(name + "'s HP\t:" + player.getHP());
            player.recieveDamage(enemy.getAttack());
            enemy.recieveDamage(player.getAttack()); 
            turn++;
            
            if(turn%2 == 0 && role == 2){
                player.heal();
                System.out.println("Menggunakan Skill Heal");
            }
                
            if(player.getHP() == 0 || enemy.getHP() == 0)
                break;
        }
        
        if(player.getHP() > enemy.getHP())
            System.out.println("============" + name + " WIN!" + "===========");
        else
            System.out.println("============TITAN WIN!===========");
        
        enemy.info();
        System.out.println("");
        player.info();
    }
}