package 단어정렬;

import java.util.Scanner;
import java.util.TreeSet;

public class WordSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<WordComparator> word = new TreeSet<>();
        System.out.print("입력할 단어의 개수를 입력 : ");
        int number = scanner.nextInt();
        while (number > 0){
            System.out.print("단어 입력 : ");
            String name = scanner.next();
            word.add(new WordComparator(name));
            number --;
        }
        for (WordComparator e : word){
            System.out.print(e+ " ");
        }
    }

}
