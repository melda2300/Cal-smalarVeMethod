import java.util.Arrays;
public class ThirdAssignment {
    // Soru 1: Java'da bir karakter dizisindeki en uzun kelimeyi bulan bir fonksiyon yazınız.
    public static String kelimedeMax( String[] kelimeler ) {
        String maximumSentence = "";
        for (String word : kelimeler) {
            if (word.length() > maximumSentence.length()) {
                maximumSentence = word;
            }
        }
        return maximumSentence;
    }

    // Soru 2: Java'da bir tamsayının rakamları toplamını hesaplayan bir fonksiyon yazınız.
    public static int sumOfDigits( int sayi ) {
        int toplam = 0; // 123
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10; // 12
        }

        return toplam;
    }


    // Soru 3: Java'da bir karakter dizisindeki sesli harfleri sayan bir fonksiyon yazınız.
    public static int numberOfVowels( String kelime ) {
        int start = 0;
        /*String sesliHarfler = "a,e,ı,o,u,A,E,I,O,U ";
        for (char karakter : harf.toCharArray()) {
            if (sesliHarfler.indexOf(karakter) != 1) {
                start++;
            }
        }
         */
        kelime.toLowerCase();
        for (int i = 0; i < kelime.length(); i++) {
            char c = kelime.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                start++;

            }
        }
        return start;
    }

    public static int takeReverse( int sayi ) {
        int tersSayi = 0;
        while (sayi != 0) {
            tersSayi = tersSayi * 10 + sayi % 10;
            sayi /= 10;

        }
        return tersSayi;
    }

    public static int[] sayiBirlestirme( int[] dize1, int[] dize2 ) {
        int birlesikuzunluk = dize1.length + dize2.length;
        int[] birlesikDizi = new int[birlesikuzunluk];

        System.arraycopy(dize1,0,birlesikDizi,0,dize1.length);
        System.arraycopy(dize2,0,birlesikDizi,dize1.length,dize2.length);

        return birlesikDizi;
    }
    public static String[] metniBol(String metin, char ayirici) {

        String[] pieces = metin.split(String.valueOf(ayirici));

        return pieces;
    }


    public static void main( String[] args ) {
        System.out.println("1. ÖDEV:");
        String[] kelimeler = {"ikizler", "üçüz", "dördüzler"};
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
        int[] sayi1 = {1, 2, 3, 4};
        int[] sayi2 = {5, 6, 7, 8};

        int[] birlestir = sayiBirlestirme(sayi1, sayi2);
        System.out.println("Birleştirilmiş dize => " + Arrays.toString(birlestir));

        System.out.println("1. nin eski halleri => " + sayi1.length + ",  2.nin eski hali => " + sayi2.length);
        System.out.println("Yeni halleri => " + birlestir.length);


        System.out.println("6. ödev");
        String metin = "Bu, bir, örnek, metindir.";
        char delimitercharacter = ',';

        String[] result=metniBol(metin,delimitercharacter);

        System.out.println("Bölünmüş Metin Parçaları:");
        for (String bolunmus:result) {
            System.out.println(bolunmus.trim());

            
        }


    }

}

