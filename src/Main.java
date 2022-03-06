import javax.script.ScriptContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Address add1 = new Address("33", "X Lane", "Apt 6A", "Brooklyn", "NY", "11217");
        Address add2 = new Address(add1);
        Address add3 = new Address("1313 Mockingbird Lane, Springfield, MO 65123");

        Package thing1 = new Package(7.4, add1, add3);

        PostageCalculator cost = new PostageCalculator();
        System.out.println("EXAMPLE1");
        System.out.println("Origin ZipCode: 11223");
        System.out.println("Destination ZipCode: 65123");
        System.out.println("Weight: 5.2 lbs");
        System.out.println("Price of Shipping: $" + Math.round(cost.calculatePostage("11223", "65123", 5.2)*100.0)/100.0 + "\n");

        System.out.println("EXAMPLE2");
        System.out.println("Origin ZipCode: 11217");
        System.out.println("Destination ZipCode: 65123");
        System.out.println("Weight: 10 lbs");
        System.out.println("Price of Shipping: $" + Math.round(cost.calculatePostage2(add1, add3, 10)*100.0)/100.0 + "\n");

        System.out.println("EXAMPLE3");
        System.out.println("Origin ZipCode: 11217");
        System.out.println("Destination ZipCode: 65123");
        System.out.println("Weight: 7.4 lbs");
        System.out.println("Price of Shipping: $" + Math.round(cost.calculatePostage3(thing1)*100.0)/100.0);

        Scanner c = new Scanner(System.in);
        String choice = "1";
        while (choice.equals("1")){
            System.out.print("\n");

            Scanner x = new Scanner(System.in);
            System.out.print("Type in the weight of your package: ");
            double weight = x.nextDouble();

            Scanner x2 = new Scanner(System.in);
            System.out.print("Type in the address of the origin: ");
            String start = x2.nextLine();

            Scanner x3 = new Scanner(System.in);
            System.out.print("Type in the address of the destination: ");
            String end = x3.nextLine();

            Address origin = new Address(start);
            Address destination = new Address(end);

            System.out.println("Price of Shipping: $" + Math.round(cost.calculatePostage2(origin, destination, weight)*100.0)/100.0);
            System.out.print("If you would like to calculate another package, type 1.\nIf you would like to stop, type 2. ");
            choice = c.nextLine();
        }
    }
}
