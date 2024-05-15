public class TypeDataNonPrimitive {
    public static void main(String[] args) {
//        Type Data Non-Primitive make default value null
        Integer i = 10;
        System.out.println(i);

        Long l = 10L;
        System.out.println(l);

        Short s = 10;
        System.out.println(s);

        Byte b = null;
        System.out.println(b);

        b = 100;
        System.out.println(b);
//        b = "100"; // error

//        convert primitive to non-primitive
        int xx = 10;
        Integer y = xx;
        System.out.println(y);
    }
}
