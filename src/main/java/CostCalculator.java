import java.util.Scanner;

public class CostCalculator {

    public static double getTotalCost(double totalFuelNeeded, double fuelPricePerLiter) {
        return totalFuelNeeded*fuelPricePerLiter;

    }


    public static void main(String[] args){
        System.out.println("Enter the distance in km: ");
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        System.out.println("Enter the fuel price per liter: ");
        double fuelPricePerLiter = scanner.nextDouble();
        double totalFuelNeeded = distance/20;
        double totalCost = getTotalCost(totalFuelNeeded, fuelPricePerLiter);
        System.out.println("The total cost of the trip is: " + totalCost);
    }
}
