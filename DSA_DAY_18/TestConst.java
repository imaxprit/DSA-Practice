package DSA_DAY_18;

public class TestConst {
        
    String name;
    public TestConst() {
        name = "Arpit";
    }

    void display() {
        System.out.println("Student Name is " + name);
    }
    
    public static void main(String args[]) {

        TestConst t1 = new TestConst();
        t1.display();
    }
}
