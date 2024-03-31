package fc.java.course2.part1;

import fc.java.model2.*;

//CC를 이용하여 BB를 동작시키는 프로그래밍(인터페이스 기반의 프로그래밍)
public class InterfaceAPI {
    public static void main(String[] args) {
        CC c = new BB();
        c.x(); //동적바인딩
        c.y();
        c.z();
    }
}
