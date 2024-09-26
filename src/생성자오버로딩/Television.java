package 생성자오버로딩;
// 생성자는 클래스 이름과 같고, 반환 타입이 없음 (void 안됨)
// 생성자는 외부에서 접근해야하기 때문에 일반적으로 public 접근 제한자를 사용
// 싱글톤 객체를 생성할 때는 접근 제한자를 private 해서 객체 생성을 제한할 수 있음

import java.util.Scanner;

public class Television {
    private boolean isON; // 전원 ON/OFF
    private int channel; // 채널 설정
    private int volume; // 볼륨 설정
    // 기본 생성자는 생성자가 없는 경우에 자동 완성 됨
    Scanner scanner = new Scanner(System.in);
    public Television() {
        isON = false;
        channel = 10;
        volume = 10;
        System.out.println("매개변수가 없는 생성자 호출");
    }
    public Television(boolean isON, int channel, int volume){
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
        System.out.println("매개변수가 전부 있는 생성자");
    }
    public void setON(){ // 입력을 받아야 활성화
        System.out.print("신호 입력 : ");
        boolean onOff = scanner.nextBoolean();
        isON = onOff;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV : " + onOffStr);
    }
    public void setChannel(){
        System.out.print("채널 입력 : ");
        int cnl = scanner.nextInt();
            if (cnl >= 1 && cnl <= 999){
                channel = cnl;
                System.out.println("채널을 "+channel+"번 으로 변경했습니다.");
        }
    }
    public void setVolume(){
        System.out.print("볼륨 입력 : ");
        int vol = scanner.nextInt();
            if (vol >= 0 && vol <= 100){
                volume = vol;
                System.out.println("볼륨을 " + volume + " 변경했습니다.");
        }
    }
    public void getTV(){
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("====== TV 정보 ======");
        System.out.println("전원 : "+ onOffStr);
        System.out.println("볼륨 : "+ volume);
        System.out.println("채널 : "+ channel);
    }
    public void changeTV(){
        System.out.println("TV를 조작합니다.");
        setON();
        setChannel();
        setVolume();
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("====== 현재 TV 정보 ======");
        System.out.println("전원 : "+ onOffStr);
        System.out.println("채널 : "+ channel);
        System.out.println("볼륨 : "+ volume);

    }
}
