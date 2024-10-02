package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTok cocoaTok = new CocoaTok("린");
        cocoaTok.writeMsg("오늘 날씨가 갑자기 쌀쌀해 졌어요. 건강하게 활동 잘 하세요.");
        NetworkAdapter adapter = null; // 초기값 설정
        Scanner scanner = new Scanner(System.in);
        System.out.print("메세지를 전송할 네트워크 선택 [1]WiFi [2]5G [3]LTE : ");
        int sel = scanner.nextInt();
        switch (sel){
            case 1: adapter = new WiFi(); break;
            case 2: adapter = new FiveG(); break;
            case 3: adapter = new Lte(); break;
            default: System.out.println("메세지를 전송할 네트워크가 없습니다.");
        }
        if (adapter != null) cocoaTok.send(adapter); // if 부분이 없다면 null point exception 발생 가능
    }
}
