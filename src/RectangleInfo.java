import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);

         double width = 0;
         double length = 0;
         boolean doneWidth = false;
         boolean doneLength = false;
         double perimeter = 0;
         double area = 0;
         double diagonal = 0;
         String trash = "";

         do {
             System.out.print("Enter width: ");
             if (in.hasNextDouble())
             {
                 width = in.nextDouble();
                 in.nextLine();
                 doneWidth = true;
             }
             else
             {
                 trash = in.nextLine();
                 System.out.println(" You entered " + trash + " Which is not a valid input try again!;");
             }
         }while (!doneWidth);

        do {
            System.out.print("Enter length: ");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                doneLength = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(" You entered " + trash + " Which is not a valid input try again!;");
            }
        }while (!doneLength);

        area = (width * length);
        perimeter = (width + length) * 2;
        diagonal = Math.sqrt((length*length) + (width*width));
        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
        System.out.println("diagonal of the rectangle is: " + diagonal);

    }
}
