package 아이패드주문하기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class IPadPro {
    private int screen; // 11인치, 13인치
    private int color;
    private int memory; // 128GB, 256GB, 512GB, 1TB, 2TB
    private int network; // Wi-Fi, Wi-Fi+Cellular
    private String name;
    private String serialNumber;
    private String productDate;
    private static int cnt = 0; // 제품 생산 대수, 클래스 변수
    
    private Scanner scanner; // 입력 받기 위한 스캐너 참조 변수 생성

    public IPadPro (String name){ // 생성자는 클래스가 객체로 만들어질 때 호출
        this.scanner = new Scanner(System.in);
        this.name = name; // 생성자 호출 시 이름을 전달 받아서 초기값 지정
        Date now = new Date(); // 현재 시간을 운영체제로 부터 받아옴
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); // 문자열 반환
        productDate = sdf.format(now); // 지정된 format 형태로 시간정보가 가공되서 반환됨
        cnt ++;
        productDate += cnt; // 산술연산이 아니고 문자열 더하기(연결)
    }
    public boolean continueOrder() {
        while (true) {
            System.out.println("====== iPad Pro 구입하기 ======");
            System.out.print("[1]주문하기 [2]종료하기\n");
            System.out.print("입력 : ");
            int order = scanner.nextInt();
            if (order == 1) {
                processOrder(); System.out.println("주문을 시작합니다."); return true;
            }
            else if (order == 2) {
                System.out.println("주문을 종료합니다.");  return false;
            }
            else {
                System.out.println("입력이 잘못되었습니다.");
            }
        }
    }

    public void processOrder(){
        
    }

    public void totalamount(){
        int price;
        return;
    }
    
}



//String[] screenList = {"", "11인치", "13인치"};
//String[] colorList = {"", "실버", "스페이스 블랙"};
//String[] memoryList = {"", "256GB", "512GB", "1TB", "2TB"};
//String[] networkList = {"", "Wi-Fi", "Wi-Fi+Cellular"};
//        System.out.println("선택 옵션을 확인합니다.");
//        System.out.println("액정 크기 : "+screenList[screen]);
//        System.out.println("색상 : "+colorList[color]);
//        System.out.println("메모리 크기 : "+memoryList[memory]);
//        System.out.println("네트워크 종류 : "+networkList[network]);
//        System.out.println("===================================");
//        System.out.println("구입을 진행하시겠습니까? 구입 : yes 취소 : no");
//String finalOrder = scanner.next();
//        if (finalOrder.equalsIgnoreCase("yes")) {
//        System.out.println("주문이 진행중입니다."); progressIPadPro();
//            System.out.println("추가 주문을 진행하시겠습니까? 진행 : yes 종료 : no ");
//String additionalOrder = scanner.next();
//            if (additionalOrder.equalsIgnoreCase("yes")){
