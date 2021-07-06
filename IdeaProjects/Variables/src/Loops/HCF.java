package Loops;
import java.util.*;
public class HCF {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter number 1 in the Input Console
        int num1 = scan.nextInt();
        // Enter number 2 in the Input Console
        int num2 = scan.nextInt();

        int hcf = 0;
        // Write logic
        while (num2 > 0) {
            hcf = num2;
            num2 = num1 % num2;
            num1 = hcf;
        }
        System.out.print(hcf);
        scan.close();
    }
}