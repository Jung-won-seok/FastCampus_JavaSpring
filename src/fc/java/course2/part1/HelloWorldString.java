package fc.java.course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str = new String("HelloWorld"); //Heap
        System.out.println(str); //Literal pool
        String str1 = "HelloWorld";
        System.out.println(str1);
    }
}
