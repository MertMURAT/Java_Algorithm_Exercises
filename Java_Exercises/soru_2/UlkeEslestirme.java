package soru_2;

import java.util.Scanner;

public class UlkeEslestirme {
    public static void main(String[] args) {
        // UlkeEs();
    }

    public static void UlkeEs() {
        String ulkeIn;
        String ulke[] = {"Turkiye", "Japonya", "Mogolistan", "Amerika", "Rusya", "Cin"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir ülke adı giriniz : ");
        ulkeIn = sc.nextLine();
        sc.close();

        boolean eslesti = false;
        for (String ulkeCount : ulke) {
            if ((ulkeCount).equalsIgnoreCase(ulkeIn)) {
                System.out.println(ulkeIn + " Listedeki ülkeler arasında yer alıyor.");
                eslesti = true;
                break;
            }
        }
        
        if (!eslesti) {
            System.out.println(ulkeIn + " Listede yer almıyor.");
        }
    }
}
