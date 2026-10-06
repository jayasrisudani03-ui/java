class Calculator {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}