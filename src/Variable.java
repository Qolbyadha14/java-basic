public class Variable {
    public static void main(String[] args) {
        String name;
        name = "John";

        int age = 30;
        double salary = 50000.0;
        boolean isMarried = false;
        String address = "123 Main St";


        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isMarried);
        System.out.println(address);

        name = "Jane";
        System.out.println(name);

//        since java 10 we can use var instead of String
        var name2 = "Johns";
        var age2 = 30;
        System.out.println(name2);
        System.out.println(age2);

//        we can use final for constant values
        final String name3 = "John";
        final int age3 = 30;
        final var salary3 = 50000.0;
        System.out.println(age3);
        System.out.println(name3);
        System.out.println(salary3);


    }
}
