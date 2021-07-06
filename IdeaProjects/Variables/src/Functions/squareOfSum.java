package Functions;
import java.util.*;
public class squareOfSum
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(squareOfSum(number1, number2));
    }

    // Write the function squareOfSum here
    public static int squareOfSum(int var1, int var2)
    {
        int sum=(var1+var2);
        int squareOfSum = sum*sum;

        return squareOfSum;
    }
}
