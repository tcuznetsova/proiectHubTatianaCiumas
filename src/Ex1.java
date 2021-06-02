import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti primul numar");
                int[] array = new int[3];
        array[0] = sc.nextInt();

        System.out.println("Introduceti al doilea numar");
        array[1] = sc.nextInt();

        System.out.println("Introduceti al treilea numar");
        array[2] = sc.nextInt();

        Arrays.sort(array);
        System.out.println("Cel mai mic numar este  " + array[0]);
    }

}

