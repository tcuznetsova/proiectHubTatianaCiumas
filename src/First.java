import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int [] array = new int[] {90,80,70,60,50,40,30,20,10};
        int i = array.length-1;
        int j = 0;
        int [] newarray = new int[array.length];
        while (i>=0) {
            newarray[j] = array[i];
            j++;
            i--;
        }
        System.out.println(Arrays.toString(newarray));
    }
}
