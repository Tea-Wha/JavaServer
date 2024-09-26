package 영화표예매;

import java.util.Scanner;

public class MovieTicket {
    // 좌석 10개에 대한 정수형 배열의 인스턴스 변수 생성 (힙 영역)
    int[] seat = new int[10];
    // 좌석당 가격에 대한 인스턴스 필드
    int price;
    Scanner scanner = new Scanner(System.in);
    // 생성자는 좌석당 가격 정보를 객체 생성 시 넣어야 되므로 매개변수가 있는 생성자 필요
    public String setPrice() {
        while (true) {
            System.out.print("좌석당 영화 티켓 가격을 설정 : ");
            int price = scanner.nextInt();
            if (price >= 0 && price <= 20000) return "좌석당 영화 티켓 가격은 "+price+ "원 으로 설정되었습니다.";
            else System.out.println("티켓 가격을 잘못 입력했습니다.");
        }
    }

    // 좌석 예약 현황 메소드 구현
    public void presentSeat(){

    }
    
    // 좌석 상태 표시 메소드 구현
    public void printSeat(){

    }
    
    // 좌석 예약 메소드 구현
    public void selectSeat(){
        
    }


    // 총 판매 금액 메소드 구현 (총 판매 금액은 인스턴스 필드로 만들지 말고 결과로 반환)
    public int totalAmount(){
        int cnt = 0;
        for(int val : seat){
            if (val == 1) cnt++;
        }
        return cnt * price;
    }
}
