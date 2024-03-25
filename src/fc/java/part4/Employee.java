package fc.java.part4;
// 사원(VO, DTO)
public class Employee extends Object{ // object 클래스 -> 최상위 클래스 상속
    protected String name;
    protected int age;
    protected String phone;
    protected String empDate;
    protected String dept;
    protected boolean marriage;
    public Employee(){
        super(); // 상위 클래스의 생성자를 호출 -> new Object();
    }
    //toString()

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
