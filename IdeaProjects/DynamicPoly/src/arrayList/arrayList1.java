import java.util.ArrayList;                          //ArrayList library imported

class arrayList1 {
    public static void main(String[] args) {
        ArrayList random = new ArrayList();          //An object named 'random' is created for the ArrayList class
        random.add(2);
        random.add(4);
        random.add(5);
        random.add(10);
        random.add("Hari");
        random.add(99);                             //Command for adding a new element
        printArray(random);
    }

    public static void printArray(ArrayList arr) {
        for(Object a : arr) {          //The data type of an element of ArrayList taken to be 'random'
            System.out.println(a);
        }
    }
}