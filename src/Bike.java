import java.util.ArrayList;

public class Bike {
    private int wheels;
    private String manufacturer;
    private int year;

    //constructor

    public Bike(int wheels, String manufacturer, int year){
        this.wheels = wheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    //default/no argument constructor
    public Bike(){this(2, "Schwinn", 2014);}

    //setter

    public void setWheels(int wheels){this.wheels = wheels;}
    public void setManufacturer(String manufacturer){this.manufacturer = manufacturer;}
    public void setYear(int year){this.year = year;}

    //getter

    public int getWheels(){return this.wheels;}
    public String getManufacturer(){return this.manufacturer;}
    public int getYear(){return this.year;}

    //total wheels
    public static int getTotalWheels(ArrayList<Bike> bikeList) {
        int totalWheels = 0;
        for (Bike bike : bikeList) {
            totalWheels += bike.wheels;
        }
        return totalWheels;
    }
    //to String
    public String toString() {
        return("This bike has: " + wheels + " wheels  Manufactured by: " + manufacturer + "  Made in: " + year);
    }

}
