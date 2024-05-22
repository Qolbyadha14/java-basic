public class MethodVariableArgument {

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        sayCongratulations("John", values);
        sayCongratulations("Jane", 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
    }

    static void sayCongratulations(String name, int ... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;
        if (finalValue > 50) {
            System.out.println("Congratulations " + name + "!");
        }else {
            System.out.println("Sorry " + name + "!");
        }
    }
}
