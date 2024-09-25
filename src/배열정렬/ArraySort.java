package 배열정렬;
// 정렬 알고리즘 구현해보기 : 버블 정렬 O(n2), 삽입 정렬 O(n2), 병합 정렬 O(NlogN), 퀵 정렬 O(NlogN)
// 시간의 복잡도
public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 10, 5, 2, 16, 6, 19, 21};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // i = 0 / j = 0 비교 i가 j보다 크다면 실행
                    tmp = arr[j]; // tmp (빈 공간) 에 arr[j] 대입
                    arr[j] = arr[i]; // j 값 리셋? -> 이 코드가 필요한 이유?
                    arr[i] = tmp; // i 값 변한 tmp 값 대입
                } // 이 값을 j가 전체 돌 동안 반복 // 초반에 바뀐게 계속 뒤의 값들과 비교
            }
        }
        for (int e : arr) System.out.print(e + " ");
    }
}