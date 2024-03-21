package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //a + b = ?
        int sum = hap(a,b);
        System.out.println("sum = " + sum);
    }
    // Q . 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 함수를 정의하시오.
    public static int hap(int a, int b){
        int v = a + b;
        return v;
    }
}
