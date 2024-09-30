package 에어컨설계;
// 기능 설계 -> 요구 사항 분석
// 전원 ON/OFF 기능 isPower
// 온도 설정 기능 (1도 단위 설정) setTemp
// 현재 온도 표시 기능 curTemp
// 냉방기 ON/OFF 기능 isCooler
// 난방기 ON/OFF 기능 hotisON
// 바람세기 설정 (1단계/2단계/3단계) windStep

// 설정된 온도에 따라 온도 조정 기능 (60초/30초/20초) 주기로 온도 변함
// 에어컨 ON/OFF 동작을 위해 Scanner 입력에 대한 문자열 체크
// 현재 온도 표시를 위한 캘린더 API 활용 (현재 날짜에 대한 적절한 온도 설정)

import java.util.Calendar;
import java.util.Scanner;

public class AirconditionerOpt {
    private boolean isPower; // 전원 ON/OFF
    private int setTemp; // 설정 온도
    private int curTemp; // 현재 온도
    private boolean isCooler; // 에어컨 동작 여부
    private boolean isHeater; // 히터 동작 여부
    private int windStep; // 바람 세기 : 1단, 2단, 3단

    public AirconditionerOpt(){ // 생성자에서 인스턴스의 초기값을 부여
        // 현재 온도를 가져오기 위해서 Calendar 클래스를 이용해 현재가 몇월인지를 운용체제로부터
        // 가져와서 미리 정해둔 온도 배열에서 온도 값 가져옴
        final int[] monthTmp = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 1}; // 각 월별 평균 온도
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // 배열의 인덱스 동일
        // -> 8이 나오고 이는 설정한 배열의 인덱스 상에서 9월이 되기 때문에 맞음
        curTemp = monthTmp[month]; // 해당 월에 대한 온도를 가져옴
        isPower = false; // 변할 값
        setTemp = 18; // 변할 값
        isCooler = false;
        isHeater = false;
        windStep = 1;
        // 초기값 설정
    }
    // 콘솔 화면에 현재 에어컨 정보 출력하기
    // 온도가 바뀔 때 화면에 출력 되도록 구현
    public void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("========== 에어컨 정보 ==========");
        System.out.println("전원 : "+ onOffStr);
        System.out.println("현재 온도 : "+ curTemp);
        System.out.println("설정 온도 : "+setTemp);
        System.out.println("히터 : "+heaterStr);
        System.out.println("쿨러 : "+coolerStr);
        System.out.println("바람 세기 : "+windStr[windStep]);
    }

    public boolean isPower() {
        return isPower;
    }

    public int getSetTemp() {
        return setTemp;
    }

    public int getCurTemp() {
        return curTemp;
    }

    public boolean isCooler() {
        return isCooler;
    }

    public boolean isHeater() {
        return isHeater;
    }

    public int getWindStep() {
        return windStep;
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }

    public void setCurTemp(int curTemp) { // 현재온도는 현재 온도에서 입력된 값의
        //크기 만큼 변형해서 다시 대입
        this.curTemp += curTemp;
    }

    public void setCooler(boolean cooler) {
        isCooler = cooler;
    }

    public void setHeater(boolean heater) {
        isHeater = heater;
    }

    public void setWindStep(int windStep) {
        this.windStep = windStep;
    }

    // 에어컨 상태를 설정
    public void setAirConState(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 온도가 "+curTemp+"도 입니다.");
        System.out.print("온도를 설정 하세요 : ");
        setTemp = scanner.nextInt();
        System.out.println("설정 온도는 "+setTemp+"도 입니다.");
        System.out.print("바람 세기를 설정 하세요 : ");
        windStep = scanner.nextInt();
        if (curTemp > setTemp) { // 현재가 더운 상태, 온도를 내리라는 의미
            System.out.println("Cooler가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if (curTemp < setTemp){ // 현재가 추운 상태, 온도를 높이라는 의미
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
        
    }
}
