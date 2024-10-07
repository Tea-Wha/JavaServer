package Arrays클래스;
// 배열과 관련된 다양한 메소드를 제공하는 클래스


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArraysClass {
    public static void main(String[] args) {
        sortAndSearchFunc();
    }
    // 정렬과 검색
    static void sortAndSearchFunc(){
        Integer[] array = {5,4,7,8,12,34,34,2,57,3,3};
        System.out.println("결과에 대한 인덱스 : "+ Arrays.binarySearch(array,5));
        // 정렬되어 있지 않다면 정상 작동하지 않는다.
        Arrays.sort(array); // 해당 값을 오름차순 정렬
        for (int e : array) System.out.print(e+" ");
        System.out.println();
        System.out.println("결과에 대한 인덱스 : "+ Arrays.binarySearch(array,34));
        // 중복 수 중 앞에 나온 수의 인덱스 반환
        Arrays.sort(array, Collections.reverseOrder()); // 해당 값을 내림차순 정렬
        for (int e : array) System.out.print(e+ " ");
        System.out.println();
        System.out.println("결과에 대한 인덱스 : "+ Arrays.binarySearch(array,34));
        // 바이너리 서치는 오름차순에만 적용 가능
    }
    // 정렬 오버라이딩 : 상속받은 메소드를 재정의 -> 원하는 정렬 조건 재정의
    // 과일이름을 정렬하는데 길이가 짧은 순으로 정렬하고 길이가 같은 경우 사전 정렬 해주세요.
    // Comperator 클래스의 compare 메소드를 오버라이딩 해서 정렬 조건을 만듬
    static void sortComparatorFunc(){
        Integer[] array = {5,4,7,8,12,34,34,2,57,3,3};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}
