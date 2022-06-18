package inheritance;
public class Inheritance {
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Aku", "3923842934", true, false);
        System.out.println(man1.toString() + "\n");
        
        Manusia man2 = new Manusia("Jokowi Oddo", "3923842933", false, true);
        System.out.println(man2.toString()+ "\n");
        
        Manusia man3 = new Manusia("Anies Bawasedan", "3923842935", true, true);
        System.out.println(man3.toString());
        
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", 
                false, false, "205150601111018", 3.70);
        System.out.println(mhs1.toString());
        
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Aditya Fadli", "351923848239", 
                false, false, "195150401111018", 3.90);
        System.out.println(mhs2.toString());
        
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Arya Rizky", "351923848239", 
                false, false, "215150401111018", 3.0);
        System.out.println(mhs3.toString());
        
        Pekerja pekerja1 = new Pekerja(7, 22, "205102439283", 
                "Iqbal Biondy", "351717969", true, true);
        System.out.println(pekerja1.toString());
        
        Pekerja pekerja2 = new Pekerja(7, 20, "306102639283", 
                "M. Hilmi Adzkia", "351717970", true, false);
        System.out.println(pekerja2.toString());
        
        Pekerja pekerja3 = new Pekerja(8, 22, "407102539283", 
                "Amalia", "351717981", false, true);
        System.out.println(pekerja3.toString());
        
        
        Manajer manajer1 = new Manajer(9, 20,"204837283728", "Lyra Hertin", "351707384392",false, false, 1500);
        System.out.println(manajer1.toString());
        
        Manajer manajer2 = new Manajer(9, 20,"407837383728", "Madun", "351707384332",true, false, 500);
        System.out.println(manajer2.toString());
        
        Manajer manajer3 = new Manajer(9, 20,"506837483728", "Bowo", "351707384342",false, false, 2000);
        System.out.println(manajer3.toString());
    }
}
