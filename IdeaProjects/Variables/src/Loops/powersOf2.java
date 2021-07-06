package Loops;
import java.util.*;
public class powersOf2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the number
        int number = scan.nextInt();
        int result = 1;
        if(number >= 2) {

            while (result * 2 < number) {
                // Write the logic
                result *= 2;
            }

            System.out.print(result);

        } else {
            System.out.print("Please enter an integer >= 2");
        }
        scan.close();
    }
}
