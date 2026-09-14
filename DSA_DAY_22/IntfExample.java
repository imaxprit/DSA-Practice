package DSA_DAY_22;

public class IntfExample {
    
    public static void main(String[] args) {
        A obj = new A();
        obj.m1();
        obj.m2();
    }
}

interface I1 {
    void m1();
}

interface I2 {
    void m2();
}

class A implements I1, I2 {
    public void m1() {
        System.out.println("Method m1 from interface I1");
    } 
    public void m2() {
        System.out.println("Method m2 from interface I2");
    }
}
