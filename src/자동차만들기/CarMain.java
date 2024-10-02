package 자동차만들기;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        int distance;
        int weather;
        CarInterface car;
        Scanner scanner = new Scanner(System.in);
        String[] d = {"", "400", "150", "200", "300"};
        while (true) {
            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
            int departure = scanner.nextInt();
            if (departure >= 1 && departure <= 4) {distance = Integer.parseInt(d[departure]); break;}
            else System.out.println("입력이 잘못되었습니다.");
        }
        int passenger;
        while (true) {
            System.out.print("이동할 승객 수 입력 : ");
            passenger = scanner.nextInt();
            if (passenger >= 1 && passenger <= 100) break;
            else System.out.println("입력이 잘못되었습니다.");
        }
        while (true) {
            System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carsel = scanner.nextInt();
            if (carsel == 1) {car = new CarInterface.SportsCar(); break;}
            else if (carsel == 2) {car = new CarInterface.Sedan(); break;}
            else if (carsel == 3) {car = new CarInterface.Bus(); break;}
            else System.out.println("차량 선택이 잘못되었습니다.");
        }
        while (true) {
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            int sw = scanner.nextInt();
            if (sw == 1) {car.option(true); break;}
            else if (sw == 2) {car.option(false); break;}
            else {System.out.println("부가 기능 입력이 잘못되었습니다.");}
        }
        while (true) {
            System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
            weather = scanner.nextInt();
            if (weather >= 1 && weather <= 3) break;
            else System.out.println("날씨 입력이 잘못되었습니다.");
        }
        car.passenger(passenger);
        car.distance(distance);
        car.price();
        car.fuelNumber();
        car.time(weather);
        car.calc();
    }
}