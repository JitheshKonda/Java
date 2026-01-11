A constructor is a special method in a class that is called automatically when an object is created to initialize its attributes. It has the same name as the class and no return type

##Constructor example program
class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);
        s1.display();
        s2.display();
    }
}


##Constructor Types
// Class with different constructors
class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    Student(String n, int a) {
        name = n;
        age = a;
    }
    Student(Student s) {
        name = s.name;
        age = s.age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class ConstructorTypes{
    public static void main(String[] args) {
        Student s1 = new Student();    // Using Default Constructor
        s1.display();
        Student s2 = new Student("Alice", 20);     // Using Parameterized Constructor 
        s2.display();   
        Student s3 = new Student(s2);    // Using Copy Constructor
        s3.display();
    }
}

