import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Introduceti ziua de la 1 la 7");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ziua ="";

        switch(a){

            case 1: ziua="luni";
                break;
            case 2: ziua="marti";
                break;
            case 3: ziua="miercuri";
                break;
            case 4: ziua="joi";
                break;
            case 5: ziua="vineri";
                break;
            case 6: ziua="simbata";
                break;
            case 7: ziua="duminica";
                break;

            default:System.out.println("Ati introdus gresit");
        }

        System.out.println(ziua);
    }
}

