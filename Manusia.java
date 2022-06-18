package inheritance;
public class Manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    
    public double getTunjangan(){
        if(this.menikah){
            if(this.jenisKelamin)
                return 25;
            else 
                return 20;
        }
        
        return 15;
    }
    
    public double getPendapatan(){
        
        return this.getTunjangan();
    }
    
    @Override
    public String toString(){
        String gender = this.jenisKelamin ? "Laki-Laki" : "Perempuan";
        return "Nama\t\t: " + this.nama
                + "\nNIK\t\t: " + this.nik
                + "\nJenis Kelamin\t: " + gender
                + "\nPendapatan\t: " + this.getPendapatan() + "$";
    }
}
