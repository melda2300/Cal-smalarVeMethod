
public class SecondHomework {
    public static int toplama( int[] dizi ) {
        //1. soru
        int sayi = 0;
        for (int a = 0; a < dizi.length; a++) {
            sayi += dizi[a];
        }
        return sayi;
    }
    public static void tersSayi(){

    }

    public static void main( String[] args ) {
        int[] liste = {2, 4, 7, 8, 0};
        int toplama = toplama(liste);
        System.out.println("Listenin toplamı => "+toplama);
    }

}