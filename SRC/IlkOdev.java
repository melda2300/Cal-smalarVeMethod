package SRC;

import java.util.Scanner;
public class IlkOdev {
    public static void baslangic() {
        System.out.println("Hello World"); // cıktı alabilmek için
    }

    public static void karesii( int a ) {
        System.out.println(a * a);
    }

    public static void dongu() {
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
    }

    public static void faktoriyel( int a ) {
        int faktoriyel = 1;
        for (int b = 1; b <= a; b++) {
            faktoriyel *= b;
        }
        System.out.println(a + " sayısının faktoriyeli = " + faktoriyel);
    }

    public static void tekCiftSayilar( int a ) {
        if (a % 2 == 0) {
            System.out.println("cift bir sayıdır");
        } else {
            System.out.println("tek bir sayıdır");
        }
    }

    public static void tersStr() {

        String merhaba = "AmA";
        String tersi = "";
        for (int a = merhaba.length() - 1; a >= 0; a--) {

            tersi += merhaba.charAt(a);
        }
        System.out.println(tersi);
    }

    public static void enBuyukSayi() {
        int[] sayi = {3, 4, 2, 1, 23, 5, 56, 2, 4, 32, 6, 6};
        int buyuk = sayi[0];
        for (int a = 0; a < sayi.length; a++) {
            if (sayi[a] > buyuk) {
                buyuk = sayi[a];

            }
        }
        System.out.println("EN BÜYÜK SAYI => " + buyuk);
    }

    public static void tersCevirme() {
        int[] sayi = {3, 4, 2, 1, 23, 5, 56, 2, 4, 32, 6, 6};

        int[] ters = new int[sayi.length];

        for (int a = 0; a < sayi.length; a++) {
            ters[sayi.length - 1 - a] = sayi[a];
        }

        for (int terss : ters) {
            System.out.print(terss + ",");
        }
    }

    public static void toplamaIslemi() {
        Scanner scr = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int a = scr.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        int b = scr.nextInt();

        int c = a + b;
        System.out.println("toplamları: " + c);

        scr.close();
    }
    public static void tekrarlananSayilariBul(int[] dizi) {
        System.out.println("Tekrarlanan sayılar:");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    // Çiftleri bir kez göstermek için
                    // tekrarlanan elemanı bulduktan sonra onu bir daha kontrol etmeyeceğiz.
                    System.out.println(dizi[i]);
                    break; // Bir kez bulduktan sonra iç loop'tan çık.
                }
            }
        }
    }

    public static void main( String[] args ) {
        baslangic();
        karesii(4);
        dongu();
        faktoriyel(6);
        tekCiftSayilar(109);
        tersStr();
        enBuyukSayi();
        tersCevirme();
        toplamaIslemi();
        int[] sayi={2,34,6,2,8,6,7,2,3,6,7,8};
        tekrarlananSayilariBul(sayi);

    }
}
