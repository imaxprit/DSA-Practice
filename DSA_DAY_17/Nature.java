package DSA_DAY_17;

public class Nature {

    public static void main(String args[]) {

        System.out.println("Animal 1");
        Animal1 a1 = new Animal1();
        a1.run("Tiger"); 
        Animal1 b1 = new Animal1();
        b1.run("Dog");

        System.out.println("Animal 2");
        Animal2 a2 = new Animal2();
        a2.run("Lion");
        a2.eat("Elephant");

    }

}

class Animal1 {

    String name;

    public void run(String newName) {
        name = newName;
        System.out.println(name + " is running.");
    }

}

class Animal2 {
    
    void run(String name) {
        System.out.println(name+" running");
    }

    void eat(String name) {
        System.out.println(name+" eating...!!");
    }
}