import java.io.*;
import java.util.*;

public class Solution {
    
    public static char hurufGeser(char a, int b){ 
        if(a > 122 || a < 65)
            return a;
        
        if(a > 90 && a < 97)
            return a;
        
        int hasil = a+b;
        
        if(hasil > 122)
            hasil -= 26;
        else if(hasil > 90 && hasil < 97)
            hasil -= 26;
        
        return (char)hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String kata = sc.nextLine();
        int geser = sc.nextInt();
        String katageser = "";
        
        for(int i = 0; i < kata.length(); i++){
            char a = kata.charAt(i);
            
            katageser += (hurufGeser(a, geser));
        }
        
        System.out.println(katageser);
    }
}
