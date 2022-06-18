import java.io.*;
import java.util.*;

public class Solution {
    
    //Method Menu 1
    public static int square(byte sisi){
        return sisi*sisi;
    }
    
    //Method Menu 2
    public static int triangle(byte alas, byte tinggi){
        double hasil = alas*tinggi/2;
        
        return (int) hasil;
    }
    
    //Method Menu 3
    public static double circle(byte jari){
        double hasil;
        
        if(jari % 7 == 0)
            hasil = 22/7 * jari * jari;
        else
            hasil = 3.14 * jari * jari;
        
        return (double)(int)hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        if(a == 1){
            byte sisi = sc.nextByte();
            System.out.println(square(sisi));
        }else if(a == 2){
            byte alas = sc.nextByte();
            byte tinggi = sc.nextByte();
            System.out.println(triangle(alas, tinggi));
        }else if(a == 3){
            byte jari = sc.nextByte();
            System.out.println(circle(jari));
        }else 
            System.out.println("Input yang anda masukan tidak sesuai");
    }
}
