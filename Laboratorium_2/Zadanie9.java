import java.io.*;

public class Main {

    public static void main(String[] args) {
        MyDate dateOne = new MyDate(12, 30, 2022);
        MyDate dateTwo = new MyDate(3, 6, 2025);
        MyDate dateThree = new MyDate(54, 81, 2075);

        dateOne.displayDate();
        dateTwo.displayDate();
        dateThree.displayDate();
    }
}

class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
    }

    public MyDate() {
        this(1, 1, 1990);
    }

    public void setMonth(int month) {
        this.month = (month > 0 && month <= 12) ? month : 1;
    }

    public void setDay(int day) {
        this.day = (day > 0 && day <= 31) ? day : 1;
    }

    public void setYear(int year) {
        this.year = (year >= 1990 && year <= 2050) ? year : 1990;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        String day = this.day >= 10 ? Integer.toString(this.day) : "0" + this.day;
        String month = this.month >= 10 ? Integer.toString(this.month) : "0" + this.month;

        System.out.println(day + "/" + month + "/" + this.year);
    }
}
