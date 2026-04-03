class Person {
    private int age = 30;
    public String name = "Daegun";
}

public class MyPerson {
    public static void main(String[] args) {
    Person p = new Person();
    System.out.println("Name: " + p.name);
    System.out.println("Age: " + p.age);
}
}