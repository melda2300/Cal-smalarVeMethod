package SRC;

import java.util.Arrays;

public class fourthHomework {
    // 1- Java'da bir metindeki her kelimenin ilk harfini büyük yapacak bir fonksiyon yazınız.
    public static String ilkHarfiniBuyuk( String kelimeler ) {
        String[] kelimeler1 = kelimeler.split(" ");
        StringBuilder yeniMetin = new StringBuilder(); // stringBuldilder ne işe yaradığını araştıracağım .

       /*
        StringBuilder, Java'da metinsel ifadeleri birleştirmek için kullanılan bir sınıftır.
        String sınıfıyla yapılan metin birleştirme işlemleri StringBuilder sınıfıyla da yapılabilmektedir.
        String sınıfının aksine, StringBuilder nesnesi değişebilir (mutable) ve daha verimli bellek kullanımı sağlar.
        */

        for (String kelime : kelimeler1) {
            if (!kelime.isEmpty()) {

                char ilkHarf = Character.toUpperCase(kelime.charAt(0));

                String geriKalan = kelime.substring(1).toLowerCase();

                yeniMetin.append(ilkHarf).append(geriKalan).append(" ");
            }
        }
        return yeniMetin.toString().trim();
    }

    //  2- Java'da bir karakter dizisindeki en sık geçen harfi bulan bir program yazınız.
    public static char kelimeSaymaca( String cumle ) {
        int[] harfFre = new int[305];
        for (char harf : cumle.toCharArray()) {
            if (Character.isLetter(harf)) {
                harfFre[Character.toLowerCase(harf)]++;
            }
        }
        char enSikHarfi = ' ';
        int enSikFre = 0;
        for (char harf = 'a'; harf <= 'z'; harf++) {
            if (harfFre[harf] > enSikFre) {
                enSikHarfi = harf;
                enSikFre = harfFre[harf];
            }
        }
        return enSikHarfi;
    }

    // 3- Java'da bir tamsayının basamaklarını toplamını, çift basamaklarını ve tek basamaklarını ayrı ayrı hesaplayan bir fonksiyon yazınız.
    public static void digitTotals( int num ) {
        if (num < 0) {
            System.out.println("Negatif sayı yazmayınız. ");
        }
        int collection = 0;
        int doubleDigitAddition = 0;
        int singleDigitAddition = 0;

        while (num > 0) {
            int numberDigit = num % 10;
            collection += numberDigit;

            if (numberDigit % 2 == 0) {
                doubleDigitAddition += numberDigit;
            } else {
                singleDigitAddition += numberDigit;
            }
            num /= 10;
        }
        System.out.println("Basamak toplamı: " + collection);
        System.out.println("Çift Basamakların Toplamı: " + doubleDigitAddition);
        System.out.println("Tek Basamakların  TOplamı: " + singleDigitAddition);
    }

    // 4- Java'da iki sıralı diziyi birleştirerek yeni bir sıralı dizi oluşturan bir program yazınız.
    public static int[] birlestir( int[] dizi1, int[] dizi2 ) {
        int uzunluk = dizi1.length + dizi2.length;
        int[] birlesikDizi = new int[uzunluk];

        System.arraycopy(dizi1, 0, birlesikDizi, 0, dizi1.length);
        System.arraycopy(dizi2, 0, birlesikDizi, dizi1.length, dizi2.length);

        Arrays.sort(birlesikDizi);

        return birlesikDizi;
    }


    // 5- Java'da bir karakter dizisindeki palindromları
    // (tersten okunduğunda aynı olan kelimeler) bulan bir fonksiyon yazınız.
    public static boolean palindrom( String harf ) {
        boolean durumu = true;
        String tersi = String.valueOf(harf);
        for (int i = harf.length() - 1; i >= 0; i--) {
            tersi += harf.charAt(i);
        }
        for (int a = 0; a < harf.length() / 2; a++) {
            if (harf.charAt(a) != tersi.charAt(a)) {
                durumu = false;
                break;
            }
        }

        return durumu;
    }


