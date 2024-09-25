package KMP암호화;
// Knuth-Morris-Pratt -> KMP
// Korea-Seoul -> KS
// Mirko-Slavko -> MS

// 대문자만 골라서 찍기
// 0번째 문자 출력, '-' 다음 문자 출력
// split("-")기준으로 자르고 0번째 문자 출력
// toCharArray()를 사용해서 문자 배열로 만든 후 대문자만 골라내기

import java.sql.SQLOutput;
import java.util.Scanner;

public class KmpEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String sr = scanner.nextLine();
        
        // 대문자만 골라서 찍기
        for (int i = 0; i < sr.length(); i++){
            char ch = sr.charAt(i); // 문자 분류 작업
            int number = (int) ch;
            if (number >= 65 && number <=90){
                char chNew = (char) number;
                System.out.print(chNew);
            }
        }
        System.out.println();
        
        // 0번째 문자 출력, '-' 다음 문자 출력
        for (int i = 0; i < sr.length(); i++){
            if (i==0) System.out.print(sr.charAt(i));
            else if(sr.charAt(i) == '-') System.out.print(sr.charAt(i+1));
        }
        System.out.println();
        
        // split("-")기준으로 잘라서 문자열 배열 생성 후 각 배열의 0번째 문자 출력
        String[] strSplit = sr.split("-");
        for (String e : strSplit){
            System.out.print(e.charAt(0));
        }
        System.out.println();

        // toCharArray()를 사용해서 문자 배열로 만든 후 대문자만 골라내기
        char[] chName = sr.toCharArray();
        for (char e : chName){ // 문자 배열로 변환 후 다음과 같은 for 구문을 쓸 수 있는 이유는 무엇인가
            if (e >= 'A' && e <= 'Z') System.out.print(e);
        }
        System.out.println();
    }
}
