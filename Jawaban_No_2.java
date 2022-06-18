import java.io.*;
import java.util.*;

public class Solution {
    
    public static double admin(double saldo, double setor){
        
        double hasil = (saldo + setor - 7000);
        double hadiah = hasil*0.0005;
        
        return hasil + hadiah;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double saldo = sc.nextDouble();
        double setor = sc.nextDouble();
        
        System.out.println(admin(saldo, setor));
    }
}
