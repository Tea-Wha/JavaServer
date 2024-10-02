package 코코아톡;

// 연결 과정 -> 메인 -> 클래스 -> 인터페이스
public class CocoaTok {
    private String to; // 상대방 이름
    private String msg; // 전달할 메세지
    public CocoaTok(String name){
        to = name;
    }
    public void writeMsg(String msg){
        this.msg = to + " : " + msg;
    }
    public void send(NetworkAdapter adapter){
        adapter.send(msg);
    }
}
