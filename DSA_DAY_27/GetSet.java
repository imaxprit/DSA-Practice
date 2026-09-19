package DSA_DAY_27;

public class GetSet {
    public static void main(String args[]) {
        // Vehicle v1 = new Vehicle();
        // v1.setColor("Red");
        // System.out.println(v1.getColor());
        // v1.setWheel(4);
        // System.out.println(v1.getWheel());

        // v1.setColor("Green");
        // System.out.println(v1.getColor());
        // v1.setWheel(2);
        // System.out.println(v1.getWheel());

        Student s1 = new Student();
        s1.setName("Arpit Gupta");
        System.out.println(s1.getName());
        s1.setCourse("MCA");
        System.out.println(s1.getCourse());

        s1.setName("Rahul");
        System.out.println(s1.getName());
        s1.setCourse("B.Com");
        System.out.println(s1.getCourse());
    }
}

class Vehicle {
    private String color;
    private int wheel;

    String getColor() {
        return this.color;
    }

    int getWheel() {
        return this.wheel;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setWheel(int newWheels) {
        this.wheel = newWheels;
    }
}

class Student {
    private String name;
    private String course;

    String getName() {
        return this.name;
    }

    String getCourse() {
        return this.course;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setCourse(String newCourse) {
        this.course = newCourse;
    }
}
