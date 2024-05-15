public class TypeDataNumber {
    public static void main(String[] args) {
//        integer numbers
        byte b = 100;
        short s = 1000;
        int i = 1000000000;
        long l = 1000000000000000000L;

//        floating point numbers
        float f = 3.14f;
        double d = 3.14;

//        Literals numbers
        int decimalInt = 25;
        int hexDecimalInt = 0x25;
        int binaryInt = 0b100101;

//        Underscored numbers, since java 7 we can use _ to separate numbers
        int oneMillion = 1_000_000;
        int one = 1;
        long thousand = 1_000_000_000L;

//  Conversion Numbers
//      Widening Casting (automatic)
//        rules: byte -> short -> int -> long -> float -> double
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

//      Narrowing Casting(manual)
//        rules: double -> float -> long -> int -> short -> byte
        double doubleValue2 = 10.0;
        float floatValue2 = (float) doubleValue2;
        long longValue2 = (long) doubleValue2;
        int intValue2 = (int) longValue2;
        short shortValue2 = (short) intValue2;
        byte byteValue2 = (byte) shortValue2;

    }
}
