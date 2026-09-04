package DSA_DAY_17;

public class Nature {

    public static void main(String args[]) {

        System.out.println("Animal 1");
        Animal1 a1 = new Animal1();
        a1.run("Tiger"); 
        Animal1 b2 = new Animal1();
        b2.run("Dog");

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
    
}