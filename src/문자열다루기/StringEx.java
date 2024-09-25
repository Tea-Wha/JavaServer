package 문자열다루기;
// 문자열이란? 문자가 연속적으로 존재하는 데이터 형
// 자바에서는 문자와 문자열을 구분함. "문자열", '문자'
// 자바는 문자열을 참조 타입으로 간주함
// 문자열을 표현하기 위해서는 객체를 만들어 사용하거나 리터럴 표기 방식으로 사용함
// 리터럴 표기 방식이 가독성이나 성능에서 유리함

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        String name1 = new String("홍태화");
        String name2 = "홍태화"; // 리터럴 표기 방법, 이게 좋음
        // 문자열 내장 메서드
        // equals() : 두개의 문자열 내용이 동일한지 비교하여 결과를 반환
        String a = "hello";
        String b = "Hello";
        System.out.println(a.equals(b)); // false
        System.out.println(a.equalsIgnoreCase(b)); // true, 대소문자 구분 안함
        System.out.println(a == b); // 주소가 같은지를 물어보는 경우가 됨

        // indexOf() : 문자열에서 특정 문자가 시작되는 인덱스 반환
        String c = "Hello Java";
        System.out.println(c.indexOf("Java"));

        // contains() : 문자열에서 특정 문자열이 포함되어 있는지의 여부를 반환
        System.out.println(c.contains("Hello")); // true

        // charAt() : 문자열에서 특정 위치의 문자를 리턴
        System.out.println(c.charAt(6)); // "J"
        
        // replace() : 특정 문자열을 다른 문자열로 대체 할 때
        String d = "안녕하세요. JAVA를 공부 하겠습니다.";
        System.out.println(d.replace("JAVA","Python"));
        System.out.println(d);
        // replaceAll() : 정규식 적용 가능
        System.out.println(d.replaceAll("JAVA","Python"));
        System.out.println(d);
        
        // Substring() : 문자열에서 특정 문자열을 뽑아 낼 때 사용
        String e = "Hello Java";
        System.out.println(e.substring(6)); // 6에서부터 끝까지
        System.out.println(e.substring(6,8)); // 6 이상 8 미만

        // 실습문제 : 대문자, 소문자로 이루어진 문자열을 입력 받아
        // 대문자는 소문자로, 소문자는 대문자로 반환
        char word = 'A';
        System.out.println((int) word);  // 대문자 65 ~ 90   대문자 -> 소문자 +32
        char word0 = 'Z';
        System.out.println((int) word0); // 소문자 97 ~ 122   소문자 -> 대문자 -32
        char word1 = 'a';
        System.out.println((int) word1);
        char word2 = 'z';
        System.out.println((int) word2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String sh = scanner.nextLine();
        for (int i = 0; i < sh.length(); i++) {
            char ch = sh.charAt(i);
            int number = (int) ch;
            if (number >= 65 && number <= 90) {
                    number += 32;
                    char co = (char) number;
                    System.out.print(co);
            } else if (number >= 97 && number <= 122) {
                    number -= 32;
                    char co = (char) number;
                    System.out.print(co);
            }
        } System.out.println();
        // if (ch <'a') System.out.print((char)(ch+('a'-'A')));
        // else System.out.print((char)(ch-('a'-'A')));


        // 실습문제 : 입력 받은 문자열을 반대로 출력하기
        // ex) abcdef -> fedcba
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String inStr = sc.next();
        for (int i = inStr.length() - 1; i >= 0; i--) {
            System.out.print(inStr.charAt(i));
        }
    }
}
