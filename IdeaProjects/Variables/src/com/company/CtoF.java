package com.company;
import java.util.*;
public class CtoF
{
    public static void main(String[] args) {
        float C;
        int c;
        //float F;

        Scanner input = new Scanner(System.in);


        c = input.nextInt();

        C= (float)c;
        float F = 9 * C / 5 + 32;

        System.out.print(F);
    }
}
