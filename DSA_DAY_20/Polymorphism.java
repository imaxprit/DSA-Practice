package DSA_DAY_20;

public class Polymorphism {
    
    public static void main(String[] args) {
        
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(14, 25));
        // System.out.println(calc.sum(2.5f, 7.4f));
        // System.out.println(calc.sum(24, 15, 36));

        Dolphine dolph = new Dolphine();
        dolph.swim();
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b, float c) {
        return a + b + c;
    }
}

class Fish {
    void swim() {
        System.out.println("fishes are under water.");
    }
}

class Dolphine extends Fish {
    void swim() {
        System.out.println("Dolphine have some generic sound");
    }
}
