package DSA_DAY_20;

public class Polymorphism {
    
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        System.out.println(calc.sum(14, 25));
        System.out.println(calc.sum(2.5f, 7.4f));
        System.out.println(calc.sum(24, 15, 36));
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
}
