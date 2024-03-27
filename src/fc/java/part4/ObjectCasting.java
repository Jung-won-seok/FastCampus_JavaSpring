package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        //Animal -> Dog, Cat
        Animal ani = new Dog();
        ani.eat(); // 개처럼 먹다
        ani = new Cat(); // 업케스팅(Upcasting)
        ani.eat(); // 고양이처럼 먹다
        //ani.night(); // 다운케스팅(Downcasting)
        //Cat c = (Cat)ani;
        //c.night();
        ((Cat)ani).night(); //ani를 Cat타입으로 형변환 후 전체 괄호 후 night를 실행한다.
    }
}
