package src;

import java.util.*;

public class FifthHomework {
    // 1- 1'den 100'e kadar verilen bir tamsayı dizisindeki eksik sayıyı bulunuz?
    // 20 yi neden bulmadığını kontrol et.
    public static void findMissingNumber( int[] number ) {
        boolean olmayanSayi;
        for (int j = 1; j < number.length; j++) {
            olmayanSayi = false;
            for (int k : number ) {
                if (k == j) {
                    olmayanSayi = true;
                }
            }
            if (!olmayanSayi) {
                System.out.println("olmayan eleaman =>" + j);
            }
        }
    }

    // 2- Verilen bir tamsayı dizisindeki yinelenen sayıyı bulun?
    public static int integerArray( int[] dizi ) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    System.out.println(" Yenilenen sayılar => " + dizi[i]); // Yinelenen sayı bulundu
                }
            }
        }
        return 0;
    }


    // 3-Sıralanmamış bir tamsayı dizisindeki en büyük ve en küçük sayı nedir?
    public static void bigAndSmall( int[] sayi ) {
        int min = sayi[0];
        int max = sayi[0];

        for (int i = 1; i < sayi.length; i++) {
            if (sayi[i] < min) {
                min = sayi[i];
            }
            if (sayi[i] > max) {
                max = sayi[i];
            }
        }
        System.out.println("En küçük sayı => " + min);
        System.out.println("En büyük sayı => " + max);
    }

    // 4-Toplamı verilen bir sayıya eşit olan tüm tamsayı dizisi çiftlerini bulunuz?
    public static void integerArrayPairs( int[] number ) {
        System.out.println("Bir dizedeki sayıların " + number.length + " sayıynın toplamını bulma sayılar.");
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number.length == (number[i] + number[j])) {
                    System.out.println("(" + number[i] + ", " + number[j] + ")");
                }
            }
        }
    }

    // 5- Bir dizi birden çok yinelenen içeriyorsa, dizideki yinelenen sayıları bulun?
    public static void repeatingNumbersInArray( int[] sayi ) {
        HashSet<Integer> num = new HashSet<Integer>(); // hashset = ne olduğunu araştır Arrylist le farkını bul.
        List<Integer> tekrarlananSayilar = new ArrayList<Integer>();
        for (int i : sayi) {
            if (!num.add(i)) { // (add) Zaten mevcut değilse, belirtilen elemanı bu sete eklemek için kullanılır.
                tekrarlananSayilar.add(i);
            }
        }
        System.out.println(" Tekrarlanan Sayılar =>" + tekrarlananSayilar);
    }

    // 6-Java'da verilen diziden yinelenenleri kaldırın?
    public static int[] removeDuplicateInArray( int[] number ) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int num : number) {
            if (set.add(num)) {
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    // 7-İki Matris Toplama veya Çıkarma nasıl yapılır?
    public static int[][] matrisToplama( int[][] matris1, int[][] matris2 ) {
        int satirSayisi = matris1.length;
        int sutunSayisi = matris1[0].length;
        int[][] toplamMatris = new int[satirSayisi][sutunSayisi];

        // Matris cıkarma işlemi
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                toplamMatris[i][j] = matris1[i][j] + matris2[i][j];
            }
        }
        return toplamMatris;
    }

    // 8- '*' bununla düzgün Üçgen yapımı:
    public static void regularTriangle( int a ) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a - i); j++) {
                System.out.print("");
            }
            for (int k = 1; k <= (i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main( String[] args ) {
        int[] numbers = {3, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19, 25};

        System.out.println("1. Soru");
        findMissingNumber(numbers);
        System.out.println("-------------------------------------");

        System.out.println("2. Soru");
        int[] nom = {2, 3, 4, 5, 6, 3, 1, 5, 7, 8, 9, 10};
        integerArray(nom);
        System.out.println("-------------------------------------");

        System.out.println("3. Soru");
        bigAndSmall(numbers);
        System.out.println("-------------------------------------");

        System.out.println("4. Soru");
        integerArrayPairs(nom);
        System.out.println("-------------------------------------");

        System.out.println("5. Soru");
        int[] num = {1, 3, 2, 1, 4, 5, 6, 4, 5,};
        repeatingNumbersInArray(num);
        System.out.println("-------------------------------------");

        System.out.println("6. soru");
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 6, 7};
        int[] yeniDizi = removeDuplicateInArray(num1);
        System.out.println("yenilenenler kaldırıldıktan sonra => " + Arrays.toString(yeniDizi));
        System.out.println("-------------------------------------");


        System.out.println("7. Soru");
        int[][] matrix1 = {{2, 4, 6},
                {3, 6, 9}};
        int[][] matrix2 = {{3, 2, 1},
                {10, 8, 6}};
        int[][] sumMatrix = matrisToplama(matrix1, matrix2);
        System.out.println("Matris Toplamı:");
        for (int[] row : sumMatrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("-------------------------------------");
        System.out.println("8. Soru");
        regularTriangle(6);
    }
}
