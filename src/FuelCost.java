import java.util.Scanner;

public class FuelCost
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double costpergallon = 0;
        double costtodrive100miles = 0;
        double fulltankDistance = 0;
        boolean doneGallon = false;
        boolean donemph = false;
        boolean donecapacity = false;
        String trash = "";

        do {
            System.out.println("Enter the gallons of the fuel: ");
            if (in.hasNextDouble())
            {
                gallons = in.nextDouble();
                in.nextLine();
                doneGallon = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered" + trash +  " Which is not a valid input try again!");
            }
        }while (!doneGallon);

        do {
            System.out.println("Enter the miles per gallon : ");
            if (in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                donemph = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered" + trash +  " Which is not a valid input try again!");
            }
        }while (!donemph);

        do {
            System.out.println("Enter the cost per gallon : ");
            if (in.hasNextDouble())
            {
                costpergallon = in.nextDouble();
                in.nextLine();
                donecapacity = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered" + trash +  " Which is not a valid input try again!");
            }
        }while (!donecapacity);

         costtodrive100miles = costpergallon / gallons * 100;
         fulltankDistance = gallons * mpg;

        System.out.println("The cost to drive 100 miles is $" + costtodrive100miles);
        System.out.println("The full tank distance is " + fulltankDistance + " miles");

    }
}
