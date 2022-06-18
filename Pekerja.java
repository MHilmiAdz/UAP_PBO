package inheritance;
public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String nip;

    public Pekerja(int jamKerja, int hariKerja, String nip, String nama,
            String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.nip = nip;
    }

    public double getGaji() {
        this.gaji = this.jamKerja * this.hariKerja * 15;
        
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus(){
        this.bonus = (this.hariKerja/7)* 2 * this.jamKerja * 20;
        
        if(this.jamKerja > 7)
            this.bonus += (this.hariKerja - ((this.hariKerja/7) * 2)) 
                    * (this.jamKerja - 7) * 7;
        
        return bonus; 
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getStatus(){
        String dept = null, kantor = null;
        
        switch (this.nip.charAt(0)) {
            case '1' -> kantor = "Mondstadt";
            case '2' -> kantor = "Liyue";
            case '3' -> kantor = "Inazuma";
            case '4' -> kantor = "Sumeru";
            case '5' -> kantor = "Fontaine";
            case '6' -> kantor = "Natlan";
            case '7' -> kantor = "Snezhnaya";
            default -> {}
        }
        
        switch(this.nip.charAt(6)) {
            case '1' -> dept = "Pemasaran";
            case '2' -> dept = "Humas";
            case '3' -> dept = "Riset";
            case '4' -> dept = "Teknologi";
            case '5' -> dept = "Personalia";
            case '6' -> dept = "Akademik";
            case '7' -> dept = "Administrasi";
            case '8' -> dept = "Operasional";
            case '9' -> dept = "Pembangunan";
            default -> {}
        }      
        
        
        return dept + ", " + kantor + " cabang ke- " + this.nip.charAt(2);
    }
    
    @Override
    public double getPendapatan(){  
        return this.getTunjangan() + this.getGaji() + this.getBonus();
    }
    
    @Override 
    public String toString(){     
        return "\n" + super.toString() + "\nBonus\t\t: " + this.getBonus()
                + "\nGaji\t\t: " + this.getGaji() + "$"
                + "\nStatus\t\t: " + this.getStatus();              
    }
    
}
