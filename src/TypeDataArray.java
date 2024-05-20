import java.sql.Struct;

public class TypeDataArray {
    public static void main(String[] args) {
//        Array Initialization
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        int[] arr3 = new int[]{ 1, 2, 3 };

        long[] arr4 = { 1, 2, 3 };

        String[] arr2 = new String[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = "Hello" + i;
            System.out.println(arr2[i]);
        }

        String[] arr5 = new String[] { "Hello", "World" };
        String[] arr6 = { "Hello", "World" };

//        Array Declaration
        int[] arr7;
        arr7 = new int[5];
        arr7[0] = 1;
        arr7[1] = 2;
        arr7[2] = 3;
        arr7[3] = 4;
        arr7[4] = 5;

//       Array Operation
        int total_array = arr7.length;
        for (int i = 0; i < total_array; i++) {
            System.out.println(arr7[i]);
        }

        System.out.println(arr7[0]);
        System.out.println(arr7[1]);
        System.out.println(arr7[2]);
        System.out.println(arr7[3]);
        System.out.println(arr7[4]);

//      Array Manipulation
        arr7[0] = 100;
        arr7[1] = 200;
        arr7[2] = 300;
        arr7[3] = 400;
        arr7[4] = 500;
        for (int i = 0; i < arr7.length; i++) {
            System.out.println(arr7[i]);
        }

        arr7[0] = 0;

//        Array Multi-Dimensional
        int[][] arr8 = new int[5][5];
        for (int i = 0; i < arr8.length; i++) {
            for (int j = 0; j < arr8[i].length; j++) {
                arr8[i][j] = i * j;
                System.out.println(arr8[i][j]);
            }
        }

        String[][] arr9 = {
            {"Hello", "World"},
            {"Hello", "World"},
            {"Hello", "World"}
        };

        System.out.println(arr9[0][1]);


    }
}
