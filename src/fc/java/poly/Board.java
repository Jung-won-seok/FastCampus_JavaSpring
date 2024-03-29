package fc.java.poly;

public class Board extends Object{ //toString() → 객체가 생성되면 생성된 메모리의 번지를 문자열로 바꿔서 출력
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
