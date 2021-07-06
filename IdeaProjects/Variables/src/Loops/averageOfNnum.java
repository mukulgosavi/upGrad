package Loops;
import java.util.*;
public class averageOfNnum {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int sum=0,number;
        for (int i=0;i<n;i++){
            number=input.nextInt();
            sum=sum+number;
        }
        int average=sum/n;
        System.out.print(average);
    }
}

