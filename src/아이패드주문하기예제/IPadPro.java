package 아이패드주문하기예제;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static 아이패드주문하기예제.Common.*;

import static java.lang.Thread.sleep;

public class IPadPro {
    private int screen; // 11인치, 13인치
    private int color;
    private int memory; // 256GB, 512GB, 1TB, 2TB
    private int network; // Wi-Fi, Wi-Fi+Cellular
    private String name;
    private String serialNumber;
    private String productDate;
    private static int cnt = 0; // 제품 생산 대수, 클래스 변수
    private int price = 1499000; // 제품 구매 가격

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
            System.out.print("구입을 진행하려면 yes / 종료는 no : ");
            String isContinue = scanner.next();
            if (isContinue.equalsIgnoreCase("yes")) return true;
            else return false;
        }
    }
    public void setScreen(){
        while (true){
            System.out.print("[1]11인치 [2]13인치\n");
            System.out.print("디스플레이 선택 : ");
            screen = scanner.nextInt();
            if (screen == 1) return;
            else if (screen == 2) {price += 500000; return;}
            System.out.println("디스플레이 선택이 잘못되었습니다.");
        }
    }
    public void setColor(){
        while (true){
            System.out.print("[1]실버 [2]스페이스 블랙\n");
            System.out.print("색상 선택 : ");
            color = scanner.nextInt();
            if (color == 1 || color ==2) return;
            System.out.println("색상 선택이 잘못되었습니다.");
        }
    }
    public void setMemory(){
        while (true){
            System.out.print("[1]256GB [2]512GB [3]1TB [4]2TB\n");
            System.out.print("메모리 선택 : ");
            memory = scanner.nextInt();
            if (memory == 1) return;
            else if (memory == 2) {price += 300000; return;}
            else if (memory == 3) {price += 900000; return;}
            else if (memory == 4) {price += 1500000; return;}
            System.out.println("메모리 선택이 잘못되었습니다.");
        }
    }
    public void setNetwork() {
        while (true) {
            System.out.print("[1]Wi-Fi [2]Wi-Fi+Cellular\n");
            System.out.print("네트워크 선택 : ");
            network = scanner.nextInt();
            if (network == 1) return;
            else if (network == 2) {price += 300000; return;}
            System.out.println("네트워크 선택이 잘못되었습니다.");
        }
    }
    public void setName(){
        System.out.print("각인 입력 : ");
        name = scanner.next();
    }
    public void setSerialNumber(){
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memoryStr = {"", "256", "512", "1024", "2048"};
        String networkStr = (network == 1) ? "W" : "C";
        serialNumber = "iPadPro"+screenStr+memoryStr[memory]+networkStr+productDate+cnt;
    }
    // 제품 옵션 선택이 완료되면 출고까지 30초 동안 제품 생산 진행 상황을 보여주고 출고
    public void progressIPadPro() throws InterruptedException{
        int cnt = 0;
        while (true){
            sleep(300); // 0.3초마다 1퍼센트씩 증가
            cnt ++;
            System.out.printf("<< iPadPro 제작중 : [%d%%] >>\r",cnt);
            if (cnt >= 100) break;
        }
        System.out.println("주문이 완료되었습니다.");
    }
    // 제품에 대한 선택 옵션과 일련번호, 총 가격
    public void iPadProInfo() {
        String[] screenList = {"", "11인치", "13인치"};
        String[] colorList = {"", "실버", "스페이스 블랙"};
        String[] memoryList = {"", "256GB", "512GB", "1TB", "2TB"};
        String[] networkList = {"", "Wi-Fi", "Wi-Fi+Cellular"};
        System.out.println("=========== iPad Pro 출고 ===========");
        System.out.println("선택 옵션을 확인합니다.");
        System.out.println("액정 크기 : "+screenList[screen]);
        System.out.println("색상 : "+colorList[color]);
        System.out.println("메모리 크기 : "+memoryList[memory]);
        System.out.println("네트워크 종류 : "+networkList[network]);
        System.out.println("각인 : "+name);
        System.out.println("시리얼 넘버 : "+serialNumber);
        System.out.println("====================================");
    }
    // 선택한 옵션을 포함한 제품 가격 구하기
    public void iPadProCalcPrice() {
        System.out.println("총 결제 가격은 :" + (price) + "원 입니다.");
    }
    
}
