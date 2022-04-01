import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(1, 2, 3);
        System.out.println(numbers.getA());
        System.out.println(numbers.getB());
        System.out.println(numbers.getC());
    }
}

@Getter @Setter
@AllArgsConstructor
class Numbers {
    private int a, b, c;

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
