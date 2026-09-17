package DSA_DAY_25;

public class Student {
    
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String []args) {
        Student s1 = new Student(101, "Arpit");
        s1.display();
    }
}
