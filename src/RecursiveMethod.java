public class RecursiveMethod {
    public static int recursiveMethod(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * recursiveMethod(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursiveMethod(5));
    }
}
