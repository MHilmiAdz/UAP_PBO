package polymorphism2;
public class Polymorphism2 {
    public static void main(String[] args) {
        
        //KONSEP POLYMORPHISM DI INSTANTIASINYA
        Pegawai[] employees = new Pegawai[9];
        
        employees[0] = new PegawaiTetap(2000000.0, "Bayu", "350728490327424092342");
        employees[1] = new PegawaiHarian(8500.0, 40, "Edo", "350728490327424092343");
        employees[2] = new Sales(50, 50000.0, "Tika", "350728490327424092344");
        employees[3] = new PegawaiTetap(5000000.0, "Kursgezagt", "350728490327424092346");
        employees[4] = new PegawaiTetap(3000000.0, "Hilmi", "350728490327424092347");
        employees[5] = new Sales(100, 20000.0, "Wafa", "350728490327424092348");
        employees[6] = new Sales(10, 1000000, "Windah", "350728490327424092349");
        employees[7] = new PegawaiHarian(10000.0, 30, "Bondan", "35072849032742409231");
        employees[8] = new PegawaiHarian(5000.0, 70, "Bara Ilham", "350728490327424092321");
        
        //For-loop untuk mengeluarkan semua yang ada di dalam Array employees
        for (Pegawai employee : employees) {
            System.out.println(employee + "\nPendapatan \t: Rp " + (int)(employee.gaji()) + "\n");
        }
        
        
        
    }
    
}
