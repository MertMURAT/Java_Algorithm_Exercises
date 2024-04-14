package soru_6;

import java.util.Scanner;

public class Uygulama {

        private Scanner scanner;
    
        public Uygulama(){
            this.scanner = new Scanner(System.in);
        }
    
        public void uygulama() {
            while (true) {
                menu();
                int secim = islemSec();
                
                switch (secim) {
                    case 1:
                        toplama();
                        break;
                    case 2:
                        cikarma();
                        break;
                    case 3:
                        carpma();
                        break;
                    case 4:
                        bolme();
                        break;
                    case 0:
                        System.out.println("Programdan çıkılıyor...");
                        return;
                    default:
                        System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                }
            }
        }
    
        private void menu() {
            System.out.println("**** Hesap Makinesi ****");
            System.out.println("1- Toplama");
            System.out.println("2- Çıkarma");
            System.out.println("3- Çarpma");
            System.out.println("4- Bölme");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminiz: ");
        }
    
        private int islemSec() {
            int secim;
            while (true) {
                try {
                    secim = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Geçersiz giriş. Lütfen bir sayı girin.");
                }
            }
            return secim;
        }
    
        private void toplama() {
            double toplam = 0;
            while (true) {
                System.out.print("Toplanacak sayıyı girin (Bitirmek için '=' yazın): ");
                String input = scanner.nextLine();
                if (input.equals("=")) {
                    break;
                }
                if (SayiKontrol.IsNumeric(input)) {
                    toplam += Double.parseDouble(input);
                } else {
                    System.out.println("Geçersiz giriş. Lütfen bir sayı girin.");
                }
            }
            System.out.println("Toplam: " + toplam);
            System.out.println("------------------------");
        }
    
        private void cikarma() {
            double fark = 0;
            boolean ilkSayi = true;
            while (true) {
                System.out.print((ilkSayi ? "Çıkarılacak" : "Çıkarılacak diğer") + " sayıyı girin (Bitirmek için '=' yazın): ");
                String input = scanner.nextLine();
                if (input.equals("=")) {
                    break;
                }
                if (SayiKontrol.IsNumeric(input)) {
                    if (ilkSayi) {
                        fark = Double.parseDouble(input);
                        ilkSayi = false;
                    } else {
                        fark -= Double.parseDouble(input);
                    }
                } else {
                    System.out.println("Geçersiz giriş. Lütfen bir sayı girin.");
                }
            }
            System.out.println("Fark: " + fark);
        }
        
        private void carpma() {
            double carpim = 1;
            while (true) {
                System.out.print("Çarpılacak sayıyı girin (Bitirmek için '=' yazın): ");
                String input = scanner.nextLine();
                if (input.equals("=")) {
                    break;
                }
                if (SayiKontrol.IsNumeric(input)) {
                    carpim *= Double.parseDouble(input);
                } else {
                    System.out.println("Geçersiz giriş. Lütfen bir sayı girin.");
                }
            }
            System.out.println("Çarpım: " + carpim);
        }
        
        private void bolme() {
            double bolum = 0;
            boolean ilkSayi = true;
            while (true) {
                System.out.print((ilkSayi ? "Bölünecek" : "Bölücü") + " sayıyı girin (Bitirmek için '=' yazın): ");
                String input = scanner.nextLine();
                if (input.equals("=")) {
                    break;
                }
                if (SayiKontrol.IsNumeric(input)) {
                    if (ilkSayi) {
                        bolum = Double.parseDouble(input);
                        ilkSayi = false;
                    } else {
                        double bolen = Double.parseDouble(input);
                        if (bolen != 0) {
                            bolum /= bolen;
                        } else {
                            System.out.println("Bölme işlemi sıfıra bölünemez. Lütfen farklı bir sayı girin.");
                        }
                    }
                } else {
                    System.out.println("Geçersiz giriş. Lütfen bir sayı girin.");
                }
            }
            System.out.println("Bölüm: " + bolum);
        }
        
    
        
    }
    
