class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats meat");
    }
    void work() {
        super.eat();  // calls parent method
        eat();        // calls child method
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
