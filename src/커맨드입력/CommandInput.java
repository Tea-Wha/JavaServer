package 커맨드입력;

import static java.lang.System.exit;
public class CommandInput {
    public static void main(String[] args) { // 메인이 시작됨과 동시에 터미널에서 입력값을 받을 수 있음
    // String[] args 에서 받을 수 있음 / 사용하는 법
    // 옵션 값
    // 실행 당시에 바로 입력 값을 받고 싶을 때 (입력 시점 다름)
        if(args.length != 2){
            System.out.println("인자값이 2개가 필요 합니다.");
            exit(0);
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("결과 : " + (num1+num2));
    }
}
