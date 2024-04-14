package soru_3;

public class BuyukSayi {


    public static void main(String[] args) {
        BuyukSayiBul(new int[] {120, 130, 125, -256, 16, 1300, 1258, 81, 14});
    }

    public static void BuyukSayiBul(int[] sayilar){
        int buyuk = Integer.MIN_VALUE;
        int kucuk = Integer.MAX_VALUE;
        int ikinciBuyuk = Integer.MIN_VALUE;

        for (int i = 0; i < sayilar.length; i++) {
           if(sayilar[i] > buyuk){
                buyuk = sayilar[i];
           }
           if(sayilar[i] < kucuk){
            kucuk = sayilar[i];
           }
           if(sayilar[i] > ikinciBuyuk && sayilar[i] != buyuk){
            ikinciBuyuk = sayilar[i];
           }
        }

        System.out.println("En büyük sayı " + buyuk +
                            "\nİkinci en büyük sayi " + ikinciBuyuk +
                            "\nEn küçük sayi " + kucuk);
    }
}
