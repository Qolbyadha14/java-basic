public class Scope {
    public static void main(String[] args) {
        int i = 1;

        {
            int j = 2;
            System.out.println(i + j);
        }

        System.out.println(i);
    }
}
