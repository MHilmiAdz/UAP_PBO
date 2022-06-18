package inheritance;
 public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(int jamKerja, int hariKerja, String nip, String nama,
            String nik, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, nip, nama, nik, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
    
    @Override
    public double getPendapatan(){  
        return this.getTunjangan() + 15 + this.getGaji() + this.getBonus();
    }
    
    
    @Override
    public double getBonus() { 
        return super.getBonus() + (super.getBonus()*0.3);
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nLama Kerja\t: " + this.lamaKerja + " Hari";
    }
    
}
