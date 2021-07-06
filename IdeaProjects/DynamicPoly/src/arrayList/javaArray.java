package arrayList;

public class javaArray {
    public static void main(String[] args) {
        int random[] = {2, 4, 5, 10};
        printArray(random);
    }

    public static void printArray(int[] arr) {

        // Declare printArray method here
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }

    }
}