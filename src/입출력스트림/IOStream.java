package 입출력스트림;
// Input/Output -> 컴퓨터 내부 또는 외부 장치와 프로그램 간의 데이터를 주고 받는 것
// 입출력 데이터를 처리할 공통적인 방법 -> 스트림
// FileInputStream 과 Scanner 활용

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOStream {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try{
            inputStream = new FileInputStream("src/입출력스트림/chicken.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾지 못했습니다.");
        }
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
