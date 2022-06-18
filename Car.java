package praktikumpbo;

public class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;

    public Car(String carType, String polNum, String merk, boolean status) {
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public boolean isStatus() {
        return status;
    }
    
    public void setStatus(String status){     
        this.status = status.equals("true");
    }
    
    public String getCarType(){
        return carType;
    }
}