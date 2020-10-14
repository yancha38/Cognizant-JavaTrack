import java.util.Scanner;

public class FuelConsumption{

    public static void checkConsumption(double qtyOfPetrol, double dist){
        
        double miles = (dist * 0.6214);
        double gallon = (qtyOfPetrol * 0.2642);
        double fuelConsumption = (qtyOfPetrol / dist) * 100;
        double fuelConsumptionGallons = (miles / gallon);
        System.out.println("Liters/100KM");
        System.out.printf("%.2f", fuelConsumption);
        System.out.println();
        System.out.println("Miles/gallons");
        System.out.printf("%.2f", fuelConsumptionGallons);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank:");
        double f = s.nextDouble();
        if(f > 0){
            System.out.println("Enter the distance covered:");
            double d = s.nextDouble();
            if(d > 0){
                checkConsumption(f, d);
            }
            else{
                int m = (int)d;
                System.out.println(m + " is an invalid input");
            }
        }
        else{
            int l = (int)f;
            System.out.println(l + " is an invalid input");
        }
        s.close();
    }
}
