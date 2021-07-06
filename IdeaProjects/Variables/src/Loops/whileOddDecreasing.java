package Loops;

public class whileOddDecreasing
{
    public static void main(String[] args) {
        int num = 25;
        while(num >= 0)
        {
            if(num % 2 != 0)
            {
                System.out.print(num + " ");
            }
            // write decrement/increment condition here
            num--;
        }
    }
}
