public class TypeDataString {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s);

        String sa = "Hello, " + "World!";
        System.out.println(sa);

        String sb = "Hello, " + new String("World!");
        System.out.println(sb);

        String sd = new String("Hello, ") + "World!";
        System.out.println(sd);

        String sc = new String("Hello, ") + new String("World!");
        System.out.println(sc);

    }
}
