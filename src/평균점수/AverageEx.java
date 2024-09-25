package 평균점수;

import java.util.Scanner;

// 학생 수 5명에 다한 성적 입력 받음
// 입력 받은 성적 중에서 40점 미만이 있으면, 40점 올림
// 평균 점수를 구해서 출력 하기
// 정수는 모두 0점 이상, 100점 이하면 5의 배수이다. 따라서, 평군 점수는 항상 정수이다.
public class AverageEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int [] grade = new int[5];
//        int total = 0;
//        for (int i = 0; i < grade.length; i++) {
//            grade[i] = scanner.nextInt();
//            if (grade[i] < 40) grade[i] = 40;
//            total += grade[i];
//        }
//        System.out.println(total / 5);
//        int [] grade = new int[5];
//        grade[0] = scanner.nextInt();
//        grade[1] = scanner.nextInt();
//        grade[2] = scanner.nextInt();
//        grade[3] = scanner.nextInt();
//        grade[4] = scanner.nextInt();
//
//        int sum = 0;
//        for (int i = 0; i < grade.length; i++){
//            if (grade[i] < 40){
//                grade[i] = 40;
//            }
//            sum += grade[i];
//        }
//        System.out.println(sum);
//        System.out.println(sum / 5);

        int [] grade = new int[5];
        grade[0] = scanner.nextInt();
        grade[1] = scanner.nextInt();
        grade[2] = scanner.nextInt();
        grade[3] = scanner.nextInt();
        grade[4] = scanner.nextInt();

        int sum = 0;
        for (int i : grade){ // 다음과 같이 구성시 i는 이미 grade[i] 이다.
            if (i < 40){
                i = 40;
            }
            sum += i;
        }
        System.out.println(sum);
        System.out.println(sum / 5);
    }
}
