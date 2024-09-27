package 상속TV;
import static 상속TV.Common.*;


public class ProtoTypeTV {
    boolean isPower; // 전원에 대한 설정값
    int channel;
    int volume;
    public ProtoTypeTV(boolean isPower, int channel, int volume){
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl){
        if (cnl > PROTOTYPE_CHANNEL_MIN && cnl <PROTOTYPE_CHANNEL_MAX){
            channel = cnl;
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
}
