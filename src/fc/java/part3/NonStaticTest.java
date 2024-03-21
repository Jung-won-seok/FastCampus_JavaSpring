package fc.java.part3;

public class NonStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NonStaticTest st = new NonStaticTest();
        int sum = st.hap(a,b);
        System.out.println("sum = " + sum);
    }
    public int hap(int a, int b){
        int v = a+b;
        return v;
    }
}
