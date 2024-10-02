package 디폴트메소드;
// 인터페이스 모든 문법과 디폴트메소드에 대해서 학습

import java.util.Scanner;

public class DefaultMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RemoteControl rc; // interface Remotecontrol 상속 -> 부모 클래스 상속이라
        // 자식 클래스에 있는 메소드 접근 불가능
        System.out.print("제품 선택 [1]TV [2]Audio : ");
        int sel = scanner.nextInt();
        if (sel == 1){
            rc = new Television();
            rc.turnON();
            rc.setVolume(20);
            RemoteControl.changeBattery();
            rc.setMute(true);
        }
        else if (sel == 2){
            rc = new Audio();
            rc.turnON();
            rc.setVolume(102);
            Audio audio = new Audio();
            audio.turnON();
            audio.setVolume(102);
            audio.getInfo();
        }
        else{
            System.out.println("입력이 잘못되었습니다.");
        }
        RemoteControl rc2 = new RemoteControl() {
            int volume;
            @Override
            public void turnON() {
                System.out.println("PS의 전원을 켭니다.");
            }

            @Override
            public void turnOFF() {
                System.out.println("PS의 전원을 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME){
                    this.volume = RemoteControl.MAX_VOLUME;
                }
                else if (volume < RemoteControl.MIN_VOLUME){
                    this.volume = RemoteControl.MIN_VOLUME;
                }
                else {this.volume = volume;}
            }
        };
        rc2.turnON();
        rc2.setVolume(30);
    }
}
