package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        //[일반사원] 한명의 객체를 생성하고 데이터를 저장 후 출력을 하세요.
        RempVO vo = new RempVO("홍길동", 33, "010-1111-1111", "2022-1111-2222", "기획부", false); //Employee → RempVO 상속

        // 출력
        //System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone+"\t"+vo.empDate+"\t"+vo.dept+"\t"+vo.marriage);
        System.out.println(vo); //toString()
    }
}
