package Loops;
import java.util.*;
public class oneToN {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i ++;
        }
    }
}
