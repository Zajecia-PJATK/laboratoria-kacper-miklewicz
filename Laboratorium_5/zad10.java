class Main {
    public static void main(String[] args) {
        VoidTest voidTest = () -> System.out.println("Void test");
        voidTest.print();

        IntTest sumTest = (a, b, c) -> a + b + c;
        System.out.println(sumTest.sum(23, 24, 6));

        VoidParamTest paramVoidTest = (number) -> System.out.println("Numer to: " + number);
        paramVoidTest.printParamVoid(77);

        MultipleInstructions multipleInstructionsTest = (a, b, c) -> {
          int score = a * b;
          int sum = score + c;
          return sum + 32;
        };
        System.out.println(multipleInstructionsTest.calculate(4, 4, 2));
    }
}

interface VoidTest {
    void print();
}

interface IntTest {
    int sum(int a, int b, int c);
}

interface VoidParamTest {
    void printParamVoid(int number);
}

interface MultipleInstructions {
    int calculate(int a, int b, int c);
}
