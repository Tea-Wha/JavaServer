package 자동차정렬하기;

import java.util.Comparator;

public class CarComparator implements Comparable<CarComparator> {
    private Integer year;
    private String name;
    private Integer price;

    @Override
    public int compareTo(CarComparator o) {
        if (this.year.equals(o.year)){
            if (!this.name.equals(o.name)) return this.name.compareTo(o.name);
            else return this.price.compareTo(o.price);
        }
        else return this.year.compareTo(o.year);
    }

    public CarComparator(int year, String name, int price) {
        this.year = year;
        this.name = name;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return getName();
    }
}
