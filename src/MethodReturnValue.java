public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(10, 20);
        System.out.println(result);
        System.out.println(calculateOperation(10, "+", 20));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int calculateOperation(int value1, String operator, int value2) {
        switch (operator) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            default:
                return 0;
        }
    }

}
