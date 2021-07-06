package com.company;
import java.util.*;
public class cast1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        float f = input.nextFloat();
        double d = input.nextDouble();

        double x = (double) a;
        System.out.print("x="+x);
        //System.out.print(x);

        int y = (int) f;
        System.out.print("y="+y);
        //System.out.print(y);

        float z = (float) d;
        System.out.print("z="+z);
        //System.out.print(z);

    }
}
