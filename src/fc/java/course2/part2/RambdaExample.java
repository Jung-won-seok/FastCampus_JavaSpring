package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class RambdaExample {
    public static void main(String[] args) {
        //MathOperation add = (int x, int y) -> {return x+y;};
        //코드를 간결하게 쓸 수 있고 확장, 구현 쉽다.
        MathOperation add = (x,y) ->  x+y;
        MathOperation multi = (x,y) ->  x*y;
        int result = add.operation(10, 20);
        System.out.println(result);
        int mulresult = multi.operation(10, 20);
        System.out.println(mulresult);
    }
}
