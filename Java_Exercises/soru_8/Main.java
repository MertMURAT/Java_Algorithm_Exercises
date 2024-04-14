package soru_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        Uygulama uygulama = new Uygulama(database);

        int secim;
        
        do {
            uygulama.Menu();
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            // scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("İsim: ");
                    String isim = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Şifre: ");
                    String sifre = scanner.nextLine();
                    uygulama.KullaniciOlustur(id, isim, email, sifre);
                    break;
                case 2:
                    System.out.println("Kullanıcılar:");
                    database.KullaniciListele();
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        } while (secim != 3);

        scanner.close();
    }
    }

