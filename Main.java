import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        int alfa;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();

        System.out.println("Açıyı giriniz : ");
        alfa = input.nextInt();
        double alan = (pi * (r * r) * alfa) / 360;

        System.out.println("Daire alanı : " + alan);

    }
}