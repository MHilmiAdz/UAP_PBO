package praktikumpbo;

public class MainClass {
    public static void main(String[] args) {
        CarRider abisena = new CarRider("Abisena Mahendra", 19, "483979329465");
        CarRider bondan = new CarRider("Bondan Bramantyo", 20, "081111165433");
        CarRider naufal = new CarRider("Muhammad Naufal", 31, "0812222124365");
        CarRider hilmi = new CarRider("M. Hilmi Adzkia", 18, "081254542633");
        
        CarData data = new CarData();
        
        data.addCar("SPORT", "B 1215 ZZ", "Ferrari");
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");
        
        data.listOfCar();
        
        RentArchive arsip = new RentArchive();
        
        System.out.println("");
        
        arsip.Rent(hilmi, data.carList.get(2), 10);
        arsip.Rent(abisena, data.carList.get(1), 9);
        arsip.Rent(bondan, data.carList.get(0), 3);
        arsip.Rent(naufal, data.carList.get(1), 1);
        
        System.out.println("");
        
        arsip.info();
        
        
        
        
        
    }
    
}
