package DSA_DAY_35;

public class InstanceMethod {
    
    public static void main(String args[]) {

        Person p = new Person();
        p.greet();
        p.add(4, 5);
        System.out.println("Correct");
    }
}

class Person {
        String name = "Raghav";

        // Instance method
        void greet() {
            System.out.println("Hello " + name + "!");
        }


        // Instance method with parameter
        void add(int a, int b) {

            int x = a;
            int y = b;
            int z = x + y;

            System.out.println("Sum: "+ z);
        }
}
