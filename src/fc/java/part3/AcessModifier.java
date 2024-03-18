package fc.java.part3;

import fc.java.model.MemberDTO;

public class AcessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name = "홍길동";
       // dto.age = "30"  접근불가
        dto.phone = "010-1111-1111";
        System.out.println(dto.name+"\t"+dto.phone);
        dto.play();
    }
}
