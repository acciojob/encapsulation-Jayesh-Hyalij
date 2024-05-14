package encapsulation;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // obj.name = "Jayesh"; // This will cause a compile-time error because name is a private member variable

        // Instead, we can use the setter method to set the value of name
        obj.setName("Jayesh");

        // And we can use the getter method to print the value of name
        System.out.println(obj.getName());
    }
}
