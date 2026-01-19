abstract class Person {
 abstract void display();
   void show () {
System.out.println("Persons play a different roles.");
}
}
class Student extends Person {
void Role () {
System.out.println("A person plays a Student Role.");
}
void display () {
System.out.println("Verified,The student also a Person.");
}
}
class Employee extends Student {
void Details () {
System.out.println("The Person plays a employee Role.");
}
void display(){
System.out.println("Valid,Employee also a Person.");
}
}
class Main {
public static void main (String [] args) {
Employee e = new Employee () ;
e.show();
e.display();
e.Details();
e.Role();
}
}
