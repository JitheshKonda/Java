abstract class Animal {
abstract void show();
}
class Dog extends Animal {
void show()
{
System.out.println("This is a Show Method.");
}
}
class Cat extends Animal {
void show() {
System.out.println("This show() Belongs to cat class.");
}
}
public class Main {
public static void main (String[] args){
Cat c = new Cat();
Dog d = new Dog ();
c.show();
d.show();
}
}
