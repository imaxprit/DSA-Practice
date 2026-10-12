package DSA_DAY_35;

public class StaticMethod {
    
    public static void main (String args[]) {
        Method obj = new Method();
        obj.simpleDisplay();

        // obj.staticDisplay();
    }
}

class Method {

    // static variable
    static int a = 40;

    // instance variable
    int b = 50;

    void simpleDisplay() {
        System.out.println(a);
        System.out.println(b);
    }

    // declaration of a static method
    static void staticDisplay() {
        System.out.println(a);
    }

}
