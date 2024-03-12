package scr;

import java.util.Arrays;
import java.util.Scanner;

public class SixthHomework {
    //1- Bir sayının ikinin kuvveti olup olmadığını kontrol edin?
    // Math.pow()=Hem tamsayılar hem de çiftler olmak üzere sayıların gücünü hesaplamak için kullanılır.
    public static boolean kuvvet( int a ) {
        if (a == 0) {
            return false;
        }
        while (a % 2 == 0) {
            a /= 2;
        }
        return a == 1;
    }

    //2- Verilen bir sayının karekökünü hesaplayınız?
    // math.sqrt()= metodu karekök alma işlemini gerçekleştirir. Tek parametre alır ve aldığı parametrenin karekökünü döner.
    public static void karekokHesaplama() {
        Scanner imput = new Scanner(System.in);
        System.out.print("Karekökünü hesaplanacak sayıyı giriniz = ");
        double a = imput.nextDouble();
        if (a > 0) {
            System.out.println("sayının kerkökü = " + Math.sqrt(a));
        } else {
            System.out.println("sayının 0 ve 0 dan Kücük bir sayı girilemez.");
        }
    }

    //3- Java'da artı operatörünü kullanmadan iki sayı toplanabilir mi ? ( ^,<<,>> )
    // soru Yapılmadı
    public static void bitselOperator() {
/*
Bitsel operatörler, sayıların bireysel bitlerini işlemek için kullanılır ve genellikle düşük seviyeli programlamada, donanım
ile çalışmada veya performans optimizasyonu gerektiren durumlarda kullanılır. Yedi temel bitsel operatör bulunmaktadır:
NOT (~): Bir sayının tüm bitlerini tersine çevirir.
AND (&): İki sayının karşılık gelen bitlerini AND işlemine tabi tutar.
OR (|): İki sayının karşılık gelen bitlerini OR işlemine tabi tutar.
XOR (^): İki sayının karşılık gelen bitlerini XOR işlemine tabi tutar.
AND NOT (&^): İki sayının karşılık gelen bitlerini AND NOT işlemine tabi tutar.
Sola Kaydırma (<<): Bir sayının bitlerini belirtilen basamak sayısı kadar sola kaydırır, sıfırlar sağa eklenir.
Sağa Kaydırma (>>): Bir sayının bitlerini belirtilen basamak sayısı kadar sağa kaydırır, yeni bitler pozitifse sıfır,
 negatifse en soldaki bit ile doldurulur.
Bitsel operatörler, genellikle performans kritik kodu optimize etmek veya donanım ile etkileşimli programlamada kullanılır.
 Bu operatörler aritmetik ve ilişkisel operatörlerden daha düşük önceliğe sahiptir, ancak atama operatörlerinden daha yüksek önceliğe sahiptir.
 */
    }

    /*4-   İki dizinin aynı elemanları içerip içermediğini kontrol eden Java programını yazınız.
Arrays.sort() = Array içinde bileşen arama ve array'in bileşenlerini sıralama gibi array ile ilgili işlemleri yapmaya yarayan öğeleri içeren bir sınıftır.
Arrays.equals = iki dizinin eşitliğini kontrol etmek için kullanılır.
Arrays.binarySearch = dizi içerisinde arama işlemi yapabiliriz.

     */
    public static void isThereTheSameStaff( int[] numArry, int[] numArrys ) {
        Arrays.sort(numArry);
        Arrays.sort(numArrys);
        boolean ortak = Arrays.equals(numArry, numArrys);
        if (ortak) {
            System.out.println("Diziler eşit. Aynı elemanlara sahipler.");
            System.out.print("Ortak elemanlar: ");
            for (int i : numArry) {
                if (Arrays.binarySearch(numArrys, i) >= 0) {
                    System.out.println(i + ",");
                }
            }
        } else {
            System.out.println("Diziler eşit değil. Farklı elemanlara sahipler.");
        }
    }

    //5 Java'da bir dizideki en büyük ikinci sayıyı nasıl bulursunuz?
    public static void findSecondLargest( int[] array ) {
        Arrays.sort(array);
        if (array.length < 3) {
            System.out.println("Dizi en az üç eleman içermelidir.");
        }

        int largest = array[0]; // en büyük
        int secondLargest = array[1]; // ikinci en büyük

        for (int i = 2; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        System.out.println("En büyük ikinci sayı: " + secondLargest);
    }

    public static void consecutiveElement( int[] dizi ) {
        Arrays.sort(dizi);
        boolean ardisikVar = false;
        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] + 1 == dizi[i + 1]) {
                int ardisiklar = dizi[i];
                ardisikVar = true;
                System.out.println("Ardışık eleman var. Bu ardışık elemanlar = " + ardisiklar);
            }
        }
        if (!ardisikVar) {
            System.out.println("Ardışık eleman yok.");
        }
    }

    public static void main( String[] args ) {
        System.out.println("1. soru");
        int a = 256;
        if (kuvvet(a)) {
            System.out.println(a + " iki nin kuvetidir.");
        } else {
            System.out.println(a + " iki nin kuveti deyildir.");
        }
        System.out.println("-----------------------------");


        System.out.println("2. soru.");
        karekokHesaplama();
        System.out.println("------------------------------");


        System.out.println("3. soru");
        bitselOperator();

        System.out.println("------------------------------");

        System.out.println("4. soru.");
        int[] num = {8, 6, 4, 2};
        int[] nums = {2, 4, 6, 8};
        isThereTheSameStaff(num, nums);

        System.out.println("-----------------------------");
        System.out.println("5. soru.");
        int[] num1 = {1, 3, 4, 6, 2, 9, 8, 14,};
        findSecondLargest(num1);

        System.out.println("-----------------------------");
        System.out.println("6. soru.");
        int[] sayi = {5, 7, 6, 2, 1, 4, 9};
        consecutiveElement(sayi);
    }
}