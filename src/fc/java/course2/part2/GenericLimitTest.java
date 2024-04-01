package fc.java.course2.part2;

import fc.java.model2.AverageCarculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        AverageCarculator<Integer> integerAverageCarculator = new AverageCarculator<>(integers);
        double integerAverage = integerAverageCarculator.calculateAverage();
        System.out.println(integerAverage);

        AverageCarculator<Double> doubleCarculator = new AverageCarculator<>(doubles);
        double doubleAverage = doubleCarculator.calculateAverage();
        System.out.println(integerAverage);
    }
}
