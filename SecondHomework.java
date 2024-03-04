package scrr;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHomework {
    public static int toplama( int[] dizi ) {
        //1. soru
        int sayi = 0;
        for (int a = 0; a < dizi.length; a++) {
            sayi += dizi[a];
        }

        return sayi;
    }

    public static int metninSayi( String str ) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            } else {
                return 0;
            }
        }
        return num;
    }

    public static int metninSayi2( String str ) {
        int sayi = Integer.parseInt(str);
        return sayi;
    }

    public static boolean checkifprime( int num ) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findingNumberPower() {
        Scanner scr = new Scanner(System.in);
        System.out.print(" x in değerini giriniz: ");
        int x = scr.nextInt();

        System.out.print(" y nin değerini giriniz:");
        int y = scr.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= y; i++) {
            sonuc *= x;
        }
        System.out.println("sonuç => " + sonuc);
    }

    public static int averageAccount( int[] arr ) {
        int sun = 0;
        for (int a = 0; a < arr.length; a++) {
            sun += arr[a];

        }
        return sun / arr.length;
    }


    /*public static void arraySort( int[] arr ) {
        int a = arr.length;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j--) {
                arr[i] = arr[j];
            }
        }
    }
     */
    public static void arraySort( int[] arr ) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int sirala = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = sirala;
                }
            }
        }
    }

    public static void arraySort1( int[] arr ) {
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.print(a + ", ");
        }
    }

    public static void harf( String[] metin ) {
        char karekter = 'a';
        int tane = 0;
        for (int a = 0; a < metin.length; a++) {
            if (karekter == metin.length) {
                tane++;
            }
        }
        System.out.println(karekter + " yazı içinde  " + tane + " tanedir");
    }

    public static int saymaharf( String str, char ch ) {
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                number++;
            }
        }
        return number;
    }

    public static int charOccurrencesInArray( String[] arr, char c ) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int kelime = Integer.parseInt(arr[i]);
            count += kelime;

        }
        return count;
    }


    public static void main( String[] args ) {
        //Soru 11: Java'da bir dizi içindeki tüm elemanların toplamını hesaplayan bir program yazınız. YAPILDI
        System.out.println(" 11. Soru");
        int[] liste = {2, 4, 7};
        int toplama = toplama(liste);
        System.out.println("Listenin toplamı => " + toplama);

        System.out.println("-------------------------------------------");

        //Soru 12: Java'da bir metni tam sayıya çeviren bir fonksiyon (metot) yazınız. (Örneğin, "123" string'i 123 tam sayısına çevrilmelidir.) YAPILDI
        System.out.println(" 12. Soru");
        String cevap = "11";
        int num = metninSayi(cevap);
        System.out.println("tam sayı değeri =>" + cevap + " = " + num);
        String cevap1 = "az";
        int num1 = metninSayi(cevap1);
        System.out.println("tam sayı değeri =>" + cevap1 + " = " + num1);

        System.out.println("-------------------------------------------");

        //Soru 13: Java'da bir tamsayının asal olup olmadığını kontrol eden bir fonksiyon yazınız.YAPILDI
        System.out.println(" 13. Soru");
        boolean asalMi = checkifprime(Integer.parseInt(cevap));
        System.out.println(cevap + " is prime: " + asalMi);


        System.out.println("-------------------------------------------");

        System.out.println(" 14. Soru");
        // Soru 14: Java'da bir diziyi sıralayan bir program yazınız. (Örneğin, "5, 2, 8, 1" dizisi "1, 2, 5, 8" olarak sıralanmalıdır.)
        int[] arrr = {3, 4, 7, 6, 5, 1, 2};
        arraySort(arrr);


        System.out.println("-------------------------------------------");

        // Soru 15: Java'da bir karakter dizisinin içinde belirli bir karakterin kaç kez tekrarlandığını sayan bir fonksiyon yazınız.
        String[] kelime = new String[]{"Merhaba dünyalı ben uzaylı "};
        harf(kelime);


        System.out.println("-------------------------------------------");

        System.out.println(" 16. Soru");
        // Soru 16: Java'da bir sayının kuvvetini alan bir fonksiyon yazınız. (Örneğin, 2^3 = 8)
        findingNumberPower();

        System.out.println("-------------------------------------------");

        //Soru 17: Java'da bir dizinin ortalamasını bulan bir fonksiyon yazınız.
        System.out.println(" 17. Soru");
        int[] arr = {22, 24};
        int ortalama = averageAccount(arr);
        System.out.println("dizinin ortalaması => " + ortalama);

        System.out.println("-------------------------------------------");

        // Soru 18: Java'da bir karakter dizisinde belirli bir harfin kaç kez geçtiğini sayan bir fonksiyon yazınız.
        String kelimeler = "selam nasılsın";
        char harf = 'a';
        saymaharf(kelimeler, harf);

        System.out.println("-------------------------------------------");


        System.out.println("-------------------------------------------");

        // Soru 18: Java'da bir karakter dizisinde belirli bir harfin kaç kez geçtiğini sayan bir fonksiyon yazınız.
        charOccurrencesInArray(kelime, harf);
        System.out.println("harf => " + "  kelimeler=>  " + kelimeler);


    }
}
