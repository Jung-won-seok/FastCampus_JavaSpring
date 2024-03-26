package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        //Upcasting(업케스팅) : Dog.java(X) Dog.class(O)
        Animal ani = new Dog();
        ani.eat(); // Animal----(동적바인딩)---->Dog

        ani = new Cat();
        ani.eat(); // Animal----(동적바인딩)---->Cat
    }
}
