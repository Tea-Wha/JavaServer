package 스트림활용;
// 스트림으로 바로 생성한 것들은 최종 연산이 끝나면 소멸
// 리스트는 스트림 기능을 계속 사용해도 문제 없음

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("안유진", 21, 1000));
        customerList.add(new TravelCustomer("유나", 21, 2000));
        customerList.add(new TravelCustomer("카즈하", 21, 3000));
        customerList.add(new TravelCustomer("혜린", 18, 800));
        System.out.println("===== 고객 명단 출력 =====");
        // map을 이용해 고객 이름 가져오고 이를 순회하면서 출력
        customerList.stream().map(TravelCustomer::getName).forEach(e-> System.out.print(e+ " "));
        // 고객이 지불한 금액을 가져오기 위해 mapToInt를 이용해 정수 변환
        System.out.println("\n===== 여행 총 비용 계산 =====");
        int total = customerList.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println("총 여행 비용 : " + total);

        System.out.println("===== 20세 이상 명단 출력 =====");
        customerList.stream()
                .filter(e->e.getAge()>=20)
                .map(TravelCustomer::getName)
                .sorted() // 중간 연산
                .forEach(e-> System.out.print(e+ " ")); // 최종 연산
    }
}
