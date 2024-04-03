package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsontoJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동", 30, "naver.com");
        // JSON -> {"name" : "홍길동", "age" : 30, "email" : "naver.com"}
        Gson gson = new Gson();
        String json = gson.toJson(mvo);
        System.out.println(json);
    }
}
