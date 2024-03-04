


import java.util.Scanner;

public class deneme {  public static void ucgen( int a ) {
    if (a <= 5) {
        System.out.println("İşlem basarısız daha yülsek sayı deneyi");
    } else {
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
        }
        for (int j = 1; j < a; j++) {
            System.out.println(" *  ");
        }
    }
    System.out.println();
}

    public static void main( String[] args ) {
        Scanner scr = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a = scr.nextInt();
        ucgen(a);
    }

}
