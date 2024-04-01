package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> stdScorse = new HashMap<>();
        stdScorse.put("Kim", 95);
        stdScorse.put("Lee", 85);
        stdScorse.put("Park", 90);
        stdScorse.put("Choi", 80);

        System.out.println("Kim`s score:" +" "+stdScorse.get("Kim"));
        System.out.println("Lee`s score:" +" "+stdScorse.get("Lee"));

        stdScorse.put("Park", 90);
        System.out.println("Park`s score:" +" "+stdScorse.get("Park"));

        stdScorse.remove("Choi");
        System.out.println("Choi`s score:" +" "+stdScorse.get("Choi"));

        for(Map.Entry<String, Integer> entry : stdScorse.entrySet()){
            System.out.println(entry.getKey() + "`s score:" + entry.getValue());
        }

    }
}
