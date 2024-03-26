package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog 객체를 사용해보자
        //Dog d = new Dog(); Dog 안에 무슨 함수가 있는지 알고 있기 때문에
        //d.eat();
        //Upcasting(업케스팅)
        //부모가 자식을 가리킨다
        Animal ani = new Dog();
        ani.eat();//동물처럼 먹다 출력 → 개처럼 먹다 원함
        ani = new Cat();
        ani.eat(); //동물처럼 먹다 출력 → 고양이처럼 먹다 원함
    }
}
