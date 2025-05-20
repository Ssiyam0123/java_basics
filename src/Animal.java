public class Animal {
    public void speak() {
        System.out.println("Dogs can bark");
    }

    public void eat (){
        System.out.println("animal eats");
    }

}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("dogs says gau gau");
    }
}
