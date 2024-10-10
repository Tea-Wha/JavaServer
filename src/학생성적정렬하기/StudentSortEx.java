package 학생성적정렬하기;
// 5명의 학생에 대해 이름과 국어, 영어, 수학 성적을 입력 받아서 정렬하기
// 첫번째 조건은 총점 기준
// 총점이 같으면 이름의 사전 순 정렬

import java.util.*;

public class StudentSortEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<ScoreComparable> treeset = new TreeSet<>(); // 중복이 허용되지 않기 때문에 조심해야 한다.
        // 이름과 총점 또한 겹칠 수 있기 때문에
        int stNum = 5;
        while (stNum > 0) { // for (int i = 0; i<5; i++)
            System.out.print("학생 이름 입력 : ");
            String name = scanner.next();
            System.out.print("국어 점수 입력 : ");
            int kGr = scanner.nextInt();
            System.out.print("영어 점수 입력 : ");
            int eGr = scanner.nextInt();
            System.out.print("수학 점수 입력 : ");
            int mGr = scanner.nextInt();
            treeset.add(new ScoreComparable(name, kGr, eGr, mGr));
            stNum--;
        }
            // Collections.sort(treeset);
            for (ScoreComparable e : treeset){
                System.out.print("학생 : "+e.getName()+" 총점 : "+e.getTotal()+" ");
            }

    }
}
