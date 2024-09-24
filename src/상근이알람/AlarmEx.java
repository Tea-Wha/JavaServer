package 상근이알람;
// 시간 입력 :
// 분 입력 :
// 시간과 분을 분으로 환산
// 계산된 분이 45 미만이면 하루의 시간을 더해줌
// 계산된 시간에서 45를 빼줌
// 다시 시간과 분으로 환산해서 결과 출력
import java.util.Scanner;
public class AlarmEx {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("시간 입력 : ");
            int hour = scanner.nextInt();
            System.out.print("분 입력 : ");
            int minute = scanner.nextInt();
            int tot = hour * 60 + minute;
            if (hour <= 23 && hour >= 0 && minute >= 0 && minute <= 59) {
                if (tot < 45) {
                    tot = tot + 1440;
                    int alarm_time = tot - 45;
                    int alarm_hour = alarm_time / 60;
                    int alarm_minute = alarm_time % 60;
                    System.out.println("알람 시간은 " + alarm_hour + "시" + alarm_minute + "분 입니다.");
                } else {
                    int alarm_time = tot - 45;
                    int alarm_hour = alarm_time / 60;
                    int alarm_minute = alarm_time % 60;
                    System.out.println("알람 시간은 " + alarm_hour + "시" + alarm_minute + "분 입니다.");
                }
                break;
            }
            else{
                System.out.println("시간과 분을 잘못 입력했습니다.");
            }
        }
    }
}
