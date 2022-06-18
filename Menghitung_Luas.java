import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if(a == 1){
            int sisi = sc.nextInt();
            
            Persegi panjang = new Persegi(sisi);
            panjang.printLuas();
            
        }else if(a == 2){
            int alas = sc.nextInt();
            int tinggi = sc.nextInt();
            
            Segitiga bermuda = new Segitiga(alas, tinggi);
            
            bermuda.printLuas();
            
        }else if(a == 3){
            int jari = sc.nextInt();
            
            Lingkaran sempurna = new Lingkaran(jari);
            sempurna.printLuas();
            
        }else{
            Salah akuapa = new Salah();
            akuapa.printSalah();
        }
    }
}

class Persegi {
    private int sisi;
    
    Persegi(int sisi){
        this.sisi = sisi;
    }
    
    public void printLuas(){
        System.out.println(sisi*sisi);
    }
}

class Segitiga {
    private int alas;
    private int tinggi;
    
    Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void printLuas(){
        System.out.println((int)((alas*tinggi)/2));
    }
    
}
class Lingkaran {
    private int jari;
    
    Lingkaran(int jari){
        this.jari = jari;
    }
    
    public void printLuas(){
        if(jari%7 == 0)
            System.out.println((double)(int)(22/7 * jari * jari));
        else
            System.out.println((double)(int)(3.14 * jari * jari));
    }
}

class Salah {
    final String salah = "Input yang anda masukan tidak sesuai";
    
    Salah(){
        
    }
    
    public void printSalah(){
        System.out.println(salah);
    }
}
