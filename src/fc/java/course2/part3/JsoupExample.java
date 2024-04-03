package fc.java.course2.part3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupExample {
    public static void main(String[] args) {
        String url = "https://sum.su.or.kr:8888/bible/today?base_de=2023.03.20";
        //예외처리를 해야된다.
        try {
            Document document = Jsoup.connect(url).get();

            Element bibleText = document.getElementById("bible_text");
            Element bibleinfo_box = document.getElementById("bibleinfo_box");


            System.out.println(bibleText.text());
            System.out.println(bibleinfo_box.text());

            Elements num = document.select(".num");
            Elements info = document.select(".info");

            for (int i = 0; i < num.size(); i++) {
                System.out.println(num.get(i).text()+":"+info.get(i).text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
