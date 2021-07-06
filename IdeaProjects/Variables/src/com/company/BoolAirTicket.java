package com.company;
import java.util.*;

public class BoolAirTicket
{
    public static void main(String[] args) {
        int myAge;
        int ageOfBrother;
        //Write your code here
        Scanner input = new Scanner(System.in);

        myAge=input.nextInt();
        ageOfBrother=input.nextInt();

        boolean age=(myAge<=25 && myAge>=1) && (ageOfBrother<=25 && ageOfBrother>=1);


        System.out.println(age);


    }
}
