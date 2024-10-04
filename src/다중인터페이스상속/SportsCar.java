package 다중인터페이스상속;
// 1개의 상속 2개의 인터페이스 상속

public class SportsCar extends Car implements AirCon,AutoDrive{
    private boolean isAirCon; // AirCon ON/OFF
    private int setTemp;
    private boolean isAutoDrv;
    private boolean isTurbo;

    public SportsCar(boolean isAirCon, int setTemp, boolean isAutoDrv, boolean isTurbo) {
        super(150,"white","2000");
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.isTurbo = isTurbo;
    }

    @Override
    public void airConON() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void airConOFF() {
        System.out.println("에어컨을 끕니다.");
    }

    @Override
    public void setAirConTemp(int tmp) {
        System.out.print("에어컨 설정 온도를 "+tmp+"로 변경합니다.");
    }

    @Override
    public void autoDrvON() {
        System.out.println("자율 주행 모드를 켭니다.");
    }

    @Override
    public void autoDrvOFF() {
        System.out.println("자율 주행 모드를 끕니다.");
    }
    public void viewInfo(){
        String airConStr = (isAirCon) ? "ON" : "OFF";
        String autoStr = (isAutoDrv) ? "ON" : "OFF";
        String turboStr = (isTurbo) ? "ON" : "OFF";
        System.out.println("속도 : "+speed);
        System.out.println("색상 : "+color);
        System.out.println("년도 : "+year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("에어컨 온도 : " + setTemp);
        System.out.println("자율 주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);
    }
}
