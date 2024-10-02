package 디폴트메소드;

public class Audio implements RemoteControl{
    private int volume; // 인스턴스 필드 (객체로 만들어진 변수)
    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
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
    void getInfo(){ // implements 이용해 interface 상속 / 자식 클래스에서 추가적인 메소드 추가 가능
        System.out.println("오디오 입니다.");
        System.out.println("현재 볼륨은 "+volume+" 입니다.");
    }

}
