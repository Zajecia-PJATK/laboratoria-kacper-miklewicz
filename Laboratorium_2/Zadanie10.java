import java.io.*;

public class Main {

    public static void main(String[] args) {
        Numbers n = new Numbers(4, 1, 2);

        System.out.println(n.sum());
        System.out.println(n.average());
        System.out.println(n.min());
        System.out.println(n.max());
        System.out.println(n.geometric());
    }
}

class Numbers {
    private int a, b, c;

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return a + b + c;
    }

    public double average() {
        return (double)(a + b + c) / 3;
    }

    public int min() {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return min;
    }

    public int max() {
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        return max;
    }

    public double geometric() {
        return Math.cbrt(a * b * c);
    }
}
