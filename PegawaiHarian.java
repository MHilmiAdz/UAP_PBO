package polymorphism2;
public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(double upahPerJam, int totalJam, String nama, String noKTP) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        if(totalJam <= 40)
            return this.upahPerJam * this.totalJam;
        else if(totalJam > 40)
            return this.totalJam * this.upahPerJam * 1.5; 
            
        return 0;
    }
    
    @Override
    public String toString() {
        return ("Pegawai Harian\t: " + super.toString() 
                + "\nUpah/jam\t: Rp " + this.upahPerJam
                + "\nTotal jam kerja\t: " + (double)this.totalJam);
    }
    
    
}
