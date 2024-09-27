package 상속TV;
import static 상속TV.Common.*;

public class ProductTV extends ProtoTypeTV{
    String name;
    boolean isInternet; // 인터넷 기능을 ON/OFF
    public ProductTV(String name){
        super(false, 10, 10); // super() 부모의 생성자를 호출
        this.name = name;
    }
    void setPower(boolean isPower){
        this.isPower = isPower;
    }
    void setVolume(int vol){
        if (vol >= MIN_VOLUME && vol <= MAX_VOLUME){
            this.volume = vol;
        } else {
            System.out.println("볼륨 설정 범위를 벗어났습니다.");
        }
    }
    @Override
    public void setChannel(int cnl){ // 오버라이딩은 반환타입, 접근제한자까지 다 맞아야함
        if (cnl > PRODUCT_CHANNEL_MIN && cnl < PRODUCT_CHANNEL_MAX){
            channel = cnl;
            System.out.println("채널을 "+ channel + "변경 했습니다.");
        } else{
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    // 오버로딩
    public void setChannel(int cnl, boolean isInternet){
        if (isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else{
            this.isInternet = false;
            if (cnl > PRODUCT_CHANNEL_MIN && cnl < PRODUCT_CHANNEL_MAX){
                channel = cnl;
                System.out.println("채널을 "+ channel + "변경 했습니다.");
            } else{
                System.out.println("채널 설정 범위가 아닙니다.");
            }
        }
    }
    void tvInfo(){
        System.out.println("이름 : "+name);
        System.out.println("전원 : "+isPower);
        System.out.println("채널 : "+channel);
        System.out.println("볼륨 : "+volume);
        System.out.println("인터넷 모드 : "+isInternet);
    }
}
