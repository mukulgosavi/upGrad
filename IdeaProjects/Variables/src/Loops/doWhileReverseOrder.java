package Loops;
import java.util.*;
public class doWhileReverseOrder {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int counter = n;
        do {
            System.out.println(n);
            n--;
        }
        while (n >= 0);
    }
}
