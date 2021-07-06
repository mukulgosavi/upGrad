package Functions;

public class returnChar
{
    public static void main(String[] args) {
        String var = test(); // Store function return in this variable
        System.out.print(var); // print the value returned by function test
    }

    public static String test() { // specify data type of return value

        String variable = "Hello"; // define a variable that has a value 9
        return variable; // return this value when the function is called
    }
}
