package practiceQuestions;

public class valid {
    public static void main(String[] args) {

    }
}
class Person {
    private String eyeColor;
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}

class Adult extends Person {
    protected int age;

    public Adult(String name, int age) {
        super(name);
        this.age = age;
    }
}

class Policeman extends Adult {
    protected final String job;

    public Policeman(String name, int age) {
        super(name, age);
        this.job = "policeman";
    }
}