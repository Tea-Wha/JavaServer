package 상근이알람;

import java.util.Scanner;
public class AlarmEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int calc = hour * 60 + min;
        if (calc<45){
            calc = 24 * 60 + min;
        }
        calc -= 45;
        System.out.printf("%d시 %d분\n", (calc/60), (calc%60));
    }
}
