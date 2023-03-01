import java.util.Scanner;
public class Diamond {
    public static void main(String[] args){
        int number, x, y, space = 1;
        System.out.print("Enter the number of rows for the diamond: ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        space = number - 1;
        for (y = 1; y <= number; y++)
        {
            for (x = 1; x <= space; x++)
            {
                System.out.print(" ");
            }
            space--;
            for (x = 1; x <= 2 * y - 1; x++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (y = 1; y <= number - 1; y++)
        {
            for (x = 1; x <= space; x++)
            {
                System.out.print(" ");
            }
            space++;
            for (x = 1; x <= 2 * (number - y) - 1; x++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
