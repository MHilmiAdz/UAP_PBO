package polymorphism2;
public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    //untuk mengeluarkan data umum berupa nama dan noKTP.
    @Override
    public String toString() {
        return (nama + "\nNo. KTP\t\t: " + noKTP);
    }
    
    public double gaji(){
        
        return 0;
    }
    
}
