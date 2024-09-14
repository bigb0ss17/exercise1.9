import java.util.ArrayList;

public class BikeTester {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        System.out.println(bike1);

        Bike bike2 = new Bike();
            bike2.setManufacturer("Cannondale");
            bike2.setYear(2017);
        System.out.println(bike2);

        ArrayList bikeList = new ArrayList();
        bikeList.add(bike1);
        bikeList.add(bike2);
        System.out.println(bikeList);

        int totalWheels = Bike.getTotalWheels(bikeList);
        System.out.println("Total number of wheels: " + totalWheels);

        // Find the oldest bike's year
        if (bike1.getYear() < bike2.getYear()){
            System.out.println("The oldest bike was made in: " + bike1.getYear());
        }else {
            System.out.println("The oldest bike was made in: " + bike2.getYear());
        }

    }
}
