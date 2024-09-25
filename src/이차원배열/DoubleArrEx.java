package 이차원배열;

public class DoubleArrEx {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];  // 실제값 arr[n][n]
        int cnt = 1;
        for (int i = 0; i < arr.length; i++){ // 행의 개수 -> 위에서 밑으로
            for (int j = 0; j < arr[i].length; j++){ // 행에 포함된 열의 개수 -> 왼쪽에서 오른쪽으로
                arr[i][j] = cnt++;
            }
        }
        for (int[] x : arr){ // 행 0번째 행 / 1번째 행 Scan -> x는 3개짜리 배열이 2행에 존재
            for (int e : x){ // 0 행에 한번 순회 / 다음 1 행에 한번 순회 -> e는 3개짜리 배열을 3번 scan
                // 각 요소들을 scan 한다는 의미 // 2차원 배열의 경우 []이 뒤에 붙어야 하나?
                System.out.print(e + " ");
            }
            System.out.println();
        }

        String[] strArr = {"Java", "Python", "C++", "C", "Kotlin"};

        for (String e : strArr){
            System.out.print(e.charAt(0));
        }
    }
}
