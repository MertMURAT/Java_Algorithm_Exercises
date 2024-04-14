package soru_5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DiziSayiTekrar {
    
    public static void main(String[] args) {
        TekrarKontrol(new int[]{1, 4, 5, 6, 1, 1, 4, 8});
    }

    public static void TekrarKontrol(int[] sayilar){
        int sayac = 0;
        Map<Integer, Integer> sayiMap = new HashMap<>();

        Set<Integer> sayiSet = new HashSet<>();
        for (Integer sayi : sayilar) {
            sayiSet.add(sayi);
            System.out.println(sayiSet);
        }

        for (int sayi : sayiSet) {
            
            for (int j = 0; j < sayilar.length; j++) {
                if(sayilar[j] == sayi){
                    sayac++;
                }
            }
            System.out.println(sayi + " sayisi dizide " + sayac + " kere tekrar etmiştir.");
            sayiMap.put(sayi, sayac);  
            sayac = 0;
            
        }

        for (Map.Entry<Integer, Integer> entry : sayiMap.entrySet()) {
            System.out.println("key " + entry.getKey() + " Value " + entry.getValue());
        }

        if(sayiMap.get(1) > sayiMap.get(4)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
