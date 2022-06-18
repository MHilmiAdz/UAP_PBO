package praktikumpbo;

import java.util.ArrayList;

public class RentArchive {
    private ArrayList<CarRent> rentData = new ArrayList();

    public void Rent(CarRider rider, Car car, int rentDur){
        if(car.isStatus() == true){
            rentData.add(new CarRent(rider, car, rentDur));
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus("false");
        }else
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
    }
    
    public void info(){
        System.out.println("============================================");
        System.out.println("\tINFORMASI\tPELANGGAN\t\t");
        System.out.println("============================================");  
        
        for (CarRent rentData1 : rentData) {
            System.out.println("NAMA PEMINJAM \t: " + rentData1.getRider().getName());
            System.out.println("TIPE MOBIL \t: " + rentData1.getCar().getCarType());
            System.out.println("NO. POLISI \t: " + rentData1.getCar().getPolNum());
            System.out.println("LAMA RENTAL \t: " + rentData1.getRentDur());
            System.out.println("============================================");
        }
        
    }
}