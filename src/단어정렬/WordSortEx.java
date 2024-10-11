package 단어정렬;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSortEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 개수 : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> set = new TreeSet<>(new Comparator<>() { // 익명의 클래스 -> 람다로 줄이기 가능
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 길이가 같으면 사전 순 정렬
                }
                return o1.length() - o2.length(); // 기링 순으로 정렬
            }
        });
        for (int i = 0; i<n; i++){
            set.add(scanner.nextLine().trim());
        }
        scanner.close();

        for (String e : set) System.out.println(e);
    }
}
