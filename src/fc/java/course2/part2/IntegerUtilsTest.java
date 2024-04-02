package fc.java.course2.part2;

import fc.java.model2.Converter;
import fc.java.model2.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        //정적메서들 참조
        Converter<String, Integer> converter = IntegerUtils::stringtoInt;
        Integer result = converter.convert("123");
        System.out.println(result);
    }
}
