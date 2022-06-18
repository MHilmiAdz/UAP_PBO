package polymorphism2;
public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(double upah, String nama, String noKTP) {
        super(nama, noKTP);
        this.upah = upah;
    }
    
    @Override
    public double gaji() {
        
        return this.upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }
    
    @Override
    public String toString(){
        
        return "Pegawai Tetap\t: " + super.toString() 
                + "\nUpah\t\t: " + this.upah;
    }    
}
