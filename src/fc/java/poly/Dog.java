package fc.java.poly;

public class Dog extends Animal { //Animal -> eat(){ ? }
    // 재정의를 하지 않음(X) --->오류입니다.(재정의를 하세요)

    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }
}
