package oops;

class Car{  // Parent class
    public void horn(){
        System.out.println("Pee Pee");
    }
}
class Creta extends Car{  // Child class
    public void horn(){
        System.out.println("poo poo");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Creta creta = new Creta();
        creta.horn();

        Car c = new Car();
        c.horn();

        Car c1 = new Car();
        c1.horn();
    }
}
