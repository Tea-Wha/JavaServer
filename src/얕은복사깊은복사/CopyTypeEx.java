package 얕은복사깊은복사;
// 얕은 복사

public class CopyTypeEx {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = arr1; // 같은 메모리 주소 참조

        arr1[0] = 1;
        arr1[1] = 1;
        arr1[2] = 1;

        arr2[0] = 1000;
        arr2[1] = 2000;
        arr2[2] = 3000;
        // 둘이 원래 같은 Heap 영역의 메모리 주소를 참조하고 있었지만
        // 같은 메모리 주소 참조 상황에서 둘 중 하나의 값이 바뀐다면
        // 나머지 다른 값도 동일하게 변경된다.
        // 같은 메모리가 할당된 상황이면 계속 같은 메모리를 바라보게 된다.
        for (int e : arr1){
            System.out.print(e+" ");
        }


    }
}
