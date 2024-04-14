package soru_4;

import java.util.Scanner;

public class ArdArdaSayilar{
    public static void main(String[] args) {
        ArdArda();
    }

    public static void ArdArda(){
        int sayilar[] = {2, -256, 2, 1258, 1258, 3};
        int number;
        boolean eslesti = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz : ");
        number = sc.nextInt();
        sc.close();

        for (int i = 0; i < sayilar.length; i++) {

           if(sayilar[i] == number){
                if(sayilar[i] == sayilar[i + 1]){
                    System.out.println("Girilen sayi listede ard arda yer alıyor.");
                    eslesti = true;
                    break;
                }

            }
           }

        if(!eslesti)
            System.out.println("Girilen Sayi listede ard arda tekrar etmiyor.");
    }
}