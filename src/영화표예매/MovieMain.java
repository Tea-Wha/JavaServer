package 영화표예매;

import java.util.Scanner;

// 예매하기와 종료하기 메뉴 작성
// 총 좌석은 10개
// 좌석당 가격은 생성자를 통해서 입력
// 좌석 정보에 대한 메소드 작성 ([][][V][][][][][][][])
// 좌석 예약 하기 : 값이 0이면 예약 안된 좌석, 1이면 판매된 좌석
// 총 판매 금액에 대한 메소드 작성
public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket 클래스에 대한 객체 생성 필요
        // 입력 받기 위한 스캐너 생성
        // 메뉴 작성은 무한 반복문으로 구현
        // 1. 좌석 예약하기 메소드 호출
        // 2. 종료하기 누르면 총 판매 금액 표시하고 종료
        MovieTicket ticket = new MovieTicket();
        Scanner scanner = new Scanner(System.in);
        System.out.println("관리자 모드에 진입합니다.");
        ticket.setPrice();
        while (true){
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            int selMenu = scanner.nextInt();
            if (selMenu == 1) {
                ticket.presentSeat();

            }
            else if (selMenu == 2) {
                System.out.println(ticket.totalAmount());
            }
            else {
                System.out.println("잘못 입력했습니다. 다시 입력하세요.");
            }
        }
        
    }
}
