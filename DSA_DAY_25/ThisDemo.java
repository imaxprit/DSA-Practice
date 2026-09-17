package DSA_DAY_25;

public class ThisDemo {

    int num = 10;
    void m1(int num) {
        System.out.println("1. num " + num);
        System.out.println("2. num " + this.num);
    }
    
    public static void main(String args[]) {
        ThisDemo obj = new ThisDemo();
        obj.m1(25);
    }
}
