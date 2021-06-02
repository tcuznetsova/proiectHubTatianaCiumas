import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 2, 9, 5, 4, 7, 6, 8};
        for (int i =0; i< array.length; i++){
        for (int j = 0; j < array.length-1; j++) {
            if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j + 1] = temp;
            }
            }
        }
            System.out.println(Arrays.toString(array));

    }

}