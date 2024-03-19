package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;
    // setter method
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    // getter method
    public String getName(){
        return name; // this.name
    }
    public int getAge(){
        return age; // this.age
    }
    public String getPhone(){
        return phone; // this.name
    }
}
