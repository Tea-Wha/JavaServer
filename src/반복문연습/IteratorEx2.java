package 반복문연습;
// 1 ~ 1000 사이의 7의 배수를 구하고, 한줄에 10 개 항목씩 출력하라
// for (초기값; 최종값; 증감값) {}

// 구구단 출력 하기
// 단수 입력 :

// 입력이 5인 경우
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class IteratorEx2 {
    public static void main(String[] args) {
        multipleseven();
        multiTable();
        multiplesevenex();
        starwriting();
    }
        public static void multipleseven() {
            int i;
            for (i = 1; i <= 1000; i++) {
                if (i % 7 == 0) {
                    System.out.printf("%5d", i);
                    if (i % 70 == 0) {
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }
        public static void multiTable(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("단수 입력 : ");
            int n = scanner.nextInt();
            System.out.println("===="+n+"단====");
            for (int i = 1; i <=9; i++){
                System.out.println(n+"x"+i+"="+n*i);
            }

        }
        public static void multiplesevenex() {
        int cnt = 0;
        int i;
        for (i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                System.out.printf("%5d", i);
                cnt ++;
                if (cnt == 10) {
                    System.out.println();
                    cnt = 0;
                }
            }
        }
        System.out.println();
        }
        public static void starwriting() {
            int i;
            int j;
            Scanner scanner = new Scanner(System.in);
            System.out.print("별 개수 입력 : ");
            int n = scanner.nextInt();
            for (i = n; i >= 1; i--) { // for(i = 0; i<n; i++)
                for (j = 1; j <= i; j++) { //for(j=0; j<n-i; j++)
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
