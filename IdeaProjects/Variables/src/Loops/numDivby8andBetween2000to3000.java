package Loops;

public class numDivby8andBetween2000to3000 
{
    public static void main(String[] args) {

        boolean a;
        for (int i = 2000; i<3000; i++)
        {
            if (i%8==0 && i%6!=0) {
                System.out.print(i + " ");
            }
        }
    }
}
