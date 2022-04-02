import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(RandomNumbers.randomElement());
    }
}

class RandomNumbers {
    static final int[] ELEMENTS = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int randomElement() {
        int index = (int)Math.floor(Math.random() * ELEMENTS.length);
        return ELEMENTS[index];
    }
}
