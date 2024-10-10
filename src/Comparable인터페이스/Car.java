package Comparable인터페이스;

// Comparable : 나와 다른 객체를 비교할 때 사용
public class Car implements Comparable<Car>{ // Car 타입만 들어올 수 있음
    private String name; // 모델 이름
    private int year; // 연식
    private String color; // 색상

    @Override
    public int compareTo(Car o) {
        if (this.year == o.year) { // 연식이 같으면
            int rst = this.name.compareTo(o.name); // 모델 이름으로 사전순 정렬
            if (rst == 0){ // 비교 조건에 대한 반환값이 0이면 중복 제거가 됨
                return this.color.compareTo(o.color);
            }
            else return rst;
        }
        else if (this.year > o.year) { // return 0 -> 중복 값 제거 (같은 값이라는 의미)
            return 1; // 오름차순 정렬 // 앞의 값이 뒤의 값보다 크면 앞의 값을 뒤로 넣음 (현상 변경)
        }
        else return -1; // 앞의 값이 뒤의 값보다 작을 때 현상 유지
        // -1 -> 현상 유지 / 1 -> 현상 변경 / 0 -> 중복 제거
        // 기본적으로 compareTo() -> 오름차순 정렬
        // 오름차순 -> 낮은것부터 높은것으로
    }
    
    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
