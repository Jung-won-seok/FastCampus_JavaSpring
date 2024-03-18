package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //자동차 정보를 키보드로 부터 입력을 받아서 DB에 저장을 하세요.(JDBC)
        Scanner scan = new Scanner(System.in);
        System.out.println("자동차 일련번호:");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 이름:");
        String carName = scan.nextLine();

        System.out.println("자동차 가격:");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 소유자:");
        String carOwner = scan.nextLine();

        System.out.println("자동차 년식:");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 타입:"); //G(휘발유), D(경유)
        String carType = scan.nextLine();
        //자동차 데이터를 이동하기 위한 바구니가 필요하다.(DTO, VO)
        //클래스로 CarDTO,carVO 모델 설계
        //carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);
        //System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carOwner+"\t"+carType);
        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;

        CarDAO dao = new CarDAO(); //car객체에 모양을 만들고
        dao.carInsert(car); //DB에 전달
        dao.carSelect();
    }
}
