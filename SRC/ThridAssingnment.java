package SRC;

import java.util.Arrays;

public class ThridAssingnment {
    public static String kelimedeMax( String[] kelimeler ) {
        String maximumSentence = "";
        String[] var2 = kelimeler;
        int var3 = kelimeler.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            String word = var2[var4];
            if (word.length() > maximumSentence.length()) {
                maximumSentence = word;
            }
        }

        return maximumSentence;
    }

    public static int sumOfDigits( int sayi ) {
        int toplam;
        for (toplam = 0; sayi != 0; sayi /= 10) {
            toplam += sayi % 10;
        }

        return toplam;
    }

    public static int numberOfVowels( String kelime ) {
        int start = 0;
        kelime.toLowerCase();

        for (int i = 0; i < kelime.length(); ++i) {
            char c = kelime.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ++start;
            }
        }

        return start;
    }

    public static int takeReverse( int sayi ) {
        int tersSayi;
        for (tersSayi = 0; sayi != 0; sayi /= 10) {
            tersSayi = tersSayi * 10 + sayi % 10;
        }

        return tersSayi;
    }

    public static int[] sayiBirlestirme( int[] dize1, int[] dize2 ) {
        int birlesikuzunluk = dize1.length + dize2.length;
        int[] birlesikDizi = new int[birlesikuzunluk];
        System.arraycopy(dize1, 0, birlesikDizi, 0, dize1.length);
        System.arraycopy(dize2, 0, birlesikDizi, dize1.length, dize2.length);
        return birlesikDizi;
    }

    public static String[] metniBol( String metin, char ayirici ) {
        String[] pieces = metin.split(String.valueOf(ayirici));
        return pieces;
    }

    public static void main( String[] args ) {
        System.out.println("1. ÖDEV:");
        String[] kelimeler = new String[]{"ikizler", "üçüz", "dördüzler"};
        System.out.println(kelimedeMax(kelimeler));

        System.out.println("-------------------------------------------------");

        System.out.println("2.ÖDEV:");
        System.out.println(sumOfDigits(1020));

        System.out.println("-------------------------------------------------");

        System.out.println("3.ÖDEV:");
        System.out.println(numberOfVowels("Merhaba ismi ne"));

        System.out.println("-------------------------------------------------");

        System.out.println("4.Ödev:");
        int sayi = 123456;
        int tersi = takeReverse(sayi);
        System.out.println("orjinal hali => " + sayi);
        System.out.println("tersine cevrilmiş hali => " + tersi);

        System.out.println("-------------------------------------------------");

        System.out.println("5.Ödev:");
        int[] sayi1 = new int[]{1, 2, 3, 4};
        int[] sayi2 = new int[]{5, 6, 7, 8};
        int[] birlestir = sayiBirlestirme(sayi1, sayi2);
        System.out.println("Birleştirilmiş dize => " + Arrays.toString(birlestir));
        System.out.println("1. nin eski halleri => " + sayi1.length + ",  2.nin eski hali => " + sayi2.length);
        System.out.println("Yeni halleri => " + birlestir.length);




        System.out.println("6. ödev");
        String metin = "Bu, bir, örnek, metindir.";
        char delimitercharacter = ',';
        String[] result = metniBol(metin, delimitercharacter);
        System.out.println("Bölünmüş Metin Parçaları:");
        String[] var10 = result;
        int var11 = result.length;

        for (int var12 = 0; var12 < var11; ++var12) {
            String bolunmus = var10[var12];
            System.out.println(bolunmus.trim());
        }

    }
}

