import java.sql.SQLOutput;
import java.util.Scanner;

public class CtoFConverter
{
    public static  void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double Ctemp = 0;
        double Ftemp = 0;
        boolean donetemp = false;
        String trash = "";

        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                Ctemp = in.nextDouble();
                in.nextLine();

                Ftemp = Ctemp * 9.0 / 5 + 32;
                donetemp = true;
            }
            else
            {
              trash = in.nextLine();
                System.out.println("You entered " + trash +  " Which is not a valid input try again!");
            }

        } while (!donetemp);
        System.out.println("The fahrenheit temperature for " + Ctemp + "C is " + Ftemp);


    }
}