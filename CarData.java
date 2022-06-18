package praktikumpbo;

import java.util.ArrayList;

public class CarData {
    ArrayList <Car> carList = new ArrayList();
    
    public void addCar(String carType, String polNum, String merk){
        this.carList.add(new Car(carType, polNum, merk, true));
    } 
    
    public void listOfCar(){
        System.out.println("============================================");
        System.out.println("\t\tDAFTAR MOBIL\t\t");
        System.out.println("============================================");

        for (Car carList1 : carList) {            
            System.out.println("TIPE MOBIL : " + carList1.getCarType());
            System.out.println("NO. POLISI : " + carList1.getPolNum());
            System.out.println("MERK MOBIL : " + carList1.getMerk());
            System.out.println("============================================");
        }
    }
}