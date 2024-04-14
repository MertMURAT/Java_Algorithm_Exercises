package soru_7;

import java.util.Random;
import java.util.Scanner;


public class TasKagitMakas{
    

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int kullaniciSkor = 0;
        int botSkor = 0;
   
        System.out.println("TAŞ - KAĞIT - MAKAS OYUNUNA HOŞ GELDİNİZ!");
        
        while(true){

        System.out.println("Taş, Kağıt, Makas? (Taş/T, Kağıt/K, Makas/M): ");
        System.out.println("(Çıkmak için 0 yazınız.)");

        System.out.print("Lütfen bir seçim yapınız : ");
        String secim = sc.nextLine();
        sc.close();
        if(secim.equals("0")){
            break;
        }

        int rastgeleSayi = random.nextInt(3);
        String botSecim = "";
      
        switch(rastgeleSayi){
            case 0:
                botSecim = "T";
                System.out.println("Botun seçimi : TAŞ");
                break;
            case 1:
                botSecim = "K";
                System.out.println("Botun seçimi : KAĞIT");
                break;
            case 2:
                botSecim = "M";
                System.out.println("Botun seçimi : MAKAS");
                break;
        }
        

        if(secim.equals(botSecim)){
            System.out.println("BERABERE");
        }
        else if(secim.equals("K") && botSecim.equals("T") ||
                secim.equals("M") && botSecim.equals("K") ||
                secim.equals("T") && botSecim.equals("M") )
        {
            System.out.println("TEBRİKLER KAZANDINIZ!");
            kullaniciSkor++;
        }else{
            System.out.println("BOT KAZANDI!!");
            botSkor++;
        }

        System.out.println("KULLANICI SKOR : " + kullaniciSkor);
        System.out.println("bOT SKOR : " + botSkor);

    }
    }
}

