package arrayList;
import java.util.*;
public class unsortedArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            System.out.print(arr[i]+" ");
        }
        int k = s.nextInt();
        search(arr, k);
    }


    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        // Write your code
        boolean found = false;



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == k) {
                    found = true;
                    break;
                }
            }

        }
        System.out.println(found);
    }
}
