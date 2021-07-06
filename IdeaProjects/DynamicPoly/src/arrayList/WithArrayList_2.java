package arrayList;

import java.util.*;

 class WithArrayList2 {

  public static void main (String[] args) {
      ArrayList<Student> studentList = new ArrayList<Student>();
      studentList.add(new Student("Sujit"));
      studentList.add(new Student("Siddharth"));
      studentList.add(new Student("Karanpreet"));
      studentList.add(new Student("Hari"));
      studentList.add(3, new Student("Tricha"));
    printStudentList(studentList);

      ArrayList<String> shape = new ArrayList<String>();
      shape.add("Square");
      shape.add("Triangle");
      shape.add(2, "Circle");
      shape.add(1, "Rhombus");
      System.out.println(shape.get(2));
  }

  public static void printStudentList(ArrayList students) {
    for(Object o : students) {
      Student s = (Student) o;
      System.out.println(s.getDetails());
    }
  }
}

class Student {
  private final String name;


  public Student(String name) {
    this.name = name;

  }

  public String getDetails() {
    return
      "name = " + this.name;

  }
}

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
      This is a type-unsafe approach of creating containers. We can add anything into the List which may
      result in a variety of runtime type errors.
  2. When printing, the ArrayList prints the elements in the same sequence as they had been inserted.
      In other words, ArrayList (and any other form of lists, including arrays) remember the sequence
      of insertion. This is an important property which can be safely exploited in the program design.
      There are other containers, e.g. Sets and Maps, where the sequence of insertion is of no 
      consequence. A program using such containers must not depend on them to remember the sequence of
      insertion for its correctness.

  3. Using a non-generic ArrayList is type-unsafe.
*/
