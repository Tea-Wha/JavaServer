package 등급출력하기;
// 국어, 영어, 수학 성적을 입력 받아서 총점을 구하고
// 평균이 90점 이상이면 A
// 평균이 80점 이상이면 B
// 평균이 70점 이상이면 C
// 평균이 60점 이상이면 D
// 나머지는 F
// 각각의 성적은 0~100/ 입력값이 잘못된 경우 재입력

import java.util.Scanner;
public class GradeEx {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("국어 점수 입력 : ");
            int kor = scanner.nextInt(); // 공백 기준으로 다음 점수 입력 가능 (한번에)
            System.out.print("영어 점수 입력 : ");
            int eng = scanner.nextInt();
            System.out.print("수학 점수 입력 : ");
            int mat = scanner.nextInt();
            int tot = kor + eng + mat;
            if (tot>=0 && tot<=300 && kor>=0 && kor<=100 && eng>=0 && eng<=100 && mat>=0 && mat<=100){
                System.out.println("총점은 "+tot+"점 입니다."); //각각의 점수도 범위 제한을 해야된다.
                double avg = (double)tot/3;
                System.out.printf("평균은 %.2f 점 입니다.\n",avg);
                if (avg >= 90){
                    System.out.println("학점은 A 입니다.");
                } else if (avg >= 80){
                    System.out.println("학점은 B 입니다.");
                } else if (avg >= 70){
                    System.out.println("학점은 C 입니다.");
                } else if (avg >= 60){
                    System.out.println(("학점은 D 입니다."));
                } else{
                    System.out.println("학점은 F 입니다.");
                }
                break;
            } else {
                System.out.println("성적을 잘못 입력했습니다.");
            }
        }

    }
}