    // Soru 6:Java'da bir tamsayının pozitif çarpanlarını bulan bir program yazınız.
    public static void findPositiveMultipliers( int sayi ) {
        System.out.println("Pozitif çarpanlar .");

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.println(i+" ");
            }
        }

    }

    // 7- Java'da iki matrisi çarpan bir program yazınız.
    public static int[][] matrisCarpma( int[][] a, int[][] b ) {
        int[] kontrol = new int[]{a.length, b.length};
        int num1 = a.length;
        int num2 = b[0].length;
        int[][] numLength = new int[num1][num2];
        for (int c = 0; c < kontrol.length; c++) {
            for (int i = 0; i < num1; i++) {
                for (int j = 0; j < num2; j++) {
                    numLength[i][j] += a[j][c] * b[c][i];
                }
            }
        }
        return numLength;
    }


    // 8- Java'da bir karakter dizisindeki kelimelerin uzunluklarını bir diziye kaydeden bir program yazınız.
    public static int[] kelimeUzunluklariHesapla( String cumle ) {
        String[] kelimeler = cumle.split(" "); // Yöntem split(), dizeyi belirtilen normal ifadede böler ve bir alt dize dizisi döndürür.
        int[] uzunluklar = new int[kelimeler.length];

        for (int i = 0; i < kelimeler.length; i++) {
            uzunluklar[i] = kelimeler[i].length();
        }

        return uzunluklar;
    }

    // 9-Java'da bir metni belirli bir uzunluktan sonra kesen bir fonksiyon yazınız. Örneğin, bir metni 10 karakterden sonra keserek "..." ekleyen bir fonksiyon.
    public static String metniBelirliUzunluktanSonraKes(String metin,int uzunluk ){
        if (metin.length()<=uzunluk){
            return metin;
        } else {
           return metin.substring(0,uzunluk)+"...";
        }
    }

    public static void main( String[] args ) {
        System.out.println("1. soru");
        String kelime = " Java'da bir metindeki her kelimenin ilk harfini büyük yapacak bir fonksiyon yazınız. ";
        System.out.println(ilkHarfiniBuyuk(kelime));
        System.out.println("\n");


        System.out.println("2. soru");
        String kelimeler = "merhaba dünya";
        System.out.println("Kelime sayısı => " + kelimeSaymaca(kelimeler));

        System.out.println("\n");


        System.out.println("3. soru");
        int sayi = 143;
        digitTotals(sayi);

        System.out.println("-------------------------");

        System.out.println("4 soru.");
        int[] numa = new int[]{1, 2, 3};
        int[] numb = new int[]{4, 5, 6};
        String birleitirme = Arrays.toString(birlestir(numa, numb));

        System.out.println("Birleitirilmiş dize : " + birleitirme);


        System.out.println("----------------------------------");


        System.out.println("5. soru");
        String palindrimlar = "ada";
        palindrom(palindrimlar);
        System.out.println("'" + palindrimlar + "' Is the word a palindrome =>  " + palindrom(palindrimlar));


        System.out.println("----------------------------------");


        System.out.println("6");
        int sayii = 12;
        findPositiveMultipliers(sayii);
        System.out.println("----------------------------------");


        System.out.println("7 soru");
        int[][] num1 = {{1, 2},
                {3, 4}};

        int[][] num2 = {{5, 6},
                {7, 8}};
        int[][] islem = matrisCarpma(num1, num2);
        for (int i = 0; i < islem.length; i++) {
            for (int j = 0; j < islem[0].length; j++) {
                System.out.print(islem[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");
        String cumle = "bu bir örnek metindir";
        System.out.println("8 soru");
        int[] uzunluklar=kelimeUzunluklariHesapla(cumle);
        System.out.println("kelime uzunlukları :"+Arrays.toString(uzunluklar));

        System.out.println("----------------------------------");
        System.out.println("9. soru");
        String metin="bu bir metindir ve belirli bir uzunluktan sonra kesilecektir";
        String newMetin=metniBelirliUzunluktanSonraKes(metin,60);
        System.out.println(newMetin);
    }
}
