package arrayList;
import java.util.*;
public class intArrayList {
    public static void main(String[] args) {


        //Create an ArrayList using Generics here
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        printArray(random);
    }

    public static void printArray(ArrayList<Float> random) {

        //Complete the method declaration here
        for (Float o : random) {

            System.out.println(o);
        }
    }
}

