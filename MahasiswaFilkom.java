package inheritance;
public class MahasiswaFilkom extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nama, String nik, boolean jenisKelamin, 
            boolean menikah, String nim, double ipk){
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public String getStatus(){
        String prodi = null, ank = null;
        
        switch (this.nim.charAt(6)) {
            case '2' -> prodi = "Teknik Meniup Gelembung";
            case '3' -> prodi = "Teknik Berburu Ubur Ubur";
            case '4' -> prodi = "Sistem Perhamburgeran";
            case '6' -> prodi = "Pendidikan Chum Bucket";
            case '7' -> prodi = "Teknologi Telepon Kerang";
            default -> {}
        }
        
        if(this.nim.charAt(0)=='2'){
            if(this.nim.charAt(1) == '0')
                ank = "2020";
            else if(this.nim.charAt(1) == '1')
                ank = "2021";
        }else if(this.nim.charAt(0) == '1'){
            switch (this.nim.charAt(1)) {
                case '9' -> ank = "2019";
                case '8' -> ank = "2018";
                case '7' -> ank = "2017";
                default -> {
                }
            }
        }
        
        return prodi + ", " + ank;
    }
    
    public double getBeasiswa(){
        if(this.ipk >= 3.0 && this.ipk <= 3.5)
            return 50;
        else if(this.ipk >= 3.5 && this.ipk <= 4.0)
            return 75;
        
        return 0;
    }
    
    @Override
    public double getPendapatan(){
        return this.getTunjangan() + this.getBeasiswa();
    }
    
    
    @Override
    public String toString(){
        
        return ("\n" + super.toString() + "\nNIM\t\t: "  + this.nim
                + "\nIPK\t\t: " + this.ipk 
                + "\nStatus\t\t: " + this.getStatus());
    }
    
}
