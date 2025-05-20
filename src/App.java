// Multilevel Inheritance Example (commented out)
/*
class GrandFather {
    void fight() {
        System.out.println("Grandpa can fight like Bruce Lee");
    }
}

class Father extends GrandFather {
    void play() {
        System.out.println("Father can play football");
    }
}

class Son extends Father {
    void behavior() {  // Changed from "looser" to more appropriate name
        System.out.println("Son is playful");
    }
}
*/

// Hierarchical Inheritance Example (commented out)
/*
class Phone {
    boolean sms = true;
}

class SmartPhone extends Phone {
    boolean camera = true;
}

class ButtonPhone extends Phone {
    boolean call = true;
}
*/

// Multiple Inheritance using Interfaces
interface Father {
    default void fathersLike() { // Corrected method name casing
        System.out.println("Father likes singing");
    }
}

interface Mom {
    default void momsLike() { // Corrected method name casing
        System.out.println("Mom likes cooking");
    }
}

class Child implements Father, Mom {
    void myHobby() {
        System.out.println("Child likes playing"); // Changed to more appropriate hobby
    }
}

public class App {
    
    public static void main(String[] args) throws Exception {
        /*
         * // Multilevel inheritance test
         * Son s = new Son();
         * s.fight(); // From GrandFather
         * s.play(); // From Father
         * s.behavior(); // From Son
         * 
         * // Hierarchical inheritance test
         * SmartPhone sm = new SmartPhone();
         * System.out.println("SmartPhone can SMS: " + sm.sms);
         * System.out.println("SmartPhone has camera: " + sm.camera);
         */

        // Multiple inheritance test
        // Child child = new Child();
        // child.fathersLike(); // From Father interface
        // child.momsLike(); // From Mom interface
        // child.myHobby();
        // From Child class

        // Calculator calc = new Calculator();

        // double a = calc.add(2.3454, 3.456);
        // int b = calc.add(2, 04);
        // int c = calc.add(2, 3, 4);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        Animal animal = new Dog();
        animal.speak();

    }
}