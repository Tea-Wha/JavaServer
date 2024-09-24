package 상근이알람;
// 시간 입력 :
// 분 입력 :
import java.util.Scanner;
public class AlarmEx1 {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("시간 입력 : ");
            int hour = scanner.nextInt();
            System.out.print("분 입력 : ");
            int minute = scanner.nextInt();
            if (hour>=0 && hour<=23 && minute>=0 && minute<=59){
                if(hour == 0 && minute <45){
                    int alarm_hour = 23;
                    int alarm_minute = minute+60-45;
                    System.out.println("알람 시간은 "+alarm_hour+"시 "+alarm_minute+"분 입니다.");
                }
                else if (hour >=1 && minute <45){
                    int alarm_hour = hour-1;
                    int alarm_minute = minute+60-45;
                    System.out.println("알람 시간은 "+alarm_hour+"시 "+alarm_minute+"분 입니다.");
                }
                else{
                    int alarm_hour = hour;
                    int alarm_minute = minute-45;
                    System.out.println("알람 시간은 "+alarm_hour+"시 "+alarm_minute+"분 입니다.");
                }
                break;
            }else{
                System.out.println("시간을 잘못 입력했습니다.");
            }
        }
    }
}
