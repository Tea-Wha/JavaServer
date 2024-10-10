package 스택응용;

import java.util.Scanner;
import java.util.Stack;
// 괄호의 닫힘 여부를 스택으로 확인하는 방법
// Stack navigator -> EX -> 웹페이지의 뒤로 가기 / 앞으로 가기

public class StackExMain {
    public static void main(String[] args) {
        // Character는 char의 객체 타입
        Stack<Character> st = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = scanner.next();
        for (int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i); // 문자열에서 인덱스에 해당하는 문자를 반환
            if (ch  == '('){ // 추출된 문자가 열림 괄호 이면
                st.push(ch); // ( 이 올때마다 저장
            }
            else if (ch == ')'){ // 추출된 문자가 닫힘 괄호 이면
                if (!st.isEmpty()) st.pop(); // ) 이 올때마다 추출
                else { // 비어 있으면
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if (st.isEmpty()){
            System.out.println("괄호가 일치 합니다.");
        }
        else System.out.println("괄호가 일치하지 않습니다.");
    }
}
