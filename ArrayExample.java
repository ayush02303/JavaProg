public class ArrayExample {
    public static void main(String[] args) {

        // declaring a 1D array
        int[] arr1 = {12, 23, 45, 67, 12};

        for (int num = 0; num < arr1.length; num++) {
            System.out.println(arr1[num]);
        }

        // declaring and defining a 2D array
        int[][] arr2 = {
            {12, 12, 34},
            {12, 34, 566},
            {1, 22, 44}
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }
    }
}
