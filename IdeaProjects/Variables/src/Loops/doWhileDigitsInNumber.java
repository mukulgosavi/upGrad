package Loops;
import java.util.*;
public class doWhileDigitsInNumber
{
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int count=0;
        do
        {
            n /= 10;
            count++;
        }
        while(n!=0);
        System.out.println(count);

    }
}
