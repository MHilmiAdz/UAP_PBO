package polymorphism2;
public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(int penjualan, double komisi, String nama, String noKTP) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }
    
    @Override
    public double gaji() {
        
        return this.penjualan * this.komisi;
    }
    
    @Override
    public String toString(){
        return ("Sales\t\t: " + super.toString() 
                + "\nTotal Penjualan\t: " + (double)this.penjualan
                + "\nBesaran Komisi\t: " + this.komisi);
    }
}
