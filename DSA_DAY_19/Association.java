package DSA_DAY_19;

public class Association {
    public static void main (String args[]) {
        Student student = new Student();
        student.displayInfo();
    }
}


class Address {
    String city = "Lucknow";
    String country = "India";

    void displayAddress() {
        System.out.println("City: "+ city + ", Country: " + country);
    }
}

class Student {
    String name = "Arpit";
    int rollNo = 102;

    void displayInfo() {
        System.out.println("Name: " + name + ", rollno: " + rollNo);
        Address address = new Address();
        address.displayAddress();
    }
}
