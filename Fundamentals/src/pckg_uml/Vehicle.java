package pckg_uml;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Vehicle {

    protected String model;
    protected String brand;
    protected SimpleDateFormat date;
    protected int vehID;
    protected static int autoInc = 10;

    public Vehicle(){

    }

    public Vehicle(String model, String brand){
        this.brand = brand;
        this. model = model;
        this.vehID = autoInc++;
    }

    public void setDate(String stringDate){
        this.date = date;
    }

    public void startVehicle(){
        System.out.println("Starting: " + this.getClass().getSimpleName());
    }

    public void stopVehicle(){
        System.out.println("Stop: " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", date=" + date +
                ", vehID=" + vehID +
                '}';
    }

    protected void vehInfo(){
        System.out.println(this.toString());
    }
}
