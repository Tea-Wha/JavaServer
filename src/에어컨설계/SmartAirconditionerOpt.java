package 에어컨설계;

import java.util.Scanner;

public class SmartAirconditionerOpt extends AirconditionerOpt {
    private boolean isPower;
    private boolean isCooler; // 에어컨 동작 여부
    private boolean isHeater; // 히터 동작 여부
    private int windStep;
    private final int targetTemp = 20;
    private int nowTemp;

    public SmartAirconditionerOpt() {
        isPower = false; // 변할 값
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }

    @Override
    public boolean isPower() {
        return isPower;
    }

    @Override
    public void setPower(boolean power) {
        isPower = power;
    }

    @Override
    public boolean isCooler() {
        return isCooler;
    }

    @Override
    public void setCooler(boolean cooler) {
        isCooler = cooler;
    }

    @Override
    public boolean isHeater() {
        return isHeater;
    }

    @Override
    public void setHeater(boolean heater) {
        isHeater = heater;
    }

    public int getTargetTemp() {
        return targetTemp;
    }

    public int getNowTemp() {
        return nowTemp;
    }

    public void setNowTemp(int nowTemp) {
        this.nowTemp += nowTemp;
    }
    public void windStep() {
        if (nowTemp >= targetTemp + 10 || nowTemp <= targetTemp - 10) {
            windStep = 3;
        } else if ((nowTemp >= targetTemp + 5 && nowTemp < targetTemp + 10) || ((nowTemp <= targetTemp - 5 && nowTemp > targetTemp - 10))) {
            windStep = 2;
        } else if (nowTemp < targetTemp + 5 || nowTemp > targetTemp - 5) {
            windStep = 1;
        }
    }


    public void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("========== 에어컨 정보 ==========");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + nowTemp);
        System.out.println("자동 온도 : " + targetTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windStep]);
    }


    public void setAirConState(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 온도가 "+nowTemp+"도 입니다.");
        System.out.println("자동으로 적정 온도에 맞추는 중입니다.");
        if (windStep == 3){
            System.out.println("터보 모드 작동중입니다.");
        } else if (windStep == 2){
            System.out.println("자동으로 풍량을 조절중입니다.");
        } else if (windStep == 1) {
            System.out.println("자동으로 풍량을 조절중입니다.");
        }


        if (nowTemp > targetTemp) { // 현재가 더운 상태, 온도를 내리라는 의미
            System.out.println("Cooler가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if (nowTemp < targetTemp){
            System.out.println("Heater가 동작합니다.");// 현재가 추운 상태, 온도를 높이라는 의미
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }

    }


}
