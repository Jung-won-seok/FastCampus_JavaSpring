package fc.java.course2.part1;

import fc.java.model2.IntArray;

public class IntArrayBasic {
    public static void main(String[] args) {
        // 정수5개를 배열에 저장하고 출력
            IntArray list = new IntArray();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(0)); // 1
            System.out.println(list.get(1)); // 2
            System.out.println(list.get(2)); // 3
            System.out.println(list.size()); // 3
    }
}
