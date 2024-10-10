package 학생성적정렬하기;

public class ScoreComparable implements Comparable<ScoreComparable>{
    private String name;
    private int kGr;
    private int eGr;
    private int mGr;
    private int total;

    @Override
    public int compareTo(ScoreComparable o) { // 인터페이스에 오버라이딩(내재) 되어있는 compareTo 정렬 방식 바꾸기
        total = kGr + eGr + mGr; // total 구하기
        if (this.total == o.total){
            return this.name.compareTo(o.name); // 총점 같을 시 이름 사전 순 정렬
        }
        else if (this.total < o.total){ // 총점 내림차순 정렬
            return 1; // 1이 아니더라도 양수이면 상태 변경(?) (현상 변경)
        }
        else return -1;
//         if (this.total != o.total){return o.total-this.total;} // 뒤에 값이 큰 경우가 양수가 됨
//         return this.name.compareTo(o.name);

        // 내림차순 -> 높은것부터 낮은것으로
    }
        // public String toString(){ toString 알아서 찍히기 때문에 이 부분을 바꾸면 다른 기능으로 사용할 수 있다.
            // return name + " : "+getTotalscore();
    //    } -> to String 오버라이딩 해서 기존에 주소가 찍히는 것을 다르게 방지할 수 있다.
    public ScoreComparable(String name, int kGr, int eGr, int mGr) {
        this.name = name;
        this.kGr = kGr;
        this.eGr = eGr;
        this.mGr = mGr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = kGr+eGr+mGr;
    }
}
