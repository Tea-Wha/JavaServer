package 다형성Driver;

import java.util.Scanner;

public class PolyDriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver("TaeWha");
        Scanner scanner = new Scanner(System.in);
        System.out.println("운전하고 싶은 차를 선택 [1]스포츠카 [2]버스 [3]택시 [4]무언가");
        int select = scanner.nextInt();
        switch(select){
            case 1:
                driver.drive(new SportsCar()); break;
            case 2:
                driver.drive(new Bus()); break;
            case 3:
                driver.drive(new Taxi()); break;
            case 4:
                driver.drive(new Vehicle()); break;
            default:
                System.out.println("선택한 차량이 준비되어있지 않습니다.");
        }
    }
}

class Driver {
    String name;
    Driver(String name){
        this.name = name;
    }
    void drive(Vehicle v){ // 부모 클래스에 걸음
        System.out.println(name+"의 ");
        v.run(); // run 메소드 걸음
    } // 오버로딩은 하나의 함수에 여러개 타입의 변수를 지정할 수 있음
    // 오버라이딩은 상속을 통해서 하나의 함수를 이용하여 다양한 타입의 출력을 가능하게 한다.
}
class Vehicle { // 부모 클래스
    void run(){
//        System.out.println("탈 것이 달립니다."); // 명령문까지 같은 타입을 사용할 필요는 없다?
    } // 메소드는 동일하게 들어가야 한다.
}
class SportsCar extends Vehicle {
    @Override
    void run(){
        System.out.println("스포츠카가 달립니다.");
    }
}
class Bus extends Vehicle{
    @Override
    void run(){
        System.out.println("버스가 달립니다.");
    }
}
class Taxi extends Vehicle{
    @Override
    void run(){
        System.out.println("택시가 달립니다.");
    }
}