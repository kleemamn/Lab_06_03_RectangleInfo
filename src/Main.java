import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = 0;
        int width = 0;
        int perimeter = 0;
        int area = 0;
        double hypotenuse;
        String trash = "";

        System.out.print("Enter the length of the rectangle: ");
        if(in.hasNextDouble())
        {
            length = in.nextInt();
            in.nextLine();
        }

          else
           {
            trash = in.nextLine();
               System.out.println("\n You said the length of the rectangle is: " + length);
               System.out.println("Run the program again and enter a valid amount.");
               System.exit(0);
           }

        System.out.print("Enter the width of the rectangle: ");
        if(in.hasNextDouble())
        {
            width = in.nextInt();
            in.nextLine();
        }

          else
           {
              trash = in.nextLine();
               System.out.println("\n You said the width of the rectangle was: " + width);
               System.out.println("Run the program again and enter a valid amount.");
               System.exit(0);
           }

        perimeter = width + width + length + length;
        area = width * length;
        hypotenuse = Math.sqrt(width * width + length * length);

        System.out.print("The perimeter of the rectangle is: " + perimeter);
            System.out.println();
        System.out.print("The area of the rectangle is: " + area);
            System.out.println();
        System.out.print("The length of the diagonal is: " + hypotenuse);
            System.out.println();

    }
}