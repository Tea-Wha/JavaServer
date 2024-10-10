package 큐기본;
// Queue 는 FIFO(First In First Out)
// 자바에서 Queue 는 LinkedList 를 활용하여 생성해야 하므로 Linked List 가 import 되어야 함
// Queue -> 버퍼 용도로 사용
// offer() : 넣기 / poll() : 빼기

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();
        msgQueue.offer(new Message("Mail", "백이진")); // new -> 객체 생성
        msgQueue.offer(new Message("SMS", "스티브"));
        msgQueue.offer(new Message("Kakao", "서울시"));

        while (!msgQueue.isEmpty()){
            Message msg = msgQueue.poll(); // 클래스 타입의 참조 변수
            switch (msg.command){
                case "Mail":
                    System.out.println(msg.to +"에게 메일을 보냅니다."); break;
                case "SMS":
                    System.out.println(msg.to+"에게 문자를 보냅니다."); break;
                case "Kakao":
                    System.out.println(msg.to+"에게 카톡을 보냅니다."); break;
            }
        }
    }
}
